package pjatk.edu.pl.SRWeb.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SRServiceCatalog implements ICatalogServices{
    private final PlayerService playerService;
    private final FriendService friendService;
    private final GameService gameService;
    private final GameProfileService gameProfileService;
    private final AchievementService achievementService;
    @Override
    public PlayerService getPlayers() {
        return playerService;
    }

    @Override
    public FriendService getFriends() {
        return friendService;
    }

    @Override
    public GameService getGames() {
        return gameService;
    }

    @Override
    public GameProfileService getGameProfiles() {
        return gameProfileService;
    }

    @Override
    public AchievementService getAchievements() {
        return achievementService;
    }
}
