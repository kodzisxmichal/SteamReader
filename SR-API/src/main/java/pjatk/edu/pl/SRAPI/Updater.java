package pjatk.edu.pl.SRAPI;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import pjatk.edu.pl.SRAPI.contract.friend.FriendDTO;
import pjatk.edu.pl.SRAPI.contract.game.GameDTO;
import pjatk.edu.pl.SRAPI.contract.gameProfile.GameProfileDTO;
import pjatk.edu.pl.SRAPI.contract.player.PlayerDTO;
import pjatk.edu.pl.SRAPI.mappers.ICatalogMappers;
import pjatk.edu.pl.SRAPI.model.Player;
import pjatk.edu.pl.SRAPI.repositories.ICatalogData;

@Slf4j
@RequiredArgsConstructor
@Component
public class Updater {
    private final ICatalogData repository;
    private final ICatalogMappers mapper;
    private final IApiClient client;

    public void updateProfileInfo(Long steamID){
        log.info("Updating function called");
        savePlayer(steamID);
        saveFriends(steamID);
        saveGameProfiles(steamID);
    }

    private void savePlayer(Long steamID){
        log.info("Updating Player");
        client.getPlayers(steamID)
                .getBody()
                .getPlayersDTO()
                .getPlayerDTOS()
                .stream().map((PlayerDTO playerDTO) -> mapper.getPlayerMapper().map(playerDTO,steamID))
                .forEach(player->{repository.getPlayers().save(player);});
    }

    private void saveFriends(Long steamID){
        log.info("Updating Friends");
        client.getFriendList(steamID)
                .getBody()
                .getFriendsDTO()
                .stream().map((FriendDTO friendDTO) -> mapper.getFriendMapper().map(friendDTO,steamID))
                .forEach(friend->{
                    savePlayer(friend.getFriendSteamID());
                    repository.getFriends().save(friend);
                });
    }

    private void saveGames(){
        log.info("Updating Games");
        var gamesRepository = repository.getGames();
        client.getGameList()
                .getBody()
                .getGamesDTO()
                .getGameDTOS()
                .stream().map((GameDTO gameDTO) -> mapper.getGameMapper().map(gameDTO,gameDTO.getAppid()))
                .forEach(gamesRepository::save);
    }

    private void saveGameProfiles(Long steamID){
        log.info("Updating GameProfiles");
        client.getGameProfileList(steamID)
                .getBody()
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
