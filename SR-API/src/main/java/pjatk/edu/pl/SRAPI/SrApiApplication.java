package pjatk.edu.pl.SRAPI;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import pjatk.edu.pl.SRAPI.apiclient.IPlayersApiClient;
import pjatk.edu.pl.SRAPI.contract.achievement.AchievementDTO;
import pjatk.edu.pl.SRAPI.contract.friend.FriendDTO;
import pjatk.edu.pl.SRAPI.contract.game.GameDTO;
import pjatk.edu.pl.SRAPI.contract.gameProfile.GameProfileDTO;
import pjatk.edu.pl.SRAPI.contract.player.PlayerDTO;
import pjatk.edu.pl.SRAPI.model.*;
import pjatk.edu.pl.SRAPI.repositories.*;
import pjatk.edu.pl.SRAPI.updater.IMap;

@EnableJpaRepositories
@SpringBootApplication
public class SrApiApplication implements CommandLineRunner {

	final PlayerRepository repository;
	final FriendRepository friendRepository;
	final GameProfileRepository gameProfileRepository;
	final AchievementRepository achievementRepository;
	final GameRepository gameRepository;
	final IMap<PlayerDTO,Player> mapper;
	final IMap<FriendDTO,Friend> friendMapper;
	final IMap<GameProfileDTO, GameProfile> gameProfileMapper;
	final IMap<AchievementDTO, Achievement> achievementMapper;
	final IMap<GameDTO, Game> gameMapper;
	final IPlayersApiClient client;

	public SrApiApplication(
			PlayerRepository repository, FriendRepository friendRepository, GameProfileRepository gameProfileRepository, AchievementRepository achievementRepository, GameRepository gameRepository,
			IMap<PlayerDTO,Player> mapper, IPlayersApiClient client,
			IMap<FriendDTO,Friend> friendMapper, IMap<GameProfileDTO,GameProfile> gameProfileMapper, IMap<AchievementDTO, Achievement> achievementMapper, IMap<GameDTO,Game> gameMapper){
		this.repository = repository;
		this.friendRepository = friendRepository;
		this.achievementRepository = achievementRepository;
		this.friendMapper = friendMapper;
		this.gameProfileRepository = gameProfileRepository;
		this.gameProfileMapper = gameProfileMapper;
		this.gameRepository = gameRepository;
		this.achievementMapper = achievementMapper;
		this.gameMapper = gameMapper;
		this.mapper = mapper;
		this.client = client;
	}

	public static void main(String[] args) {
		SpringApplication.run(SrApiApplication.class, args);
	}

	private static final long steamid = 76561198140468616L;

	@Override
	public void run(String... args) throws Exception {

		client.getPlayers(steamid)
				.getPlayersDTO()
				.getPlayerDTOS()
				.stream().map(mapper::map)
				.forEach(p->{
					System.out.println(p.getPersonName());
					repository.save(p);
				});

		client.getFriendList(steamid)
				.getFriendsDTO()
				.stream().map(friendMapper::map)
				//.forEach(friendRepository::save);
				.forEach(f->{
					f.setPlayerParent(repository.findById(steamid).orElseThrow());
					friendRepository.save(f);
				});

//		client.getGameList()
//				.getFriendsListDTO()
//				.getGameDTOS()
//				.stream().map(gameMapper::map)
//				.forEach(gameRepository::save);



//		client.getGameProfileList(steamid)
//				.getGameDTOS()
//				.stream().map(gameProfileMapper::map)
//				.forEach(gameProfile -> {
//					//gameProfile.setGame(gameRepository.findById(gameProfile.getAppID()).orElseThrow());
//
//					var appName = client.getAchievementInfo(steamid, gameProfile.getAppID())
//							.getAchievementsDTO()
//							.getGameName();
//					gameProfile.setAppName(appName);
//
//					gameProfileRepository.save(gameProfile);
//
//					client.getAchievementInfo(steamid, gameProfile.getAppID())
//							.getAchievementsDTO()
//							.getAchievements()
//							.stream().map(achievementMapper::map)
//							.forEach(achievement -> {
//								achievement.setGameProfile(gameProfile);
//								achievementRepository.save(achievement);
//							});
//
//				});


	}

}
