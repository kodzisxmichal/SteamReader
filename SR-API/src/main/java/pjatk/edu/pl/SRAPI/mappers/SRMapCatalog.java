package pjatk.edu.pl.SRAPI.mappers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class SRMapCatalog implements ICatalogMappers{

    private final AchievementMapper achievementMapper;
    private final FriendMapper friendMapper;
    private final GameMapper gameMapper;
    private final GameProfileMapper gameProfileMapper;
    private final PlayerMapper playerMapper;

    @Override
    public AchievementMapper getAchievementMapper() {
        return achievementMapper;
    }

    @Override
    public FriendMapper getFriendMapper() {
        return friendMapper;
    }

    @Override
    public GameMapper getGameMapper() {
        return gameMapper;
    }

    @Override
    public GameProfileMapper getGameProfileMapper() {
        return gameProfileMapper;
    }

    @Override
    public PlayerMapper getPlayerMapper() {
        return playerMapper;
    }
}
