package pjatk.edu.pl.SRData.exceptions.friend;



public class FriendNotFoundException extends RuntimeException{
        public FriendNotFoundException(){
            super("Friend not found");
        }
}
