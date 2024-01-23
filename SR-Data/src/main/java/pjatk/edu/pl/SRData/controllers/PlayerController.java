package pjatk.edu.pl.SRData.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pjatk.edu.pl.SRData.model.Player;
import pjatk.edu.pl.SRData.services.PlayerService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/players")
public class PlayerController {

    private final PlayerService playerService;

    @GetMapping("/steamid/{steamID}")
    public Player findBySteamID(@PathVariable Long steamID){
        return playerService.findBySteamID(steamID);
    }

    @GetMapping
    public List<Player> findAll(){
        return playerService.findAll();
    }

}