package pjatk.edu.pl.SRAPI.updater;

import org.springframework.stereotype.Component;
import pjatk.edu.pl.SRAPI.contract.game.GameDTO;
import pjatk.edu.pl.SRAPI.contract.game.GamesDTO;
import pjatk.edu.pl.SRAPI.contract.gameProfile.GameProfileDTO;
import pjatk.edu.pl.SRAPI.model.Game;
import pjatk.edu.pl.SRAPI.model.GameProfile;

@Component
public class GameMapper  implements IMap<GameDTO, Game>{

    @Override
    public Game map(GameDTO gameDTO) {
        var game = new Game();

        game.setAppID((long) gameDTO.getAppid());
        game.setName(gameDTO.getName());

        return game;
    }
}
