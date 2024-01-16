package pjatk.edu.pl.SRAPI.updater;

import org.springframework.stereotype.Component;
import pjatk.edu.pl.SRAPI.contract.player.PlayerDTO;
import pjatk.edu.pl.SRAPI.model.Player;

@Component
public class PlayerMapper implements IMap<PlayerDTO, Player>{
    @Override
    public Player map(PlayerDTO playerDTO) {
        var player = new Player();

        player.setSteamID(Long.valueOf(playerDTO.getSteamid()));
        player.setPersonName(playerDTO.getPersonaname());
        player.setProfileURL(playerDTO.getProfileurl());
        player.setAvatar(playerDTO.getAvatar());
        player.setAvatarMedium(playerDTO.getAvatarmedium());
        player.setAvatarFull(playerDTO.getAvatarfull());
        player.setCommunityVisibilityState(playerDTO.getCommunityvisibilitystate());
        player.setCommentPermission(playerDTO.getCommentpermission());
        player.setRealName(playerDTO.getRealname());


        return player;
    }
}
