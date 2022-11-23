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
        int nbCase = 64;
        for(int i =0; i < nbCase; i++){
            switch(i){
                case 45, 52, 56, 62 -> slot.add(new Dragons());
                case 10, 20, 25, 32, 35, 36, 37, 40, 44, 47 -> slot.add(new Wizards());
                case 3, 6, 9, 12, 15, 18, 21, 24, 27, 30 -> slot.add(new Goblins());
                case 2, 11, 5, 22, 38 -> slot.add(new Massue());
                case 19, 26, 42, 53 -> slot.add(new Sword());
                case 1, 4, 8, 17, 23 -> slot.add(new Thunder());
                case 48, 49 ->  slot.add(new FireBall());
                case 7, 13, 31, 33, 39, 43 -> slot.add(new PetitePotion());
                case 28, 41 -> slot.add(new GrandePotion());
            }
        }
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