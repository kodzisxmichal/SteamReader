package pjatk.edu.pl.SRData.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pjatk.edu.pl.SRData.model.Game;
import pjatk.edu.pl.SRData.repositories.GameRepository;

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
