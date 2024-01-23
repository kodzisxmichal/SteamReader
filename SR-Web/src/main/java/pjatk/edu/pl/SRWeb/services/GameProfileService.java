package pjatk.edu.pl.SRWeb.services;

import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import pjatk.edu.pl.SRWeb.model.GameProfile;
import pjatk.edu.pl.SRWeb.model.Player;


import java.util.List;

@Service
public class GameProfileService {

    RestClient restClient;
    private static final String API_URL = "http://localhost:8082";
    GameProfileService(){
        restClient = RestClient.create();
    }
    public List<GameProfile> findAllBySteamID(Long steamID){
        List<GameProfile> gameProfiles = restClient.get()
                .uri(API_URL + "/gameProfiles/steamid/"+steamID)
                .retrieve()
                .body(new ParameterizedTypeReference<List<GameProfile>>() {});

        return gameProfiles;
    }

}
