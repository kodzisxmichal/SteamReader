package pjatk.edu.pl.SRAPI.apiclient;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pjatk.edu.pl.SRAPI.contract.achievement.AchievementInfoDTO;
import pjatk.edu.pl.SRAPI.contract.achievement.AchievementsDTO;
import pjatk.edu.pl.SRAPI.contract.friend.FriendsDTO;
import pjatk.edu.pl.SRAPI.contract.friend.FriendsListDTO;
import pjatk.edu.pl.SRAPI.contract.game.GameListDTO;
import pjatk.edu.pl.SRAPI.contract.gameProfile.GameProfileResponseDTO;
import pjatk.edu.pl.SRAPI.contract.gameProfile.GameProfilesDTO;
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

        ResponseEntity<FriendsListDTO> response = restTemplate.getForEntity(URL, FriendsListDTO.class);

        return response.getBody().getFriendsListDTO();
    }

    @Override
    public GameProfilesDTO getGameProfileList(Long steamID) {
        var URL = "http://api.steampowered.com/IPlayerService/GetOwnedGames/v0001/?key="
                +apiKey+"&steamid="+steamID+"&format=json";

        ResponseEntity<GameProfileResponseDTO> response = restTemplate.getForEntity(URL, GameProfileResponseDTO.class);

        return response.getBody().getGamesDTO();
    }

    @Override
    public GameListDTO getGameList() {
        var URL = "https://api.steampowered.com/ISteamApps/GetAppList/v2/";

        ResponseEntity<GameListDTO> response = restTemplate.getForEntity(URL, GameListDTO.class);

        return response.getBody();
    }

    @Override
    public AchievementsDTO getAchievements(Long steamID, Long appID) {
        var URL = "http://api.steampowered.com/ISteamUserStats/GetPlayerAchievements/v0001/?appid="+appID+"&key="
                +apiKey+"&steamid="+steamID;

        ResponseEntity<AchievementInfoDTO> response = restTemplate.getForEntity(URL, AchievementInfoDTO.class);

        return response.getBody().getAchievementsDTO();

    }
}
