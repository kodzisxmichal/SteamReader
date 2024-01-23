package pjatk.edu.pl.SRWeb.services;

import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestClient;
import pjatk.edu.pl.SRWeb.model.Player;


import java.util.List;

@Service
public class PlayerService {
    RestClient restClient;

    private static final String API_URL = "http://localhost:8082";

    private PlayerService(){
        restClient = RestClient.create();
    }
    public Player findBySteamID(Long steamID){
        restClient.put()
                .uri("http://localhost:8080/update/"+steamID)
                .retrieve();

        Player player = restClient.get()
                .uri(API_URL + "/players/steamid/"+steamID)
                .retrieve()
                .body(Player.class);

        return player;
    }

    public List<Player> findAll(){
        List<Player> players = restClient.get()
                .uri(API_URL + "/players")
                .retrieve()
                .body(new ParameterizedTypeReference<List<Player>>() {});

        return players;
    }

}
