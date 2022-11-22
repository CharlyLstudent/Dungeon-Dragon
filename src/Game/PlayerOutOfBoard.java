package Game;

public class PlayerOutOfBoard extends Exception{
    protected String error;


    public PlayerOutOfBoard() {
        this.error = "player is out of board, GG!";
    }

    @Override
    public String toString() {
        return  error;
    }
}