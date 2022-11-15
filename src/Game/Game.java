package Game;
import Menu.*;
import Personnages.*;

import java.util.IdentityHashMap;
import java.util.Objects;

public class Game {
    Menu start = new Menu();

    //function that start the full game by displaying menu functions
    public void fullGame(){
        start.StartGame();
        String type = start.chooseCharacterType();
        String name = start.chooseCharacterName();
        Personnage persoDuJoueur = new Personnage(name,type);
        System.out.println(persoDuJoueur.showNameAndTypeOfCreation());
        start.modifyPlayerChoice(persoDuJoueur);

    }
    //function that display the character's characteristic from the one chosen by the player
    public void displayStatsOfCharacter(Personnage persoDuJoueur){
        EquipementDefensif defensif = new EquipementDefensif(" ",0);
        EquipementOffensif offensif = new EquipementOffensif(0," ");
        if (Objects.equals(persoDuJoueur.getType(), "guerrier")) {
            persoDuJoueur.setHealthPoint(10);
            persoDuJoueur.setAttackDamage(10);
            persoDuJoueur.setName(persoDuJoueur.getName());
            persoDuJoueur.setType("guerrier");
            defensif.setName("Bouclier");
            defensif.setDefenseLevel(3);
            offensif.setName("Epée");
            offensif.setAttackLevel(2);
            System.out.println(persoDuJoueur);
            System.out.println(defensif);
            System.out.println(offensif);
            start.modifyPlayerChoice(persoDuJoueur);

        } else if (Objects.equals(persoDuJoueur.getType(), "magicien")) {
            persoDuJoueur.setHealthPoint(6);
            persoDuJoueur.setAttackDamage(15);
            persoDuJoueur.setName(persoDuJoueur.getName());
            persoDuJoueur.setType("magicien");
            defensif.setName("philtre");
            defensif.setDefenseLevel(3);
            offensif.setName("Sort de feu");
            offensif.setAttackLevel(5);
            System.out.println(persoDuJoueur);
            System.out.println(defensif);
            System.out.println(offensif);
            start.modifyPlayerChoice(persoDuJoueur);
        }
    }
}

