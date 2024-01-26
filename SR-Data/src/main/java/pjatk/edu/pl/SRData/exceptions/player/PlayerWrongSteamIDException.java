package pjatk.edu.pl.SRData.exceptions.player;

public class PlayerWrongSteamIDException extends RuntimeException{
    public PlayerWrongSteamIDException(){
        super("Wrong player steamID");
    }
}
