package pjatk.edu.pl.SRData.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@Entity
public class Game {
    @Id
    private Long appID;
//    @OneToMany(mappedBy = "game")
//    private List<GameProfile> gameProfiles;
    private String name;

//    public void setGameProfiles(List<GameProfile> gameProfiles) {
//        this.gameProfiles = gameProfiles;
//    }

    public void setAppID(Long appID) {
        this.appID = appID;
    }

    public void setName(String name) {
        this.name = name;
    }
}
