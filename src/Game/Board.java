package Game;

import Personnages.Equipement.ObjetAuSol.Potion;
import Personnages.Equipement.Stuff.Armes;
import Personnages.Personnage;

import java.util.ArrayList;

public class Board {
   private  ArrayList<Cases> slot = new ArrayList<>();
    public Board() {

        slot.add(new CaseVide());
        slot.add(new CaseVide());
        slot.add(new Armes(5,"Lame du roi déchu"));
        slot.add(new Potion(5));
        slot.add(new Potion(3));
        slot.add(new CaseVide());


//        for(Cases cases:slot){
//            cases.interact();
//        }
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