package pjatk.edu.pl.SRAPI;

import pjatk.edu.pl.SRAPI.contract.achievement.AchievementsDTO;
import pjatk.edu.pl.SRAPI.contract.friend.FriendsDTO;
import pjatk.edu.pl.SRAPI.contract.game.GameListDTO;
import pjatk.edu.pl.SRAPI.contract.gameProfile.GameProfilesDTO;
import pjatk.edu.pl.SRAPI.contract.player.PlayerResponseDTO;

public interface IApiClient {
    public PlayerResponseDTO getPlayers(Long steamID);
    public FriendsDTO getFriendList(Long steamID);
    public GameProfilesDTO getGameProfileList(Long steamID);
    public GameListDTO getGameList();
    public AchievementsDTO getAchievements(Long steamID, Long appID);
}