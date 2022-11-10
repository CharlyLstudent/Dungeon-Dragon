package Menu;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;
import java.util.Objects;

public class Menu {
    public void StartGame() {

        Scanner clavier = new Scanner(System.in);
        String menuChoice;
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

    public void CharacterChoice() {
        Scanner clavier = new Scanner(System.in);
        String menuChoice;
        boolean choice = false;
        do {
            System.out.println("Quel personnage voulez-vous créer? 1. Guerrier | 2. Magicien | 3. Quitter");
            menuChoice = clavier.nextLine().toLowerCase();
            switch (menuChoice) {
                case "1" ->{
                    System.out.println("Votre Guerrier est prêt!");
                    choice = true;
                }
                case "2" ->{
                    System.out.println("Votre Magicien est prêt!");
                    choice = true;
                }
                case "3" -> {
                    System.out.println("good bye !");
                    System.exit(0);
                }
                default -> System.out.println("Saisissez un choix valide.");
            }
        } while (!choice);

    }

    public void CharacterName() {
        System.out.println("Choisissez un nom pour votre personnage.");

    }
}
