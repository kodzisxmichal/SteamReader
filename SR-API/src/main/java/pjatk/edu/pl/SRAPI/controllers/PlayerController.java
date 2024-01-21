package pjatk.edu.pl.SRAPI.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pjatk.edu.pl.SRAPI.model.Player;
import pjatk.edu.pl.SRAPI.services.PlayerService;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {
    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService){
        this.playerService = playerService;
    }

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to the steam reader";
    }

    @GetMapping("/steamid/{steamID}")
    public Player findBySteamID(@PathVariable Long steamID){
        return playerService.findBySteamID(steamID);
    }

    @GetMapping
    public List<Player> findAll(){
        return playerService.findAll();
    }

}
