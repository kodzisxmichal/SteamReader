package pjatk.edu.pl.SRData.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pjatk.edu.pl.SRData.exceptions.player.PlayerNotFoundException;
import pjatk.edu.pl.SRData.model.Player;
import pjatk.edu.pl.SRData.repositories.PlayerRepository;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class PlayerService {
    private final PlayerRepository playerRepository;
    private final APIService apiService;

    public Player findBySteamID(Long steamID){
        log.info("Service looking for player");
        Optional<Player> player = playerRepository.findById(steamID);
//        if(player.isEmpty() || player.get().getRealName()==null){
//            log.info("Called Update - Fetching player from API");
//            apiService.callUpdate(steamID);
//        }
        apiService.callUpdate(steamID);

        return player.orElseThrow(PlayerNotFoundException::new);
    }

    public List<Player> findAll(){
        return playerRepository.findAll();
    }

}
