package pjatk.edu.pl.SRAPI.contract.player;

import lombok.Getter;

@Getter
public class PlayerResponseDTO {
    private PlayersDTO playersDTO;

    public PlayerResponseDTO(){}

    public void setResponse(PlayersDTO playersDTO) {
        this.playersDTO = playersDTO;
    }
}
