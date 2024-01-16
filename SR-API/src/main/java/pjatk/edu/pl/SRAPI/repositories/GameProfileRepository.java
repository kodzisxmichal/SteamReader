package pjatk.edu.pl.SRAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pjatk.edu.pl.SRAPI.model.Game;
import pjatk.edu.pl.SRAPI.model.GameProfile;

public interface GameProfileRepository extends JpaRepository<GameProfile,Long> {
}
