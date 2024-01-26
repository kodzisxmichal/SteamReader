package pjatk.edu.pl.SRData.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pjatk.edu.pl.SRData.model.Friend;
import pjatk.edu.pl.SRData.services.FriendService;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/friends")
public class FriendController {

    private final FriendService friendService;
    @GetMapping("/steamID/{steamID}")
    public ResponseEntity<List<Friend>> getFriends(@PathVariable Long steamID){
        log.info("Looking for friends of player with steamID:" + steamID);
        List<Friend> friends = friendService.findAllByPlayerParentSteamID(steamID);
        log.info("Success");

        return new ResponseEntity<>(friends, HttpStatus.OK);
    }
}
