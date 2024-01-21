package pjatk.edu.pl.SRWeb.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import jakarta.persistence.*;

import java.util.List;


@Getter
@RequiredArgsConstructor
@Entity
public class GameProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    @ManyToOne
    @JsonBackReference
    private Player player;
//    @ManyToOne
//    private Game game;
    @JsonManagedReference
    @OneToMany(mappedBy = "gameProfile")
    private List<Achievement> achievements;
    private Long appID;
    private String appName;
    private Long totalPlaytime;
    private Long lastTimePlayed;
    private Long playTimeDisconnected;

    public void setID(Long ID) {
        this.ID = ID;
    }

//    public void setGame(Game game) {
//        this.game = game;
//    }

    public void setAchievements(List<Achievement> achievements) {
        this.achievements = achievements;
    }

    public void setTotalPlaytime(Long totalPlaytime) {
        this.totalPlaytime = totalPlaytime;
    }

    public void setLastTimePlayed(Long lastTimePlayed) {
        this.lastTimePlayed = lastTimePlayed;
    }

    public void setPlayTimeDisconnected(Long playTimeDisconnected) {
        this.playTimeDisconnected = playTimeDisconnected;
    }

    public void setAppID(Long appID) {
        this.appID = appID;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
