package pjatk.edu.pl.SRAPI.repositories;

public interface ICatalogData {
    AchievementRepository getAchievements();
    FriendRepository getFriends();
    GameRepository getGames();
    GameProfileRepository getGameProfiles();
    PlayerRepository getPlayers();
}
