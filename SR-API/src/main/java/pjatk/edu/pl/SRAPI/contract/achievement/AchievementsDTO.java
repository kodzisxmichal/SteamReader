package pjatk.edu.pl.SRAPI.contract.achievement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class AchievementsDTO {

    @JsonProperty("steamID")
    private Long steamID;
    @JsonProperty("gameName")
    private String gameName;
    @JsonProperty("achievements")
    private List<AchievementDTO> achievements;

    public void setAchievements(List<AchievementDTO> achievements) {
        this.achievements = achievements;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public void setSteamID(Long steamID) {
        this.steamID = steamID;
    }
}
