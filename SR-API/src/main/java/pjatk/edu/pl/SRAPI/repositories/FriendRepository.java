package pjatk.edu.pl.SRAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pjatk.edu.pl.SRAPI.model.Friend;
import pjatk.edu.pl.SRAPI.model.Game;

public interface FriendRepository extends JpaRepository<Friend,Long> {
}
