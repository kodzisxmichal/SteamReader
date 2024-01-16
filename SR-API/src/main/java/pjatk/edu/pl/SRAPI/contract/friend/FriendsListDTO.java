package pjatk.edu.pl.SRAPI.contract.friend;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;


public class FriendsListDTO {

    @JsonProperty("friends")
    private List<FriendDTO> friendsDTO;

    public FriendsListDTO(){}

    public List<FriendDTO> getFriendsDTO() {
        return friendsDTO;
    }

    public void setFriendsDTO(List<FriendDTO> friendsDTO) {
        this.friendsDTO = friendsDTO;
    }
}
