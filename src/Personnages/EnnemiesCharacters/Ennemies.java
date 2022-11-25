package Personnages.EnnemiesCharacters;

import Game.Cases;
import Game.ConsoleColors;
import Game.Game;
import Personnages.Personnage;
import Menu.Menu;

public class Ennemies extends Personnage implements Cases {

    public Ennemies(String name, int healthPoint, int attackDamage) {
        super(name);
        this.healthPoint = healthPoint;
        this.attackDamage = attackDamage;
    }

    @Override
    public void interact(Personnage personnage) {
        System.out.println("vous rencontrez un " + name + " !");
        int updateHealthPoint = personnage.getHealthPoint() - attackDamage;
        personnage.setHealthPoint(updateHealthPoint);
        int hitByCharacter = healthPoint - personnage.getAttackDamage();
        setHealthPoint(hitByCharacter);
        System.out.println("Vous avez infligé: " + ConsoleColors.ANSI_RED + personnage.getAttackDamage() + " points de dégats " + ConsoleColors.ANSI_RESET + "au " + name + ".");
        System.out.println("Le " + name + " vous a infligé " + attackDamage + " dégats. Vous avez perdu " + ConsoleColors.ANSI_RED + attackDamage + " Points de vie." + ConsoleColors.ANSI_RESET);
        System.out.println( "il vous reste " +ConsoleColors.ANSI_GREEN + updateHealthPoint + " Points de vie" + ConsoleColors.ANSI_RESET+".");

        if (healthPoint <= 0) {
            System.out.println( "Vous avez tué le: " + ConsoleColors.ANSI_BLUE + name + ConsoleColors.ANSI_RESET + " !" );
        } else {
            System.out.println("Le " + ConsoleColors.ANSI_BLUE + name + ConsoleColors.ANSI_RESET + " a pris la fuite!");
        }
    }
}
