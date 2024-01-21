package pjatk.edu.pl.SRData.repositories;

public interface ICatalogData {
    AchievementRepository getAchievements();
    FriendRepository getFriends();
    GameRepository getGames();
    GameProfileRepository getGameProfiles();
    PlayerRepository getPlayers();
}
