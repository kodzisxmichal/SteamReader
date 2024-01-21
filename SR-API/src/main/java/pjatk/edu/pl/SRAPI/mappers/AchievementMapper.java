package pjatk.edu.pl.SRAPI.mappers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pjatk.edu.pl.SRAPI.contract.achievement.AchievementDTO;
import pjatk.edu.pl.SRAPI.model.Achievement;
import pjatk.edu.pl.SRAPI.repositories.ICatalogData;
import pjatk.edu.pl.SRAPI.repositories.SRDataCatalog;


@Component
@RequiredArgsConstructor
public class AchievementMapper implements IMap<AchievementDTO,Achievement>{

    private final ICatalogData repository;
    @Override
    public Achievement map(AchievementDTO achievementDTO, Long ID) {
            var achievement = new Achievement();

            achievement.setName(achievementDTO.getApiname());
            achievement.setAchieved(achievementDTO.getAchieved() != 0); // converts int to boolean
            achievement.setUnlockTime(achievementDTO.getUnlocktime());

            return achievement;
    }
}
