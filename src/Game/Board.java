package Game;

import Personnages.EnnemiesCharacters.Dragons;
import Personnages.EnnemiesCharacters.Goblins;
import Personnages.EnnemiesCharacters.Wizards;
import Personnages.Equipement.ObjetAuSol.ArmesGuerrier.Massue;
import Personnages.Equipement.ObjetAuSol.ArmesGuerrier.Sword;
import Personnages.Equipement.ObjetAuSol.ArmesMagicien.FireBall;
import Personnages.Equipement.ObjetAuSol.ArmesMagicien.Thunder;
import Personnages.Equipement.ObjetAuSol.Soins.GrandePotion;
import Personnages.Equipement.ObjetAuSol.Soins.PetitePotion;
import Personnages.Equipement.ObjetAuSol.Soins.Potion;
import Personnages.Equipement.StuffPersonnage.Armes;
import Personnages.Personnage;

import java.util.ArrayList;
import java.util.Objects;

public class Board {
    private ArrayList<Cases> slot = new ArrayList<>();

    //    public Board() {
//        int nbCase = 64;
//        for (int i = 0; i < nbCase + 1; i++) {
//            switch (i) {
//                case 45, 52, 56, 62 -> slot.add(new Dragons());
//                case 10, 20, 25, 32, 35, 36, 37, 40, 44, 47 -> slot.add(new Wizards());
//                case 3, 6, 9, 12, 15, 18, 21, 24, 27, 30 -> slot.add(new Goblins());
//                case 2, 11, 5, 22, 38 -> slot.add(new Massue());
//                case 19, 26, 42, 53 -> slot.add(new Sword());
//                case 1, 4, 8, 17, 23 -> slot.add(new Thunder());
//                case 48, 49 -> slot.add(new FireBall());
//                case 7, 13, 31, 33, 39, 43 -> slot.add(new PetitePotion());
//                case 28, 41 -> slot.add(new GrandePotion());
//                default -> slot.add(new CaseVide());
//            }
//        }
//    }
    public Board() {
        int nbCase = 64;
        int dragon = 4;
        int wizard = 10;
        int goblin = 10;
        int massue = 5;
        int sword = 4;
        int thunder = 5;
        int fireBall = 2;
        int smallPotion = 6;
        int bigPotion = 2;
        for (int i = 0; i < nbCase + 1; i++) {
            slot.add(i, new CaseVide());
        }

        while (dragon > 0) {
            int random = (int) (Math.random() * nbCase + 1);
            if(slot.get(random)instanceof CaseVide) {
                slot.set(random, new Dragons());
                dragon = dragon - 1;
            }
        }
        while (wizard > 0) {
            int random = (int) (Math.random() * nbCase + 1);
            if(slot.get(random)instanceof CaseVide) {
                slot.set(random, new Wizards());
                wizard = wizard - 1;
            }
        }
        while (goblin > 0) {
            int random = (int) (Math.random() * nbCase + 1);
            if(slot.get(random)instanceof CaseVide) {
                slot.set(random, new Goblins());
                goblin = goblin - 1;
            }
        }
        while (massue > 0) {
            int random = (int) (Math.random() * nbCase + 1);
            if(slot.get(random)instanceof CaseVide) {
                slot.set(random, new Massue());
                massue = massue - 1;
            }
        }
        while (sword > 0) {
            int random = (int) (Math.random() * nbCase + 1);
            if(slot.get(random)instanceof CaseVide) {
                slot.set(random, new Sword());
                sword = sword - 1;
            }
        }
        while (thunder > 0) {
            int random = (int) (Math.random() * nbCase + 1);
            if(slot.get(random)instanceof CaseVide) {
                slot.set(random, new Thunder());
                thunder = thunder - 1;
            }
        }
        while (fireBall > 0) {
            int random = (int) (Math.random() * nbCase + 1);
            if(slot.get(random)instanceof CaseVide) {
                slot.set(random, new FireBall());
                fireBall = fireBall - 1;
            }
        }
        while (smallPotion > 0) {
            int random = (int) (Math.random() * nbCase + 1);
            if(slot.get(random)instanceof CaseVide) {
                slot.set(random, new PetitePotion());
                smallPotion = smallPotion - 1;
            }
        }
        while (bigPotion > 0) {
            int random = (int) (Math.random() * nbCase + 1);
            if(slot.get(random)instanceof CaseVide) {
                slot.set(random, new GrandePotion());
                bigPotion = bigPotion - 1;
            }
        }
    }

    public void movePersonnage(Personnage personnage, int dice) throws PlayerOutOfBoard {

        if (personnage.getPos() + dice >= slot.size()) {
            throw new PlayerOutOfBoard();
        }
        personnage.setPos(personnage.getPos() + dice);
    }

    public ArrayList<Cases> getSlot() {
        return slot;
    }

    public void setSlot(ArrayList<Cases> slot) {
        this.slot = slot;
    }

    public void displayGameBoard(Personnage player) {
        System.out.print("Plateau: ");
        for (int i = 0; i < slot.size(); i++) {
            if (player.getPos() == i) {
                System.out.print("***|");
            } else {
                System.out.print("..|");
            }
        }
        System.out.println(" ");
    }
}