package pjatk.edu.pl.SRAPI.contract.gameProfile;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class GameProfileResponseDTO {
    @JsonProperty("response")
    private GameProfilesDTO gamesDTO;

    public GameProfileResponseDTO(){}

    public void setGamesDTO(GameProfilesDTO gamesDTO) {
        this.gamesDTO = gamesDTO;
    }

}
