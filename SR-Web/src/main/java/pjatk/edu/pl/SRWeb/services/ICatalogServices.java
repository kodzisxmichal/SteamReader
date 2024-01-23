package pjatk.edu.pl.SRWeb.services;

public interface ICatalogServices {
    PlayerService getPlayers();
    FriendService getFriends();
    GameService getGames();
    GameProfileService getGameProfiles();
    AchievementService getAchievements();
}
