package pjatk.edu.pl.SRAPI;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pjatk.edu.pl.SRAPI.contract.friend.FriendDTO;
import pjatk.edu.pl.SRAPI.contract.game.GameDTO;
import pjatk.edu.pl.SRAPI.contract.gameProfile.GameProfileDTO;
import pjatk.edu.pl.SRAPI.contract.player.PlayerDTO;
import pjatk.edu.pl.SRAPI.mappers.ICatalogMappers;
import pjatk.edu.pl.SRAPI.repositories.ICatalogData;

@RequiredArgsConstructor
@Component
public class Updater implements IUpdate{
    private final ICatalogData repository;
    private final ICatalogMappers mapper;
    private final IApiClient client;

    public void updateProfileInfo(Long steamID){
        savePlayer(steamID);
        saveFriends(steamID);
        saveGameProfiles(steamID);
    }

    private void savePlayer(Long steamID){
        client.getPlayers(steamID)
                .getPlayersDTO()
                .getPlayerDTOS()
                .stream().map((PlayerDTO playerDTO) -> mapper.getPlayerMapper().map(playerDTO,steamID))
                .forEach(player->{repository.getPlayers().save(player);});
    }

    private void saveFriends(Long steamID){
        client.getFriendList(steamID)
                .getFriendsDTO()
                .stream().map((FriendDTO friendDTO) -> mapper.getFriendMapper().map(friendDTO,steamID))
                .forEach(friend->repository.getFriends().save(friend));
    }

    private void saveGames(Long steamID){
        client.getGameList()
                .getFriendsListDTO()
                .getGameDTOS()
                .stream().map((GameDTO gameDTO) -> mapper.getGameMapper().map(gameDTO,steamID))
                .forEach(game -> repository.getGames().save(game));
    }

    private void saveGameProfiles(Long steamID){
        client.getGameProfileList(steamID)
                .getGameDTOS()
                .stream().map((GameProfileDTO gameProfileDTO) -> mapper.getGameProfileMapper().map(gameProfileDTO,steamID))
                .forEach(gameProfile -> {
                    repository.getGameProfiles().save(gameProfile);

//					List<AchievementDTO> Achievements = client.getAchievements(steamid, gameProfile.getAppID()).getAchievements();
//
//					if (Achievements!=null) {
//						Achievements
//								.stream()
//								.map(mapper.getAchievementMapper()::map)
//								.forEach(achievement -> {
//									if (gameProfile.getID() != null) {
//										achievement.setGameProfile(repository.getGameProfiles().findById(gameProfile.getID()).orElseThrow());
//										repository.getAchievements().save(achievement);
//									}
//								});
//					}


                });
    }

}
