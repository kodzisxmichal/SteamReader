package pjatk.edu.pl.SRAPI.contract.friend;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class FriendDTO {
    public FriendDTO(){}

    private String steamid;
    private String relationship;
    private Long friend_since;

    public void setSteamid(String steamid) {
        this.steamid = steamid;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public void setFriend_since(Long friend_since) {
        this.friend_since = friend_since;
    }
}
