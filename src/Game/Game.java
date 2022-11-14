package Game;
import Menu.*;
import Personnages.*;

public class Game {
    public void fullGame(){
        Menu start = new Menu();
        start.StartGame();
        String type = start.chooseCharacterType();
        String name = start.chooseCharacterName();
        Personnage ChoixJoueur = new Personnage(name,type);
        System.out.println(ChoixJoueur.showNameAndTypeOfCreaction());
        start.modifyPlayerChoice();
    }
}
