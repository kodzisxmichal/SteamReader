package pjatk.edu.pl.SRAPI.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@Entity
public class Achievement  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private GameProfile gameProfile;
    private String name;
    private boolean achieved;
    private Long unlockTime;

    public void setId(Long id) {
        this.id = id;
    }

    public void setGameProfile(GameProfile gameProfile) {
        this.gameProfile = gameProfile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAchieved(boolean achieved) {
        this.achieved = achieved;
    }

    public void setUnlockTime(Long unlockTime) {
        this.unlockTime = unlockTime;
    }
}
