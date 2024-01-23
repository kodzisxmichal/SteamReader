package pjatk.edu.pl.SRData.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pjatk.edu.pl.SRData.model.GameProfile;

import java.util.List;
import java.util.Optional;

public interface GameProfileRepository extends JpaRepository<GameProfile,Long> {
    public Optional<GameProfile> findByPlayerSteamIDAndAppID(Long steamID, Long appID);
    public List<GameProfile> findAllByPlayerSteamID(Long steamID);
}
