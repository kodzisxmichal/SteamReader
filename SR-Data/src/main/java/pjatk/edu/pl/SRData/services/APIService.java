package pjatk.edu.pl.SRData.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class APIService {
    RestClient restClient;
    private static final String API_URL = "http://localhost:8080";

    private APIService(){
        restClient = RestClient.create();
    }

    public void callUpdate(Long steamID){
        restClient.put()
                .uri( API_URL+"/update/"+steamID)
                .retrieve();
    }
}
