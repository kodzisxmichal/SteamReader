package pjatk.edu.pl.SRAPI.contract.friend;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class FriendsDTO {

    @JsonProperty("friends")
    private List<FriendDTO> friendsDTO;

    public FriendsDTO(){}

    public List<FriendDTO> getFriendsDTO() {
        return friendsDTO;
    }

    public void setFriendsDTO(List<FriendDTO> friendsDTO) {
        this.friendsDTO = friendsDTO;
    }
}
