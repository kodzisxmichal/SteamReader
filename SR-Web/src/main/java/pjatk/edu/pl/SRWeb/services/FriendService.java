package pjatk.edu.pl.SRWeb.services;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import pjatk.edu.pl.SRWeb.model.Friend;

import java.util.List;

@Service
public class FriendService {
    RestClient restClient;

    private static final String DATA_URL = "http://localhost:8082";

    FriendService(){
        restClient = RestClient.create();
    }

    public Friend findByID(Long ID){

        return restClient
                .get().uri(DATA_URL +"/friends")
                .retrieve()
                .body(Friend.class);
    }

    public List<Friend> findAllByParentID(Long parentID){

        return restClient.get()
                .uri(DATA_URL +"/friends/steamID/"+parentID)
                .retrieve()
                .body(new ParameterizedTypeReference<>() {});
    }
}
