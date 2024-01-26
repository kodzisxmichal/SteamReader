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
import pjatk.edu.pl.SRData.model.GameProfile;
import pjatk.edu.pl.SRData.model.Player;
import pjatk.edu.pl.SRData.services.GameProfileService;


import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/gameProfiles")
public class GameProfileController {

    private final GameProfileService gameProfileService;

    @GetMapping("/steamid/{steamID}")
    public ResponseEntity<List<GameProfile>> findAllByPlayerSteamID(@PathVariable Long steamID){
        log.info("Looking for game profiles of player with steamID:" + steamID);
        List<GameProfile> response = gameProfileService.findAllByPlayerSteamID(steamID);
        log.info("Success");

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<GameProfile>> getGameProfiles(){
        List<GameProfile> gameProfiles = gameProfileService.findAll();

        return new ResponseEntity<>(gameProfiles, HttpStatus.OK);
    }
}
