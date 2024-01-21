package pjatk.edu.pl.SRWeb.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;


@Getter
@RequiredArgsConstructor
public class Game {
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
