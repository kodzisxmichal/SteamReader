package pjatk.edu.pl.SRAPI.updater;


import pjatk.edu.pl.SRAPI.contract.friend.FriendDTO;
import pjatk.edu.pl.SRAPI.contract.player.PlayerDTO;
import pjatk.edu.pl.SRAPI.model.Friend;
import pjatk.edu.pl.SRAPI.model.Player;

public class FriendMapper implements IMap<FriendDTO, Friend>{

    IMap<PlayerDTO, Player> playerMapper;
    public FriendMapper(IMap<PlayerDTO,Player> playerMapper){this.playerMapper = playerMapper;}
    @Override
    public Friend map(FriendDTO friendDTO) {
        var friend = new Friend();

        friend.setFriendSince(friendDTO.getFriend_since());
        friend.setSteamID(Long.valueOf(friendDTO.getSteamid()));

        return friend;
    }
}
