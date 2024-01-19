package pjatk.edu.pl.SRAPI.updater;

import org.springframework.stereotype.Component;
import pjatk.edu.pl.SRAPI.contract.gameProfile.GameProfileDTO;
import pjatk.edu.pl.SRAPI.model.GameProfile;

@Component
public class GameProfileMapper implements IMap<GameProfileDTO, GameProfile>{
    @Override
    public GameProfile map(GameProfileDTO gameProfileDTO) {
        var gameProfile = new GameProfile();

        gameProfile.setTotalPlaytime(gameProfileDTO.getPlayTimeForever());
        gameProfile.setPlayTimeDisconnected(gameProfileDTO.getPlayTimeDisconnected());
        gameProfile.setLastTimePlayed(gameProfileDTO.getRtimeLastTimePlayed());
        gameProfile.setAppID(gameProfileDTO.getAppid());

        return gameProfile;
    }
}
