package pjatk.edu.pl.SRAPI.contract.friend;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FriendsListDTO {

    @JsonProperty("friendslist")
    FriendsDTO friendsDTO;

    public FriendsDTO getFriendsListDTO() {
        return friendsDTO;
    }

    public void setFriendsListDTO(FriendsDTO friendsDTO) {
        this.friendsDTO = friendsDTO;
    }
}
