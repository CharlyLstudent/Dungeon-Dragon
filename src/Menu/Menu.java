package Menu;

import Game.Game;
import Personnages.Personnage;

import java.util.Scanner;
import java.util.Objects;

public class Menu {

    Scanner clavier = new Scanner(System.in);
    String menuChoice;


    /**
     * function to display the text to chose for create character or leave the game
     */
    public void StartGame() {
        System.out.println("1. Nouveau personnage | 2. Quitter");
        menuChoice = clavier.nextLine().toLowerCase();
        if (Objects.equals(menuChoice, "1")) {
            System.out.println("Parfait, let's go !");
        } else if (Objects.equals(menuChoice, "2")) {
            System.out.println("good bye !");
            System.exit(0);
        } else {
            System.out.println("Saisissez un choix valide.");
            StartGame();
        }

    }

    /**
     * function to display the text to choose the character type
     *
     * @return a String to identify what character the player chose.
     * Default return the function to make a recursive call of the function
     */

    public String chooseCharacterType() {
        System.out.println("Quel personnage voulez-vous créer? 1. Guerrier | 2. Magicien | 3. Quitter");
        menuChoice = clavier.nextLine().toLowerCase();

        // switch for the different case between the character choice

        switch (menuChoice) {
            case "1" -> {
                System.out.println("Votre Guerrier est prêt!");

                return "guerrier";
            }
            case "2" -> {
                System.out.println("Votre Magicien est prêt!");

                return "magicien";
            }
            case "3" -> {
                System.out.println("good bye !");
                System.exit(0);
                return null;
            }
            default -> {
                System.out.println("Saisissez un choix valide.");
                return chooseCharacterType();
            }
        }
    }

    /**
     * function to choose the character name based on the player typing
     *
     * @return the text typed by the player to use it for the name of the character
     */
    public String chooseCharacterName() {
        System.out.println("Choisissez un nom pour votre personnage.");
        menuChoice = clavier.nextLine().toLowerCase();
        return menuChoice;
    }

    /**
     * function to modify the previous choice of name and type
     *
     * @param persoDuJoueur used to get the object created by the player (his character)
     */
    public void modifyPlayerChoice(Personnage persoDuJoueur) {
        System.out.println("Êtes-vous d'accord avec ces choix?");
        System.out.println("1. Oui, à l'attaque! | 2. Voir mes stats | 3. Non, je veux modifier | 4. Quitter");
        menuChoice = clavier.nextLine().toLowerCase();
        Game gameClass = new Game();
        gameClass.modifyPlayerCharacter(menuChoice, persoDuJoueur);
    }

    public String playOptionInGame() {
        System.out.println("1. Lancer les dés| 2. info du personnage | 3. Quitter");
        menuChoice = clavier.nextLine().toLowerCase();
        switch (menuChoice) {
            case "1" -> {
                return "jouer";

            }
            case "2" -> {
                return "stats";
            }

            case "3" -> {
                return "exit";
            }
            default -> {
                System.out.println("Saisissez un choix valide.");
                return null;
            }
        }
    }


    /**
     * function to either restart the game from beginning or quit
     */
    public void endGame() {
        System.out.println("Que voulez-faire?  1. Rejouer | 2. Quitter");
        menuChoice = clavier.nextLine().toLowerCase();
        if (Objects.equals(menuChoice, "1")) {
            Game gameClass = new Game();
            gameClass.fullGame();
        } else if (Objects.equals(menuChoice, "2")) {
            System.exit(0);
        }
    }
}