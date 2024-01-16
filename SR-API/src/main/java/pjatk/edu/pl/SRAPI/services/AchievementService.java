package pjatk.edu.pl.SRAPI.services;

import org.springframework.stereotype.Service;
import pjatk.edu.pl.SRAPI.model.Achievement;
import pjatk.edu.pl.SRAPI.model.Friend;
import pjatk.edu.pl.SRAPI.repositories.AchievementRepository;
import pjatk.edu.pl.SRAPI.repositories.FriendRepository;

import java.util.List;

@Service
public class AchievementService {
    AchievementRepository repository;

    public AchievementService(AchievementRepository achievementRepository){
        this.repository = achievementRepository;
    }

    public List<Achievement> findAll(){
        return repository.findAll();
    }
}
