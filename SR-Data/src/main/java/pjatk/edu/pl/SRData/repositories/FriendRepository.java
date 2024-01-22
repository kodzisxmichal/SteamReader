package pjatk.edu.pl.SRData.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pjatk.edu.pl.SRData.model.Friend;

import java.util.Optional;

public interface FriendRepository extends JpaRepository<Friend,Long> {
    public Optional<Friend> findByFriendSteamID(Long steamID);
    public Optional<Friend> findByPlayerParentSteamIDAndFriendSteamID(Long parentSteamID,Long friendSteamID);
}
