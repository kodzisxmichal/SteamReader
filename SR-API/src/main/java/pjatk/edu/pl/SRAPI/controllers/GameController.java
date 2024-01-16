package pjatk.edu.pl.SRAPI.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pjatk.edu.pl.SRAPI.model.Game;
import pjatk.edu.pl.SRAPI.model.GameProfile;
import pjatk.edu.pl.SRAPI.services.GameProfileService;
import pjatk.edu.pl.SRAPI.services.GameService;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {
    private final GameService gameService;

    @Autowired
    public GameController(GameService gameService){
        this.gameService = gameService;
    }
    @GetMapping
    public List<Game> getGames(){
        return gameService.findAll();
    }
}
