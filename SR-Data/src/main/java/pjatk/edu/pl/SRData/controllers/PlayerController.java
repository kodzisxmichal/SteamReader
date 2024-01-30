package pjatk.edu.pl.SRData.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pjatk.edu.pl.SRData.model.Player;
import pjatk.edu.pl.SRData.services.PlayerService;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/players")
public class PlayerController {

    private final PlayerService playerService;

    @GetMapping("/steamid/{steamID}")
    public ResponseEntity<Player> findBySteamID(@PathVariable Long steamID){
        log.info("Looking for player with steamID:" + steamID);
        Player player = playerService.findBySteamID(steamID);

        log.info("Success");
        return new ResponseEntity<>(player, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Player>> findAll(){
        List<Player> players = playerService.findAll();

        return new ResponseEntity<>(players, HttpStatus.OK);
    }

}
