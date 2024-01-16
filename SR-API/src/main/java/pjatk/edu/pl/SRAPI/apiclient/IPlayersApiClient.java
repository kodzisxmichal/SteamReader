package pjatk.edu.pl.SRAPI.apiclient;

import pjatk.edu.pl.SRAPI.contract.friend.FriendsListDTO;
import pjatk.edu.pl.SRAPI.contract.gameProfile.GameProfileResponseDTO;
import pjatk.edu.pl.SRAPI.contract.player.PlayerResponseDTO;

public interface IPlayersApiClient {
    public PlayerResponseDTO getPlayers(Long steamID);
    public FriendsListDTO getFriendList(Long steamID);
    public GameProfileResponseDTO getGameList(Long steamID);
}
