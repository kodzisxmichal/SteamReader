package pjatk.edu.pl.SRData.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pjatk.edu.pl.SRData.exceptions.friend.FriendNotFoundException;
import pjatk.edu.pl.SRData.model.Friend;
import pjatk.edu.pl.SRData.model.Player;
import pjatk.edu.pl.SRData.repositories.FriendRepository;
import pjatk.edu.pl.SRData.repositories.PlayerRepository;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class FriendService {
    private final FriendRepository friendRepository;
    private final PlayerRepository playerRepository;

    public List<Friend> findAllByPlayerParentSteamID(Long parentSteamID) {
        var friends =  friendRepository.findAllByPlayerParentSteamID(parentSteamID);

        for (Friend friend: friends) {
            Player friendProfile = playerRepository.findById(friend.getFriendSteamID()).orElse(new Player("Player missing"));
            friend.setName(friendProfile.getPersonName());
            friend.setAvatar(friendProfile.getAvatar());
            log.info(friend.getName());
            friendRepository.save(friend);
        }

        return friends;
    }
}
