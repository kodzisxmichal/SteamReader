package pjatk.edu.pl.SRAPI.mappers;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pjatk.edu.pl.SRAPI.contract.friend.FriendDTO;
import pjatk.edu.pl.SRAPI.contract.player.PlayerDTO;
import pjatk.edu.pl.SRAPI.model.Friend;
import pjatk.edu.pl.SRAPI.model.Player;
import pjatk.edu.pl.SRAPI.repositories.ICatalogData;
import pjatk.edu.pl.SRAPI.repositories.PlayerRepository;

@RequiredArgsConstructor
@Component
public class FriendMapper implements IMap<FriendDTO, Friend>{
    private final ICatalogData repository;

    @Override
    public Friend map(FriendDTO friendDTO, Long steamID) {
        var friend = repository.getFriends().findByPlayerParentSteamIDAndFriendSteamID(steamID, Long.valueOf(friendDTO.getSteamid())).orElse(new Friend());

        friend.setFriendSince(friendDTO.getFriend_since());
        friend.setFriendSteamID(Long.valueOf(friendDTO.getSteamid()));
        friend.setPlayerParent(repository.getPlayers().findById(steamID).orElseThrow());

        return friend;
    }
}
