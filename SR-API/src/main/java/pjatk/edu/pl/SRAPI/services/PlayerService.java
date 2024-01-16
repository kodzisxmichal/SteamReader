package pjatk.edu.pl.SRAPI.services;

import org.springframework.stereotype.Service;
import pjatk.edu.pl.SRAPI.model.Player;
import pjatk.edu.pl.SRAPI.repositories.PlayerRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {
    PlayerRepository repository;

    public PlayerService(PlayerRepository playerRepository){

    }

    public Player findBySteamID(Long steamID){
        return repository.findById(steamID).orElseThrow();
    }

    public List<Player> findAll(){
        return repository.findAll();
    }

}
