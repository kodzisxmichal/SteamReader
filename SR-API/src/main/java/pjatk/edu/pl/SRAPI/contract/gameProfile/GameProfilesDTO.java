package pjatk.edu.pl.SRAPI.contract.gameProfile;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
public class GameProfilesDTO {
    public GameProfilesDTO(){}
    @JsonProperty("games")
    private List<GameProfileDTO> gameDTOS;
    @JsonProperty("game_count")
    private int gameCount;

    public void setGameProfileDTOS(List<GameProfileDTO> gameDTOS) {
        this.gameDTOS = gameDTOS;
    }

    public void setGameCount(int gameCount) {
        this.gameCount = gameCount;
    }
}
