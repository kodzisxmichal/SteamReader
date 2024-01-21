package pjatk.edu.pl.SRWeb.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import pjatk.edu.pl.SRWeb.model.Friend;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FriendService {
    RestClient restClient;
    private static final String API_URL = "http://localhost:8080";
    public Friend findByID(Long ID){
        Friend friend = restClient
                .get().uri(API_URL+"/friends")
                .retrieve()
                .body(Friend.class);
        return friend;
    }
}
