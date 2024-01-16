package pjatk.edu.pl.SRAPI.services;

import org.springframework.stereotype.Service;
import pjatk.edu.pl.SRAPI.model.Friend;
import pjatk.edu.pl.SRAPI.model.Game;
import pjatk.edu.pl.SRAPI.repositories.FriendRepository;
import pjatk.edu.pl.SRAPI.repositories.GameRepository;

import java.util.List;

@Service
public class FriendService {

    FriendRepository repository;

    public FriendService(FriendRepository friendRepository){
        this.repository = friendRepository;
    }

    public List<Friend> findAll(){
        return repository.findAll();
    }
}
