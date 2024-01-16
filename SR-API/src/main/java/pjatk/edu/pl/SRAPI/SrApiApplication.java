package pjatk.edu.pl.SRAPI;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import pjatk.edu.pl.SRAPI.apiclient.IPlayersApiClient;
import pjatk.edu.pl.SRAPI.contract.player.PlayerDTO;
import pjatk.edu.pl.SRAPI.model.Player;
import pjatk.edu.pl.SRAPI.repositories.PlayerRepository;
import pjatk.edu.pl.SRAPI.updater.IMap;

@EnableJpaRepositories
@SpringBootApplication
public class SrApiApplication implements CommandLineRunner {

	final PlayerRepository repository;
	final IMap<PlayerDTO,Player> mapper;
	final IPlayersApiClient client;

	public SrApiApplication(PlayerRepository repository, IMap<PlayerDTO,Player> mapper,IPlayersApiClient client){
		this.repository = repository;
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
	}

}
