package pjatk.edu.pl.SRAPI.contract.achievement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;



@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class AchievementInfoDTO {

    @JsonProperty("playerstats")
    private AchievementsDTO achievementsDTO;

    public void setAchievementsDTO(AchievementsDTO achievementsDTO) {
        this.achievementsDTO = achievementsDTO;
    }
}
