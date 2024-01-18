package pjatk.edu.pl.SRAPI.apiclient;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pjatk.edu.pl.SRAPI.contract.friend.FriendsDTO;
import pjatk.edu.pl.SRAPI.contract.friend.FriendsListDTO;
import pjatk.edu.pl.SRAPI.contract.gameProfile.GameProfileResponseDTO;
import pjatk.edu.pl.SRAPI.contract.player.PlayerResponseDTO;

@Component
public class PlayerApiClient implements IPlayersApiClient{
    private final RestTemplate restTemplate;
    private final String apiKey = "80AFC44E1C98D37C30713AC8BF2DAFD2";

    public PlayerApiClient(){
        this.restTemplate = new RestTemplate();
    }

    @Override
    public PlayerResponseDTO getPlayers(Long steamID) {
        var URL = "http://api.steampowered.com/ISteamUser/GetPlayerSummaries/v0002/?key="
                +apiKey+"&steamids="+steamID;

        return restTemplate.getForObject(URL, PlayerResponseDTO.class);
    }

    @Override
    public FriendsDTO getFriendList(Long steamID) {
        var URL = "http://api.steampowered.com/ISteamUser/GetFriendList/v0001/?key="
                +apiKey+"&steamid="+steamID+"&relationship=friend";

        FriendsListDTO friendsListDTO = restTemplate.getForObject(URL, FriendsListDTO.class);

        return friendsListDTO.getFriendsListDTO();
    }

    @Override
    public GameProfileResponseDTO getGameList(Long steamID) {
        var URL = "http://api.steampowered.com/IPlayerService/GetOwnedGames/v0001/?key="
                +apiKey+"&steamid="+steamID+"&format=json";

        return restTemplate.getForObject(URL, GameProfileResponseDTO.class);
    }
}
