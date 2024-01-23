package pjatk.edu.pl.SRAPI;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ApiController {
    private final Updater updater;
    @PutMapping("/update/{steamID}")
    public ResponseEntity<String> update(@PathVariable Long steamID){
        updater.updateProfileInfo(steamID);
        return ResponseEntity.ok("Data updated successfully");
    }
}
