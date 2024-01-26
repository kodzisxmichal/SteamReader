package pjatk.edu.pl.SRData.exceptions.player;



public class PlayerNotFoundException extends RuntimeException{
        public PlayerNotFoundException(){
            super("Player not found");
        }
}
