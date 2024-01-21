package pjatk.edu.pl.SRAPI.mappers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pjatk.edu.pl.SRAPI.contract.player.PlayerDTO;
import pjatk.edu.pl.SRAPI.model.Player;
import pjatk.edu.pl.SRAPI.repositories.ICatalogData;

@RequiredArgsConstructor
@Component
public class PlayerMapper implements IMap<PlayerDTO, Player>{
    private final ICatalogData repository;

    @Override
    public Player map(PlayerDTO playerDTO, Long ID) {
        var player = repository.getPlayers().findById(ID).orElse(new Player());

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
