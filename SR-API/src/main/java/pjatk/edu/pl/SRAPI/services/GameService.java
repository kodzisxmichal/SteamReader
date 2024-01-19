package pjatk.edu.pl.SRAPI.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pjatk.edu.pl.SRAPI.model.Game;
import pjatk.edu.pl.SRAPI.repositories.GameRepository;
import pjatk.edu.pl.SRAPI.repositories.SRDataCatalog;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GameService {
    private final GameRepository gameRepository;

    public Game findByID(Long appID){
        return gameRepository.findById(appID).orElseThrow();
    }
    public List<Game> findAll(){
        return gameRepository.findAll();
    }
}
