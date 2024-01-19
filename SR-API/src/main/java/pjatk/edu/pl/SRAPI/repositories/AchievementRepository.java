package pjatk.edu.pl.SRAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import pjatk.edu.pl.SRAPI.model.Achievement;
import pjatk.edu.pl.SRAPI.model.Game;

public interface AchievementRepository extends JpaRepository<Achievement,Long> {
}
