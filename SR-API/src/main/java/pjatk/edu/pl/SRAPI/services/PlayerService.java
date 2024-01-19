package pjatk.edu.pl.SRAPI.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pjatk.edu.pl.SRAPI.model.Player;
import pjatk.edu.pl.SRAPI.repositories.PlayerRepository;
import pjatk.edu.pl.SRAPI.repositories.SRDataCatalog;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PlayerService {
    private final PlayerRepository playerRepository;

    public Player findBySteamID(Long steamID){
        return playerRepository.findById(steamID).orElseThrow();
    }

    public List<Player> findAll(){
        return playerRepository.findAll();
    }

}
