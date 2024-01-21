package pjatk.edu.pl.SRWeb.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.RequiredArgsConstructor;


import java.util.List;

@Getter
@RequiredArgsConstructor
public class Player {

    private Long steamID;
    private String personName;
    private String profileURL;
    private String avatar;
    private String avatarMedium;
    private String avatarFull;
    private int communityVisibilityState;
    private int commentPermission;
    private String realName;
    @JsonManagedReference
    private List<Friend> friends;
    @JsonManagedReference
    private List<GameProfile> gameProfiles;

    public void setSteamID(Long steamID) {
        this.steamID = steamID;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void setProfileURL(String profileURL) {
        this.profileURL = profileURL;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setAvatarMedium(String avatarMedium) {
        this.avatarMedium = avatarMedium;
    }

    public void setAvatarFull(String avatarFull) {
        this.avatarFull = avatarFull;
    }

    public void setCommunityVisibilityState(int communityVisibilityState) {
        this.communityVisibilityState = communityVisibilityState;
    }

    public void setCommentPermission(int commentPermission) {
        this.commentPermission = commentPermission;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
}
