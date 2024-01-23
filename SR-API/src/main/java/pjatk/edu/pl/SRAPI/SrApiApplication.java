package pjatk.edu.pl.SRAPI;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import pjatk.edu.pl.SRAPI.contract.friend.FriendDTO;
import pjatk.edu.pl.SRAPI.contract.gameProfile.GameProfileDTO;
import pjatk.edu.pl.SRAPI.contract.player.PlayerDTO;
import pjatk.edu.pl.SRAPI.repositories.*;
import pjatk.edu.pl.SRAPI.mappers.*;


@EnableJpaRepositories
@SpringBootApplication
@RequiredArgsConstructor
public class SrApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SrApiApplication.class, args);
	}

}
