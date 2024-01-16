package pjatk.edu.pl.SRAPI.services;

import org.springframework.stereotype.Service;
import pjatk.edu.pl.SRAPI.model.Game;
import pjatk.edu.pl.SRAPI.model.GameProfile;
import pjatk.edu.pl.SRAPI.repositories.GameProfileRepository;
import pjatk.edu.pl.SRAPI.repositories.GameRepository;

import java.util.List;

@Service
public class GameProfileService {
    GameProfileRepository repository;

    public GameProfileService(GameProfileRepository gameProfileRepository){
        this.repository = gameProfileRepository;
    }

    public List<GameProfile> findAll(){
        return repository.findAll();
    }
}
