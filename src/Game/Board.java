package Game;

import Personnages.Personnage;

public class Board {
    private int nbCases;

    public Board(int nbCases) {
        this.nbCases = nbCases;
    }

    public int getNbCases() {
        return nbCases;
    }

    public void setNbCases(int nbCases) {
        this.nbCases = nbCases;
    }
    public void toString(Personnage player) {
        System.out.print("Plateau: ");
        for (int i = 0; i < nbCases; i++) {
            if (player.getPos() == i) {
                System.out.print("***|");
            } else {
                System.out.print("..|");
            }
        }
        System.out.println(" ");
    }
}
