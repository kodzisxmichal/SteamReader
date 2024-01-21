package pjatk.edu.pl.SRAPI;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import pjatk.edu.pl.SRAPI.apiclient.IPlayersApiClient;
import pjatk.edu.pl.SRAPI.contract.achievement.AchievementDTO;
import pjatk.edu.pl.SRAPI.contract.achievement.AchievementsDTO;
import pjatk.edu.pl.SRAPI.contract.friend.FriendDTO;
import pjatk.edu.pl.SRAPI.contract.game.GameDTO;
import pjatk.edu.pl.SRAPI.contract.gameProfile.GameProfileDTO;
import pjatk.edu.pl.SRAPI.contract.player.PlayerDTO;
import pjatk.edu.pl.SRAPI.model.Game;
import pjatk.edu.pl.SRAPI.repositories.*;
import pjatk.edu.pl.SRAPI.mappers.*;

import java.util.List;
import java.util.stream.Stream;


@EnableJpaRepositories
@SpringBootApplication
@RequiredArgsConstructor
public class SrApiApplication implements CommandLineRunner {

	private final SRDataCatalog repository;
	private final SRMapCatalog mapper;
	private final IPlayersApiClient client;

	public static void main(String[] args) {
		SpringApplication.run(SrApiApplication.class, args);
	}

	private static final long steamid = 76561198276528910L;

	@Override
	public void run(String... args) throws Exception {

		client.getPlayers(steamid)
				.getPlayersDTO()
				.getPlayerDTOS()
				.stream().map((PlayerDTO playerDTO) -> mapper.getPlayerMapper().map(playerDTO,steamid))
				.forEach(player->{repository.getPlayers().save(player);});

		client.getFriendList(steamid)
				.getFriendsDTO()
				.stream().map((FriendDTO friendDTO) -> mapper.getFriendMapper().map(friendDTO,steamid))
				.forEach(friend->repository.getFriends().save(friend));

//		client.getGameList()
//				.getFriendsListDTO()
//				.getGameDTOS()
//				.stream().map((GameDTO gameDTO) -> mapper.getGameMapper().map(gameDTO,steamid))
//				.forEach(game -> repository.getGames().save(game));



		client.getGameProfileList(steamid)
				.getGameDTOS()
				.stream().map((GameProfileDTO gameProfileDTO) -> mapper.getGameProfileMapper().map(gameProfileDTO,steamid))
				.forEach(gameProfile -> {
					repository.getGameProfiles().save(gameProfile);

//					List<AchievementDTO> Achievements = client.getAchievements(steamid, gameProfile.getAppID()).getAchievements();
//
//					if (Achievements!=null) {
//						Achievements
//								.stream()
//								.map(mapper.getAchievementMapper()::map)
//								.forEach(achievement -> {
//									if (gameProfile.getID() != null) {
//										achievement.setGameProfile(repository.getGameProfiles().findById(gameProfile.getID()).orElseThrow());
//										repository.getAchievements().save(achievement);
//									}
//								});
//					}


				});



	}

}
