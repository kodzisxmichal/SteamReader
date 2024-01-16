package pjatk.edu.pl.SRAPI.contract.friend;

import lombok.Getter;

@Getter
public class FriendsListDTO {
    private FriendsDTO friendsDTO;

    public FriendsListDTO(){}

    public void setFriendsDTO(FriendsDTO friendsDTO) {
        this.friendsDTO = friendsDTO;
    }
}
