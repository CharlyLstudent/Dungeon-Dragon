package Personnages.EnnemiesCharacters;

import Game.Cases;
import Game.ConsoleColors;
import Game.Game;
import Personnages.Personnage;
import Menu.Menu;

import java.rmi.UnexpectedException;
import java.util.Objects;

public class Ennemies extends Personnage implements Cases {
    Menu menu = new Menu();

    public Ennemies(String name, int healthPoint, int attackDamage) {
        super(name);
        this.healthPoint = healthPoint;
        this.attackDamage = attackDamage;
    }

    @Override
    public void interact(Personnage personnage) {
        if (personnage.getHealthPoint() <= 0) {
            System.out.println("Vous-êtes mort.");
            menu.endGame();
        }
        System.out.println("vous rencontrez un " + ConsoleColors.ANSI_YELLOW + name + ConsoleColors.ANSI_RESET + " !");



            while (healthPoint > 0) {
                String menuChoice = menu.combatInteractionChoice();
                if (Objects.equals(menuChoice, "attaquer")) {
                System.out.println("Vous attaquez le " + ConsoleColors.ANSI_YELLOW + name + ConsoleColors.ANSI_RESET + "!");
                int hitByCharacter = healthPoint - personnage.getAttackDamage();
                setHealthPoint(hitByCharacter);
                System.out.println("Vous lui avez infligé " + ConsoleColors.ANSI_RED + personnage.getAttackDamage() + " points de dégats " + ConsoleColors.ANSI_RESET + ".");
                System.out.println("il reste " + ConsoleColors.ANSI_GREEN + healthPoint + " points de vie" + ConsoleColors.ANSI_RESET + " au " + ConsoleColors.ANSI_YELLOW + name + ConsoleColors.ANSI_RESET);
                System.out.println("---------------------------------------------");
                System.out.println("Le " + ConsoleColors.ANSI_YELLOW + name + ConsoleColors.ANSI_RESET + " vous attaque en retour!");
                int updateHealthPoint = personnage.getHealthPoint() - attackDamage;
                personnage.setHealthPoint(updateHealthPoint);
                System.out.println("Il vous a infligé " + attackDamage + " dégats. Vous avez perdu " + ConsoleColors.ANSI_RED + attackDamage + " Points de vie." + ConsoleColors.ANSI_RESET);
                System.out.println("il vous reste " + ConsoleColors.ANSI_GREEN + updateHealthPoint + " Points de vie" + ConsoleColors.ANSI_RESET + ".");
                if (healthPoint <= 0) {
                    System.out.println("Vous avez tué le: " + ConsoleColors.ANSI_BLUE + name + ConsoleColors.ANSI_RESET + " !");
                }
            } else if (Objects.equals(menuChoice, "fuir")) {
                    System.out.println("La fuite implique une pénalité.");
                    int dice = (int) (Math.random() * 6 + 1);
                    System.out.println("vous reculez de " + dice + " cases");
                    personnage.setPos(personnage.getPos() - dice);
                    if(personnage.getPos()<=0){
                        personnage.setPos(0);
                    }
                    break;
                }
        }


    }
}
