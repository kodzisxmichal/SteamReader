package pjatk.edu.pl.SRAPI.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
@Entity
public class GameProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    @ManyToOne
    private Player player;
    @ManyToOne
    private Game game;
    @OneToMany(mappedBy = "gameProfile")
    private List<Achievement> achievements;
    private Long totalPlaytime;
    private Long lastTimePlayed;
    private Long playTimeDisconnected;

    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setGame(Game game) {
        this.game = game;
    }

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
}
