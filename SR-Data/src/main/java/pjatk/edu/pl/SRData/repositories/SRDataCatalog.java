package pjatk.edu.pl.SRData.repositories;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SRDataCatalog implements ICatalogData{

    private final AchievementRepository achievementRepository;
    private final FriendRepository friendRepository;
    private final GameRepository gameRepository;
    private final GameProfileRepository gameProfileRepository;
    private final PlayerRepository playerRepository;

    @Override
    public AchievementRepository getAchievements() {
        return achievementRepository;
    }

    @Override
    public FriendRepository getFriends() {
        return friendRepository;
    }

    @Override
    public GameRepository getGames() {
        return gameRepository;
    }

    @Override
    public GameProfileRepository getGameProfiles() {
        return gameProfileRepository;
    }

    @Override
    public PlayerRepository getPlayers() {
        return playerRepository;
    }
}
