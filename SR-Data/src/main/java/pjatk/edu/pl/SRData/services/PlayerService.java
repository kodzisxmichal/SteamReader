package pjatk.edu.pl.SRData.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pjatk.edu.pl.SRData.model.Player;
import pjatk.edu.pl.SRData.repositories.PlayerRepository;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class PlayerService {
    private final PlayerRepository playerRepository;
    private final APIService apiService;

    public Player findBySteamID(Long steamID){
        apiService.callUpdate(steamID);
        log.info("Called Update");
        return playerRepository.findById(steamID).orElseThrow();
    }

    public List<Player> findAll(){
        return playerRepository.findAll();
    }

}
