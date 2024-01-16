package pjatk.edu.pl.SRAPI.contract.gameProfile;

import lombok.Getter;

import java.util.List;

@Getter
public class GameProfilesDTO {
    public GameProfilesDTO(){}
    private List<GameProfileDTO> gameDTOS;

    public void setGameDTOS(List<GameProfileDTO> gameDTOS) {
        this.gameDTOS = gameDTOS;
    }
}
