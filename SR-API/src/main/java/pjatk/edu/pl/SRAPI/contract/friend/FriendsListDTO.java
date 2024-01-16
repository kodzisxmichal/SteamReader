package pjatk.edu.pl.SRAPI.contract.friend;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class FriendsListDTO {
    private FriendsDTO friendsDTO;

    public FriendsListDTO(){}

    public void setFriendsDTO(FriendsDTO friendsDTO) {
        this.friendsDTO = friendsDTO;
    }
}
