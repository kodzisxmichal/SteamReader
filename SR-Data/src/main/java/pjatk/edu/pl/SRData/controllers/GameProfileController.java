package pjatk.edu.pl.SRData.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pjatk.edu.pl.SRData.model.GameProfile;
import pjatk.edu.pl.SRData.model.Player;
import pjatk.edu.pl.SRData.services.GameProfileService;


import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/gameProfiles")
public class GameProfileController {

    private final GameProfileService gameProfileService;

    @GetMapping("/steamid/{steamID}")
    public List<GameProfile> findAllByPlayerSteamID(@PathVariable Long steamID){
        return gameProfileService.findAllByPlayerSteamID(steamID);
    }
    @GetMapping
    public List<GameProfile> getGameProfiles(){
        return gameProfileService.findAll();
    }
}
