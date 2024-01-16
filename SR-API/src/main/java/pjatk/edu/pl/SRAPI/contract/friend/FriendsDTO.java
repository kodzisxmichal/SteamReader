package pjatk.edu.pl.SRAPI.contract.friend;

import lombok.Getter;

import java.util.List;

@Getter
public class FriendsDTO {

    public FriendsDTO(){}
    private List<FriendDTO> friendDTOS;

    public void setFriendDTOS(List<FriendDTO> friendDTOS) {
        this.friendDTOS = friendDTOS;
    }
}
