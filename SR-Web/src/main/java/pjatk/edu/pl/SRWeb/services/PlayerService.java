package pjatk.edu.pl.SRWeb.services;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import pjatk.edu.pl.SRWeb.model.Player;


import java.util.List;

@Service
public class PlayerService {
    RestClient restClient;

    private static final String DATA_URL = "http://localhost:8082";

    private PlayerService(){
        restClient = RestClient.create();
    }
    public Player findBySteamID(Long steamID){

        return restClient.get()
                .uri(DATA_URL + "/players/steamid/"+steamID)
                .retrieve()
                .body(Player.class);
    }

    public List<Player> findAll(){

        return restClient.get()
                .uri(DATA_URL + "/players")
                .retrieve()
                .body(new ParameterizedTypeReference<List<Player>>() {});
    }

}
