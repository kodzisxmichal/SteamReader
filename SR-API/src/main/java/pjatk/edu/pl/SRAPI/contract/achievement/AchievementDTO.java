package pjatk.edu.pl.SRAPI.contract.achievement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;


@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class AchievementDTO {
    public AchievementDTO(){}

    @JsonProperty("apiname")
    private String apiname;
    @JsonProperty("achieved")
    private int achieved;
    @JsonProperty("unlocktime")
    private Long unlocktime;
    @JsonProperty("error")
    private String error;
    @JsonProperty("success")
    private Boolean success;

    public void setApiname(String apiname) {
        this.apiname = apiname;
    }

    public void setAchieved(int achieved) {
        this.achieved = achieved;
    }

    public void setUnlocktime(Long unlocktime) {
        this.unlocktime = unlocktime;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public void setError(String error) {
        this.error = error;
    }
}
