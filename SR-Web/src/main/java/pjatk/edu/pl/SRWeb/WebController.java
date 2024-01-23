package pjatk.edu.pl.SRWeb;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pjatk.edu.pl.SRWeb.services.PlayerService;
import pjatk.edu.pl.SRWeb.services.SRServiceCatalog;

@Slf4j
@RequiredArgsConstructor
@Controller
public class WebController {

    private final SRServiceCatalog service;

    @GetMapping(value="/welcome")
    public String getWelcomeView(){
        return "welcome";
    }

    @GetMapping()
    public String getMainPage(Model model){
        return "mainPage";
    }
    @PostMapping()
    public String getMainPage(@RequestParam Long steamID, Model model){
        if(steamID <10000000000000000L || steamID >=100000000000000000L) {
            model.addAttribute("Error Message", "SteamID must have 17 numbers");
            return "mainPage";
        }

        return "redirect:/player/search";
    }

    @GetMapping(value = "/player/search")
    public String getPlayer(@RequestParam Long steamID,Model model){
        model.addAttribute("player",service.getPlayers().findBySteamID(steamID));
        log.info("Searchng For Player");
        return "playerProfile";
    }
    @GetMapping(value="/players")
    public String findAll(Model model){
        model.addAttribute("players",service.getPlayers().findAll());
        return "playerProfile";
    }

    @GetMapping(value="/player/games")
    public String getGames(@RequestParam Long steamID, Model model){
        model.addAttribute("gameProfiles", service.getGameProfiles().findAllBySteamID(steamID));
        return "gamesLibrary";
    }
}
