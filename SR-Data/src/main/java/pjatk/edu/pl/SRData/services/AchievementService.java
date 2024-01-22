package pjatk.edu.pl.SRData.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pjatk.edu.pl.SRData.model.Achievement;
import pjatk.edu.pl.SRData.repositories.AchievementRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AchievementService {
    private final AchievementRepository achievementRepository;

    public List<Achievement> findAll(){
        return achievementRepository.findAll();
    }
}
