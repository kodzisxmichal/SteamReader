package pjatk.edu.pl.SRData.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pjatk.edu.pl.SRAPI.model.Player;

public interface PlayerRepository extends JpaRepository<Player,Long> {
}
