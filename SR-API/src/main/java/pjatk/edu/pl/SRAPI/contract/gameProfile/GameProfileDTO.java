package pjatk.edu.pl.SRAPI.contract.gameProfile;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class GameProfileDTO {
    public GameProfileDTO(){}

    @JsonProperty("appid")
    private Long appid;
    @JsonProperty("playtime_forever")
    private Long playTimeForever;
    @JsonProperty("playtime_windows_forever")
    private Long playTimeWindowsForever;
    @JsonProperty("playtime_mac_forever")
    private Long playTimeMacForever;
    @JsonProperty("playtime_linux_forever")
    private Long playTimeLinuxForever;
    @JsonProperty("rtime_last_played")
    private Long rtimeLastTimePlayed;
    @JsonProperty("playtime_disconnected")
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
