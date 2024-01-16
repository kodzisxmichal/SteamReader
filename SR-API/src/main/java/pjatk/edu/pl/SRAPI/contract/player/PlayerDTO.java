package pjatk.edu.pl.SRAPI.contract.player;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerDTO {

    public PlayerDTO(){}

    private String steamid;
    private int communityvisibilitystate;
    private int profilestate;
    private String personaname;
    private int commentpermission;
    private String profileurl;
    private String avatar;
    private String avatarmedium;
    private String avatarfull;
    private String avatarhash;
    private int personastate;
    private String realname;
    private String primaryclanid;
    private Long timecreated;
    private int personastateflags;
    private String loccountrycode;

    public void setSteamid(String steamid) {
        this.steamid = steamid;
    }

    public void setCommunityvisibilitystate(int communityvisibilitystate) {
        this.communityvisibilitystate = communityvisibilitystate;
    }

    public void setProfilestate(int profilestate) {
        this.profilestate = profilestate;
    }

    public void setPersonaname(String personaname) {
        this.personaname = personaname;
    }

    public void setCommentpermission(int commentpermission) {
        this.commentpermission = commentpermission;
    }

    public void setProfileurl(String profileurl) {
        this.profileurl = profileurl;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setAvatarmedium(String avatarmedium) {
        this.avatarmedium = avatarmedium;
    }

    public void setAvatarfull(String avatarfull) {
        this.avatarfull = avatarfull;
    }

    public void setAvatarhash(String avatarhash) {
        this.avatarhash = avatarhash;
    }

    public void setPersonastate(int personastate) {
        this.personastate = personastate;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public void setPrimaryclanid(String primaryclanid) {
        this.primaryclanid = primaryclanid;
    }

    public void setTimecreated(Long timecreated) {
        this.timecreated = timecreated;
    }

    public void setPersonastateflags(int personastateflags) {
        this.personastateflags = personastateflags;
    }

    public void setLoccountrycode(String loccountrycode) {
        this.loccountrycode = loccountrycode;
    }
}
