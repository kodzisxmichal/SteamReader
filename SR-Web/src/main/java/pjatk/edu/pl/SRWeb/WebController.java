package pjatk.edu.pl.SRWeb;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public String getMainPage(){
        return "search";
    }

//    @GetMapping("/player/search")
//    public String getPostMainPage(@RequestParam Long steamID, Model model){
//        model.addAttribute("player",service.getPlayers().findBySteamID(steamID));
//        model.addAttribute("gameProfiles", service.getGameProfiles().findAllBySteamID(steamID));
//        model.addAttribute("friends", service.getFriends().findAllByParentID(steamID));
//
//        return "test";
//    }

    @GetMapping(value = "/player/search")
    public String getPlayer(@RequestParam Long steamID,Model model){
        log.info("Calling for player");
        if(steamID<10000000000000000L || steamID >=100000000000000000L) {
            log.info("Wrong steamID");
            return getMainPage();
        }

        model.addAttribute("player",service.getPlayers().findBySteamID(steamID));
        model.addAttribute("friends",service.getFriends().findAllByParentID(steamID));
        model.addAttribute("gameProfiles", service.getGameProfiles().findAllBySteamID(steamID));
        log.info("Success");
        return "playerProfile";
    }

    @GetMapping(value="/player/games")
    public String getGames(@RequestParam Long steamID, Model model){
        log.info("Calling for gameProfiles of player with steamID:" + steamID);
        model.addAttribute("gameProfiles", service.getGameProfiles().findAllBySteamID(steamID));
        log.info("Success");
        return "gameLibrary";
    }

    @GetMapping(value="/player/friends")
    public String getFriends(@RequestParam Long steamID, Model model){
        log.info("Calling for friends of player with steamID:" + steamID);
        model.addAttribute("friends", service.getFriends().findAllByParentID(steamID));
        log.info("Success");
        return "friendLibrary";
    }
}
