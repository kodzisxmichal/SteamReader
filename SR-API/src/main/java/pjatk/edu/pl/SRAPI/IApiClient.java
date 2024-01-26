package pjatk.edu.pl.SRAPI;

import org.springframework.http.ResponseEntity;
import pjatk.edu.pl.SRAPI.contract.achievement.AchievementsDTO;
import pjatk.edu.pl.SRAPI.contract.friend.FriendsDTO;
import pjatk.edu.pl.SRAPI.contract.game.GameListDTO;
import pjatk.edu.pl.SRAPI.contract.gameProfile.GameProfilesDTO;
import pjatk.edu.pl.SRAPI.contract.player.PlayerResponseDTO;

public interface IApiClient {
    public ResponseEntity<PlayerResponseDTO> getPlayers(Long steamID);
    public ResponseEntity<FriendsDTO> getFriendList(Long steamID);
    public ResponseEntity<GameProfilesDTO> getGameProfileList(Long steamID);
    public ResponseEntity<GameListDTO> getGameList();
    public ResponseEntity<AchievementsDTO> getAchievements(Long steamID, Long appID);
}
