package pjatk.edu.pl.SRWeb;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pjatk.edu.pl.SRWeb.services.PlayerService;

@RequiredArgsConstructor
@Controller
public class WebController {

    private final PlayerService service;

    @GetMapping(value="/welcome")
    public String getWelcomeView(){
        return "welcome";
    }

    @GetMapping(value = "/player/{steamID}")
    public String getPlayer(@PathVariable Long steamID,Model model){
        model.addAttribute("player",service.findBySteamID(steamID));
        return "playerProfile";
    }
    @GetMapping(value="/players")
    public String findAll(Model model){
        model.addAttribute("players",service.findAll());
        return "playerProfile";
    }
}
