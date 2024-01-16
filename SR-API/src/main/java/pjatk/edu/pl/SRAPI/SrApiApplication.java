package pjatk.edu.pl.SRAPI;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import pjatk.edu.pl.SRAPI.apiclient.IPlayersApiClient;
import pjatk.edu.pl.SRAPI.contract.friend.FriendDTO;
import pjatk.edu.pl.SRAPI.contract.player.PlayerDTO;
import pjatk.edu.pl.SRAPI.model.Friend;
import pjatk.edu.pl.SRAPI.model.Player;
import pjatk.edu.pl.SRAPI.repositories.FriendRepository;
import pjatk.edu.pl.SRAPI.repositories.PlayerRepository;
import pjatk.edu.pl.SRAPI.updater.IMap;

@EnableJpaRepositories
@SpringBootApplication
public class SrApiApplication implements CommandLineRunner {

	final PlayerRepository repository;
	final FriendRepository friendRepository;
	final IMap<PlayerDTO,Player> mapper;
	final IMap<FriendDTO,Friend> friendMapper;
	final IPlayersApiClient client;

	public SrApiApplication(PlayerRepository repository, FriendRepository friendRepository, IMap<PlayerDTO,Player> mapper,IPlayersApiClient client,IMap<FriendDTO,Friend> friendMapper){
		this.repository = repository;
		this.friendRepository = friendRepository;
		this.friendMapper = friendMapper;
		this.mapper = mapper;
		this.client = client;
	}

	public static void main(String[] args) {
		SpringApplication.run(SrApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		client.getPlayers(76561198276528910L)
				.getPlayersDTO()
				.getPlayerDTOS()
				.stream().map(mapper::map)
				.forEach(p->{
					System.out.println(p.getPersonName());
					repository.save(p);
				});
		client.getFriendList(76561198140468616L)
				.getFriendsDTO()
				.getFriendDTOS()
				.stream().map(friendMapper::map)
				.forEach(friendRepository::save);
	}

}
