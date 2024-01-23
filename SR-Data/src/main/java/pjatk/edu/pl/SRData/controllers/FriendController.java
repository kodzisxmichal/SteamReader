package pjatk.edu.pl.SRData.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pjatk.edu.pl.SRData.model.Friend;
import pjatk.edu.pl.SRData.services.FriendService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/friends")
public class FriendController {

    private final FriendService friendService;
    @GetMapping
    public List<Friend> getFriends(){
        return friendService.findAll();
    }
}
