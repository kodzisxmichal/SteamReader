package pjatk.edu.pl.SRAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pjatk.edu.pl.SRAPI.model.Game;
import pjatk.edu.pl.SRAPI.model.Player;

public interface GameRepository extends JpaRepository<Game,Long> {
}
