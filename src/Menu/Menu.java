package Menu;

import Personnages.Personnage;

import java.util.Scanner;
import java.util.Objects;

public class Menu {
    Scanner clavier = new Scanner(System.in);
    String menuChoice;
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

    public String chooseCharacterType() {
            System.out.println("Quel personnage voulez-vous créer? 1. Guerrier | 2. Magicien | 3. Quitter");
            menuChoice = clavier.nextLine().toLowerCase();

            switch (menuChoice) {
                case "1" ->{
                    System.out.println("Votre Guerrier est prêt!");

                    return "guerrier";
                }
                case "2" ->{
                    System.out.println("Votre Magicien est prêt!");

                    return"magicien";

                }
                case "3" -> {
                    System.out.println("good bye !");
                    System.exit(0);
                    return null;
                }
                default ->{
                    System.out.println("Saisissez un choix valide.");
                    return chooseCharacterType();
                }
            }


    }

    public String chooseCharacterName() {
        System.out.println("Choisissez un nom pour votre personnage.");
        menuChoice = clavier.nextLine().toLowerCase();
        return menuChoice;
    }

    public  void modifyPlayerChoice(){
        System.out.println("Êtes-vous d'accord avec ces choix?" );
        System.out.println("1. Oui, à l'attaque! | 2. Non, je veux modifier" );
        menuChoice = clavier.nextLine().toLowerCase();
    }
}
