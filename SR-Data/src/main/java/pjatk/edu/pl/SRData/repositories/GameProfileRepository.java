package pjatk.edu.pl.SRData.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pjatk.edu.pl.SRAPI.model.GameProfile;

import java.util.Optional;

public interface GameProfileRepository extends JpaRepository<GameProfile,Long> {
    public Optional<GameProfile> findByPlayerSteamIDAndAppID(Long steamID, Long appID);
}
