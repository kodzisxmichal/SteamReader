package pjatk.edu.pl.SRAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pjatk.edu.pl.SRAPI.model.Game;

import java.util.Optional;

public interface GameRepository extends JpaRepository<Game,Long> {
    public Optional<Game> findByAppID(Long appID);
}
