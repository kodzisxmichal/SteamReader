package pjatk.edu.pl.SRData.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
@Entity
public class Game {
    @Id
    private Long appID;
    @OneToMany(mappedBy = "game")
    private List<GameProfile> gameProfiles;
    private String name;

    public void setAppID(Long appID) {
        this.appID = appID;
    }

    public void setName(String name) {
        this.name = name;
    }
}
