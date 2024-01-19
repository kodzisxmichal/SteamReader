package pjatk.edu.pl.SRAPI.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pjatk.edu.pl.SRAPI.model.GameProfile;
import pjatk.edu.pl.SRAPI.repositories.GameProfileRepository;
import pjatk.edu.pl.SRAPI.repositories.SRDataCatalog;

import java.util.List;

@RequiredArgsConstructor
@Service
public class GameProfileService {
    private final GameProfileRepository gameProfileRepository;

    public GameProfile findByID(Long ID){
        return gameProfileRepository.findById(ID).orElseThrow();
    }
    public List<GameProfile> findAll(){
        return gameProfileRepository.findAll();
    }
}
