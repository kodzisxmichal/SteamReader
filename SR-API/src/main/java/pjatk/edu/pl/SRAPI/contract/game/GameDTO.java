package pjatk.edu.pl.SRAPI.contract.game;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class GameDTO {
    public GameDTO(){}

    private Long appid;
    private String name;

    public void setAppid(Long appid) {
        this.appid = appid;
    }

    public void setName(String name) {
        this.name = name;
    }
}
