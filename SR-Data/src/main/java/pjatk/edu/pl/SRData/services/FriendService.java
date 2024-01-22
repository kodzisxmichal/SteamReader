package pjatk.edu.pl.SRData.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pjatk.edu.pl.SRData.model.Friend;
import pjatk.edu.pl.SRData.repositories.FriendRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FriendService {
    private final FriendRepository friendRepository;

    public List<Friend> findAll(){
        return friendRepository.findAll();
    }
}
