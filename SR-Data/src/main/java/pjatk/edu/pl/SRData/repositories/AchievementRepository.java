package pjatk.edu.pl.SRData.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pjatk.edu.pl.SRAPI.model.Achievement;

public interface AchievementRepository extends JpaRepository<Achievement,Long> {
}
