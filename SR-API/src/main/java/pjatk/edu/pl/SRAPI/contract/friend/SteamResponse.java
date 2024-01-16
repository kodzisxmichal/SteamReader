package pjatk.edu.pl.SRAPI.contract.friend;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SteamResponse {

    @JsonProperty("friendslist")
    FriendsListDTO friendsListDTO;

    public FriendsListDTO getFriendsListDTO() {
        return friendsListDTO;
    }

    public void setFriendsListDTO(FriendsListDTO friendsListDTO) {
        this.friendsListDTO = friendsListDTO;
    }
}
