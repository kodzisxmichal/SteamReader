package pjatk.edu.pl.SRAPI.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pjatk.edu.pl.SRAPI.model.Friend;
import pjatk.edu.pl.SRAPI.model.Game;
import pjatk.edu.pl.SRAPI.services.FriendService;
import pjatk.edu.pl.SRAPI.services.GameService;

import java.util.List;

@RestController
@RequestMapping("/friends")
public class FriendController {
    private final FriendService friendService;

    @Autowired
    public FriendController(FriendService friendService){
        this.friendService = friendService;
    }
    @GetMapping
    public List<Friend> getFriends(){
        return friendService.findAll();
    }
}
