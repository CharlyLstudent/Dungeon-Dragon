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

public class Board {
   private  ArrayList<Cases> slot = new ArrayList<>();
    public Board() {

        slot.add(new CaseVide());
        slot.add(new CaseVide());
        slot.add(new Thunder());
        slot.add(new PetitePotion());
        slot.add(new GrandePotion());
        slot.add(new Dragons());
        slot.add(new Goblins());
        slot.add(new Wizards());
        slot.add(new Massue());
        slot.add(new Sword());
        slot.add(new FireBall());


//        for(Cases cases:slot){
//            cases.interact();
//        }
    }

    public void movePersonnage(Personnage personnage, int dice) throws PlayerOutOfBoard {

        if(personnage.getPos()+dice >= slot.size()){
            throw new PlayerOutOfBoard();
        }
        personnage.setPos(personnage.getPos()+dice);
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