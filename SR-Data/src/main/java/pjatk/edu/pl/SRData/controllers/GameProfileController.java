package pjatk.edu.pl.SRData.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pjatk.edu.pl.SRData.model.GameProfile;
import pjatk.edu.pl.SRData.services.GameProfileService;


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
