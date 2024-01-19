package pjatk.edu.pl.SRAPI.contract.game;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
public class GamesDTO {
    @JsonProperty("apps")
    private List<GameDTO> gameDTOS;

    public GamesDTO(){}

    public void setGameDTOS(List<GameDTO> gameDTOS) {
        this.gameDTOS = gameDTOS;
    }
}
