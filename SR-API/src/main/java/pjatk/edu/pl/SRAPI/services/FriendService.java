package pjatk.edu.pl.SRAPI.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pjatk.edu.pl.SRAPI.model.Friend;
import pjatk.edu.pl.SRAPI.repositories.FriendRepository;
import pjatk.edu.pl.SRAPI.repositories.SRDataCatalog;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FriendService {
    private final FriendRepository friendRepository;

    public List<Friend> findAll(){
        return friendRepository.findAll();
    }
}
