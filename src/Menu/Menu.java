package Menu;

import Game.Game;
import Personnages.Personnage;

import java.util.Scanner;
import java.util.Objects;

public class Menu {

    Scanner clavier = new Scanner(System.in);
    String menuChoice;
//function to display the text to chose for create character or leave the game
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
//function to display the text to chose the character type
    public String chooseCharacterType() {
        System.out.println("Quel personnage voulez-vous créer? 1. Guerrier | 2. Magicien | 3. Quitter");
        menuChoice = clavier.nextLine().toLowerCase();
//switch for the different case between the character choice
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
//function to chose the character name based on the player typing
    public String chooseCharacterName() {
        System.out.println("Choisissez un nom pour votre personnage.");
        menuChoice = clavier.nextLine().toLowerCase();
        return menuChoice;
    }
//function to modify the previous choice of name and type
    public void modifyPlayerChoice(Personnage persoDuJoueur) {
        System.out.println("Êtes-vous d'accord avec ces choix?");
        System.out.println("1. Oui, à l'attaque! | 2. Voir mes stats | 3. Non, je veux modifier | 4. Quitter");
        menuChoice = clavier.nextLine().toLowerCase();
       //swtich to chose a condition based on player choice
        switch (menuChoice) {
            //case one start the actual game
            case "1" -> System.out.println("Démarrage de la partie...");
            //case two see the stats of the current character
            case "2" -> {
                System.out.println("Voici les statistiques de votre personnage: ");
                Game gameClass = new Game();
                gameClass.displayStatsOfCharacter(persoDuJoueur);
            }
            //case three edit the character type and name and start the same method again for the choice display
            case "3" -> {
                persoDuJoueur.setType(chooseCharacterType());
                persoDuJoueur.setName(chooseCharacterName());
                modifyPlayerChoice(persoDuJoueur);
            }
            // case four leave the game
            case "4" -> {
                System.out.println("good bye !");
                System.exit(0);
            }
        }
    }
}
