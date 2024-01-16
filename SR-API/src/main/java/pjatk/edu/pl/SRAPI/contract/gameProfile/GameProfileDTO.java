package pjatk.edu.pl.SRAPI.contract.gameProfile;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class GameProfileDTO {
    public GameProfileDTO(){}

    private Long appid;
    private Long playTimeForever;
    private Long playTimeWindowsForever;
    private Long playTimeMacForever;
    private Long playTimeLinuxForever;
    private Long rtimeLastTimePlayed;
    private Long playTimeDisconnected;

    public void setAppid(Long appid) {
        this.appid = appid;
    }

    public void setPlayTimeForever(Long playTimeForever) {
        this.playTimeForever = playTimeForever;
    }

    public void setPlayTimeWindowsForever(Long playTimeWindowsForever) {
        this.playTimeWindowsForever = playTimeWindowsForever;
    }

    public void setPlayTimeMacForever(Long playTimeMacForever) {
        this.playTimeMacForever = playTimeMacForever;
    }

    public void setPlayTimeLinuxForever(Long playTimeLinuxForever) {
        this.playTimeLinuxForever = playTimeLinuxForever;
    }

    public void setRtimeLastTimePlayed(Long rtimeLastTimePlayed) {
        this.rtimeLastTimePlayed = rtimeLastTimePlayed;
    }

    public void setPlayTimeDisconnected(Long playTimeDisconnected) {
        this.playTimeDisconnected = playTimeDisconnected;
    }
}
