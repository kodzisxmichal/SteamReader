package pjatk.edu.pl.SRAPI;

import org.springframework.http.HttpStatus;
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
public class ApiClient implements IApiClient {
    private final RestTemplate restTemplate;
    private final String apiKey = "80AFC44E1C98D37C30713AC8BF2DAFD2";

    public ApiClient(){
        this.restTemplate = new RestTemplate();
    }

    @Override
    public ResponseEntity<PlayerResponseDTO> getPlayers(Long steamID) {
        var URL = "http://api.steampowered.com/ISteamUser/GetPlayerSummaries/v0002/?key="
                +apiKey+"&steamids="+steamID;

        return restTemplate.getForEntity(URL, PlayerResponseDTO.class);
    }

    @Override
    public ResponseEntity<FriendsDTO> getFriendList(Long steamID) {
        var URL = "http://api.steampowered.com/ISteamUser/GetFriendList/v0001/?key="
                +apiKey+"&steamid="+steamID+"&relationship=friend";

        var response = restTemplate.getForEntity(URL, FriendsListDTO.class);
        var friendsDTO = response.getBody().getFriendsListDTO();

        return new ResponseEntity<>(friendsDTO, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<GameProfilesDTO> getGameProfileList(Long steamID) {
        var URL = "http://api.steampowered.com/IPlayerService/GetOwnedGames/v0001/?key="
                +apiKey+"&steamid="+steamID+"&format=json";

        var response = restTemplate.getForEntity(URL, GameProfileResponseDTO.class);
        var gamesDTO = response.getBody().getGamesDTO();

        return new ResponseEntity<>(gamesDTO, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<GameListDTO> getGameList() {
        var URL = "https://api.steampowered.com/ISteamApps/GetAppList/v2/";

        return restTemplate.getForEntity(URL, GameListDTO.class);
    }

    @Override
    public ResponseEntity<AchievementsDTO> getAchievements(Long steamID, Long appID) {
        var URL = "http://api.steampowered.com/ISteamUserStats/GetPlayerAchievements/v0001/?appid="+appID+"&key="
                +apiKey+"&steamid="+steamID;

        var response = restTemplate.getForEntity(URL, AchievementInfoDTO.class);
        var achievementsDTO = response.getBody().getAchievementsDTO();

        return new ResponseEntity<>(achievementsDTO,HttpStatus.OK);

    }
}
