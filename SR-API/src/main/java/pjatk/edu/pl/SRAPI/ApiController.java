package pjatk.edu.pl.SRAPI;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ApiController {
    private final Updater updater;
    @PostMapping("/update/{steamID}")
    public void update(@PathVariable Long steamID){
        updater.updateProfileInfo(steamID);
    }
}
