package pjatk.edu.pl.SRAPI.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pjatk.edu.pl.SRAPI.model.Achievement;
import pjatk.edu.pl.SRAPI.model.Friend;
import pjatk.edu.pl.SRAPI.services.AchievementService;
import pjatk.edu.pl.SRAPI.services.FriendService;

import java.util.List;

@RestController
@RequestMapping("/achievements")
public class AchievementController {
    private final AchievementService achievementService;

    @Autowired
    public AchievementController(AchievementService achievementService){
        this.achievementService = achievementService;
    }
    @GetMapping
    public List<Achievement> getAchievements(){
        return achievementService.findAll();
    }
}
