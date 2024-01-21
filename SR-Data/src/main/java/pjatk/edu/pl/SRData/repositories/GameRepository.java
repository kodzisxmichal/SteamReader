package pjatk.edu.pl.SRData.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pjatk.edu.pl.SRAPI.model.Game;

public interface GameRepository extends JpaRepository<Game,Long> {
}
