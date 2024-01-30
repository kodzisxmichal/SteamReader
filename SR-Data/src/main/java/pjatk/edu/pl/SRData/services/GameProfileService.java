package pjatk.edu.pl.SRData.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pjatk.edu.pl.SRData.model.Friend;
import pjatk.edu.pl.SRData.model.GameProfile;
import pjatk.edu.pl.SRData.repositories.GameProfileRepository;

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
    public List<GameProfile> findAllByPlayerSteamID(Long steamID){
        var gameProfiles = gameProfileRepository.findAllByPlayerSteamID(steamID);
        if(gameProfiles.isEmpty()){
            for(int i=0;i<9;i++) {
                var gameProfilesInfo = new GameProfile();
                gameProfilesInfo.setAppName("No Permission");
                gameProfiles.add(gameProfilesInfo);
            }
        }
        return gameProfiles;
    }
}
