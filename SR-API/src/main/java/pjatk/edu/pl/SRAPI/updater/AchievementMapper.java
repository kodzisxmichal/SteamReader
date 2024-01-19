package pjatk.edu.pl.SRAPI.updater;

import org.springframework.stereotype.Component;
import pjatk.edu.pl.SRAPI.contract.achievement.AchievementDTO;
import pjatk.edu.pl.SRAPI.contract.player.PlayerDTO;
import pjatk.edu.pl.SRAPI.model.Achievement;
import pjatk.edu.pl.SRAPI.model.Player;
import pjatk.edu.pl.SRAPI.repositories.AchievementRepository;
import pjatk.edu.pl.SRAPI.repositories.PlayerRepository;

@Component
public class AchievementMapper implements IMap<AchievementDTO,Achievement>{
    public AchievementMapper(){}

    @Override
    public Achievement map(AchievementDTO achievementDTO) {
        var achievement = new Achievement();

        achievement.setName(achievementDTO.getApiname());
        achievement.setAchieved(achievementDTO.getAchieved() != 0); // converts int to boolean
        achievement.setUnlockTime(achievementDTO.getUnlocktime());

        return achievement;
    }
}
