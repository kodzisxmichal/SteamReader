package pjatk.edu.pl.SRData.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pjatk.edu.pl.SRAPI.model.Friend;

public interface FriendRepository extends JpaRepository<Friend,Long> {
}
