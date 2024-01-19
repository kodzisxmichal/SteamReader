package pjatk.edu.pl.SRAPI.contract.game;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GameListDTO {

    @JsonProperty("applist")
    GamesDTO gamesDTO;

    public GamesDTO getFriendsListDTO() {
        return gamesDTO;
    }

    public void setGamesDTO(GamesDTO gamesDTO) {
        this.gamesDTO = gamesDTO;
    }
}
