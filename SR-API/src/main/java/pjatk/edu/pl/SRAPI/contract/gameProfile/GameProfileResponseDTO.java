package pjatk.edu.pl.SRAPI.contract.gameProfile;

import lombok.Getter;

@Getter
public class GameProfileResponseDTO {
    private int gameCount;
    private GameProfilesDTO gamesDTO;

    public GameProfileResponseDTO(){}

    public void setGamesDTO(GameProfilesDTO gamesDTO) {
        this.gamesDTO = gamesDTO;
    }

    public void setGameCount(int gameCount) {
        this.gameCount = gameCount;
    }
}
