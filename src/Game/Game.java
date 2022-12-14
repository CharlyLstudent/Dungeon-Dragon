package Game;

import Menu.*;
import Personnages.*;
import Personnages.AlliesCharacters.Guerrier;
import Personnages.AlliesCharacters.Magicien;

import java.util.Objects;

public class Game {
    Menu start = new Menu();
    Personnage persoDuJoueur;

    /**
     * function that start the full game by displaying menu functions
     */
    public void fullGame() {

        start.StartGame();
        String type = start.chooseCharacterType();
        String name = start.chooseCharacterName();
        switch (type) {
            case "guerrier" -> persoDuJoueur = new Guerrier(name, type);
            case "magicien" -> persoDuJoueur = new Magicien(name, type);
        }
        System.out.println(persoDuJoueur.showNameAndTypeOfCreation());
        start.modifyPlayerChoice(persoDuJoueur);
        Board board = new Board();
        board.displayGameBoard(persoDuJoueur);
        playATurn(persoDuJoueur,board);

    }

    /**
     * function that display the character's characteristic from the one chosen by the player
     *
     * @param persoDuJoueur the character that the player created
     */
    public void displayStatsOfCharacter(Personnage persoDuJoueur) {
        if (Objects.equals(persoDuJoueur.getType(), "guerrier")) {
            System.out.println(persoDuJoueur);
            start.modifyPlayerChoice(persoDuJoueur);

        } else if (Objects.equals(persoDuJoueur.getType(), "magicien")) {
            System.out.println(persoDuJoueur);
            start.modifyPlayerChoice(persoDuJoueur);
        }
    }

    /**
     * creation of the dice
     */
    private int randomDice() {
        return (int) (Math.random() * 6 + 1);
    }

    /**
     * function to play a turn in the game with the dice.
     *
     * @param personnage the class used to set and get the pos of the character.
     * @param board      the class used to make the board.
     */


    private void playATurn(Personnage personnage, Board board) {
            boolean gameStatus = true;
        while (gameStatus) {
            String gameOption = start.playOptionInGame();
            if(Objects.equals(gameOption, "jouer")){
                int dice = randomDice();
                try {
                    board.movePersonnage(personnage, dice);
                    System.out.println(dice);
                    board.displayGameBoard(personnage);
                    //board.interact(personnage);
                    board.getSlot().get(personnage.getPos()).interact(personnage);// faire une fonction qui vas r??cup??rer position, r??cup??rer case et r??cup??rer l'interact, r??cup??rer position du personnage.
                } catch (PlayerOutOfBoard e) {
                    System.out.println(e);
                    break;
                }
            }else if(Objects.equals(gameOption,"stats")) {
                System.out.println(persoDuJoueur);
            } else if (Objects.equals(gameOption, "exit")) {
                gameStatus = false;
            }
        }
        start.endGame();
    }

    /**
     * function to start the game,to see the character stats, to modify the player's character (name and type) or leave the game.
     *
     * @param menuChoice    the variable used to get the text typed by the player.
     * @param persoDuJoueur the player's character.
     */
    public void modifyPlayerCharacter(String menuChoice, Personnage persoDuJoueur) {
        //switch to choose a condition based on player choice
        switch (menuChoice) {
            //case one start the actual game
            case "1" -> System.out.println("D??marrage de la partie...");
            //case two see the stats of the current character
            case "2" -> {
                System.out.println("Voici les statistiques de votre personnage: ");
                displayStatsOfCharacter(persoDuJoueur);
            }
            //case three edit the character type and name and start the same method again for the choice display
            case "3" -> {
                String type = start.chooseCharacterType();
                String name = start.chooseCharacterName();
                switch (type) {
                    case "guerrier" -> {
                        persoDuJoueur = new Guerrier(name, type);
                        start.modifyPlayerChoice(persoDuJoueur);
                    }
                    case "magicien" -> {
                        persoDuJoueur = new Magicien(name, type);
                        start.modifyPlayerChoice(persoDuJoueur);
                    }
                }
            }
            // case four leave the game
            case "4" -> {
                System.out.println("good bye !");
                System.exit(0);
            }
        }
    }
}