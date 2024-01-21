package pjatk.edu.pl.SRData.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pjatk.edu.pl.SRAPI.model.GameProfile;

public interface GameProfileRepository extends JpaRepository<GameProfile,Long> {
}
