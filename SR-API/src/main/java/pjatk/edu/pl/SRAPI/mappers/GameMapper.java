package pjatk.edu.pl.SRAPI.mappers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pjatk.edu.pl.SRAPI.contract.game.GameDTO;
import pjatk.edu.pl.SRAPI.model.Game;
import pjatk.edu.pl.SRAPI.repositories.ICatalogData;

@RequiredArgsConstructor
@Component
public class GameMapper  implements IMap<GameDTO, Game>{

    private final ICatalogData repository;
    @Override
    public Game map(GameDTO gameDTO, Long appID) {
        var game = repository.getGames().findById(appID).orElse(new Game());

        game.setAppID(gameDTO.getAppid());
        game.setName(gameDTO.getName());

        return game;
    }
}
