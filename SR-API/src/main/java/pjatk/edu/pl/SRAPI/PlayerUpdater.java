package pjatk.edu.pl.SRAPI;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pjatk.edu.pl.SRAPI.apiclient.PlayerApiClient;
import pjatk.edu.pl.SRAPI.contract.player.PlayerDTO;
import pjatk.edu.pl.SRAPI.mappers.SRMapCatalog;
import pjatk.edu.pl.SRAPI.repositories.SRDataCatalog;

@RequiredArgsConstructor
@Component
public class PlayerUpdater implements IUpdate{

    private final PlayerApiClient client;
    private final SRDataCatalog repository;
    private final SRMapCatalog mapper;

    private final String steamID = "76561198140468616L";
    @Override
    public void update(Long steamID) {
        client.getPlayers(steamID);
    }

}
