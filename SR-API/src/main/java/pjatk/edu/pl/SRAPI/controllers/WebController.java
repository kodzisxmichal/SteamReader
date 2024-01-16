package pjatk.edu.pl.SRAPI.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import pjatk.edu.pl.SRAPI.services.PlayerService;

@Controller
public class WebController {
    private final PlayerService playerService;

    public WebController(PlayerService playerService){
        this.playerService = playerService;
    }

//    @GetMapping(value = "/welcome")
//    public String getWelcomeView(){return "welcome";}
}
