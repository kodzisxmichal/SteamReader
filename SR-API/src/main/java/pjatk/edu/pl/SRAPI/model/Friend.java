package pjatk.edu.pl.SRAPI.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;


@Getter
@RequiredArgsConstructor
@Entity
public class Friend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    @JsonBackReference
    @ManyToOne
    private Player playerParent;
    private Long friendSteamID;
    @Column(unique = true)
    private Long friendSince;
    private String name;
    private String avatar;

    public void setPlayerParent(Player playerParent) {
        this.playerParent = playerParent;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setFriendSteamID(Long friendSteamID) {
        this.friendSteamID = friendSteamID;
    }

    public void setFriendSince(Long friendSince) {
        this.friendSince = friendSince;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
