package pjatk.edu.pl.SRData.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pjatk.edu.pl.SRData.model.Game;
import pjatk.edu.pl.SRData.services.GameService;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/games")
public class GameController {

    private final GameService gameService;

    @GetMapping
    public ResponseEntity<List<Game>> getGames(){
        log.info("Looking for game list");
        List<Game> games= gameService.findAll();
        log.info("Success");

        return new ResponseEntity<>(games, HttpStatus.OK);
    }
}
