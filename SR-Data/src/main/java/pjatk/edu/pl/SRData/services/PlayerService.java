package pjatk.edu.pl.SRData.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pjatk.edu.pl.SRData.model.Player;
import pjatk.edu.pl.SRData.repositories.PlayerRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayerService {
    private final PlayerRepository playerRepository;
    private final APIService apiService;

    public Player findBySteamID(Long steamID){
        apiService.callUpdate(steamID);
        System.out.println("DDDDD");
        return playerRepository.findById(steamID).orElseThrow();
    }

    public List<Player> findAll(){
        return playerRepository.findAll();
    }

}
