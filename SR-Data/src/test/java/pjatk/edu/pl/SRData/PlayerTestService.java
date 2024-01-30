package pjatk.edu.pl.SRData;

import org.junit.jupiter.api.*;
import org.mockito.*;
import pjatk.edu.pl.SRData.model.Player;
import pjatk.edu.pl.SRData.repositories.PlayerRepository;
import pjatk.edu.pl.SRData.services.APIService;
import pjatk.edu.pl.SRData.services.PlayerService;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class PlayerTestService {
    @Mock
    private PlayerRepository repository;
    private AutoCloseable openMocks;
    private PlayerService playerService;
    @Mock
    private APIService apiService;

    @BeforeEach
    public void init(){
        openMocks = MockitoAnnotations.openMocks(this);
        playerService = new PlayerService(repository, apiService);
    }

    @AfterEach
    public void tearDown() throws Exception {
        openMocks.close();
    }

    @Test
    public void testFindBySteamID(){
        Long steamID = 76561198140468616L;
        Player player = new Player();
        player.setSteamID(steamID);
        player.setRealName("RealName");
        when(repository.findById(steamID)).thenReturn(Optional.of(player));

//        ArgumentCaptor<Player> captor = ArgumentCaptor.forClass(Player.class);
//        when(repository.save(captor.capture())).thenReturn(player);

        Player testPlayer = playerService.findBySteamID(76561198140468616L);
        Mockito.verify(repository,Mockito.times(1))
                .findById(Mockito.any());
//        Player playerFromCall = captor.getValue();
        assertEquals(player,testPlayer);
    }

}
