package pjatk.edu.pl.SRAPI.services;

import org.springframework.stereotype.Service;
import pjatk.edu.pl.SRAPI.model.Game;
import pjatk.edu.pl.SRAPI.repositories.GameRepository;

import java.util.List;

@Service
public class GameService {
    GameRepository repository;

    public GameService(GameRepository gameRepository){
        this.repository = gameRepository;
    }

    public List<Game> findAll(){
        return repository.findAll();
    }
}
