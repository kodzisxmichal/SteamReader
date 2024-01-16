package pjatk.edu.pl.SRAPI.contract.player;

import lombok.Getter;

import java.util.List;

@Getter
public class PlayersDTO {

    public PlayersDTO(){}
    private List<PlayerDTO> playerDTOS;

    public void setPlayers(List<PlayerDTO> playerDTOS) {
        this.playerDTOS = playerDTOS;
    }
}
