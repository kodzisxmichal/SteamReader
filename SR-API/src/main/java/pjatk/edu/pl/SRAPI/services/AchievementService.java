package pjatk.edu.pl.SRAPI.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pjatk.edu.pl.SRAPI.model.Achievement;
import pjatk.edu.pl.SRAPI.repositories.AchievementRepository;
import pjatk.edu.pl.SRAPI.repositories.SRDataCatalog;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AchievementService {
    private final AchievementRepository achievementRepository;

    public List<Achievement> findAll(){
        return achievementRepository.findAll();
    }
}
