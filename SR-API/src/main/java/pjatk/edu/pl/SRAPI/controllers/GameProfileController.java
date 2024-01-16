package pjatk.edu.pl.SRAPI.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pjatk.edu.pl.SRAPI.model.GameProfile;
import pjatk.edu.pl.SRAPI.model.Player;
import pjatk.edu.pl.SRAPI.services.GameProfileService;
import pjatk.edu.pl.SRAPI.services.PlayerService;

import java.util.List;

@RestController
@RequestMapping("/gameProfiles")
public class GameProfileController {

    private final GameProfileService gameProfileService;

    @Autowired
    public GameProfileController(GameProfileService gameProfileService){
        this.gameProfileService = gameProfileService;
    }
    @GetMapping
    public List<GameProfile> getGameProfiles(){
        return gameProfileService.findAll();
    }
}
