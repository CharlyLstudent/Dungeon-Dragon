package Game;
import Menu.*;
import Personnages.*;

import java.util.Scanner;

public class Game {
    public void fullGame(){
        Menu start = new Menu();
        start.StartGame();
        start.CharacterChoice();
        start.CharacterName();
        Scanner clavier = new Scanner(System.in);
        Personnage ChoixJoueur = new Personnage(clavier.nextLine(),"guerrier" );
        System.out.println(ChoixJoueur);
    }
}
