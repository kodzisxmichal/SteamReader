package pjatk.edu.pl.SRData.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import pjatk.edu.pl.SRData.exceptions.friend.FriendNotFoundException;
import pjatk.edu.pl.SRData.exceptions.player.PlayerNotFoundException;
import pjatk.edu.pl.SRData.exceptions.player.PlayerWrongSteamIDException;

@ControllerAdvice
public class DataExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {PlayerNotFoundException.class, FriendNotFoundException.class})
    protected ResponseEntity<Object> handleNotFound(RuntimeException ex, WebRequest request){
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(value = {PlayerWrongSteamIDException.class})
    protected ResponseEntity<Object> handleBadRequest(RuntimeException ex, WebRequest request){
        return ResponseEntity.badRequest().body(ex.getMessage());
    }
}
