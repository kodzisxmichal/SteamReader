package pjatk.edu.pl.SRAPI.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@Entity
public class Friend {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;
    @ManyToOne
    private Player playerParent;
    @OneToMany
    private Player playerFriend;
    private Long friendSince;

    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setPlayerParent(Player player) {
        this.playerParent = player;
    }

    public void setFriendSince(Long friendSince) {
        this.friendSince = friendSince;
    }

    public void setPlayerFriend(Player playerFriend) {
        this.playerFriend = playerFriend;
    }
}
