package pjatk.edu.pl.SRAPI.mappers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pjatk.edu.pl.SRAPI.contract.gameProfile.GameProfileDTO;
import pjatk.edu.pl.SRAPI.model.Game;
import pjatk.edu.pl.SRAPI.model.GameProfile;
import pjatk.edu.pl.SRAPI.repositories.ICatalogData;
import pjatk.edu.pl.SRAPI.repositories.SRDataCatalog;

@RequiredArgsConstructor
@Component
public class GameProfileMapper implements IMap<GameProfileDTO, GameProfile>{

    private final ICatalogData repository;

    @Override
    public GameProfile map(GameProfileDTO gameProfileDTO, Long steamID) {

        var gameNull = new Game();
        gameNull.setName("Do not exist");
        gameNull.setAppID(999999L);

        var gameProfile = repository.getGameProfiles().findByPlayerSteamIDAndAppID(steamID, gameProfileDTO.getAppid()).orElse(new GameProfile());
        gameProfile.setPlayer(repository.getPlayers().findById(steamID).orElseThrow());
        gameProfile.setTotalPlaytime(gameProfileDTO.getPlayTimeForever());
        gameProfile.setPlayTimeDisconnected(gameProfileDTO.getPlayTimeDisconnected());
        gameProfile.setLastTimePlayed(gameProfileDTO.getRtimeLastTimePlayed());
        gameProfile.setAppID(gameProfileDTO.getAppid());
        var game = repository.getGames().findByAppID(gameProfile.getAppID()).orElse(gameNull);
        gameProfile.setAppName(game.getName());

        return gameProfile;
    }
}
