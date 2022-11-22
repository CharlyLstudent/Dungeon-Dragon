package Personnages.Equipement.Stuff;

import Game.Cases;
import Personnages.Equipement.EquipementOffensif;

public class Armes extends EquipementOffensif implements Cases {
    public Armes(int attackLevel, String name) {
        super(attackLevel, name);
    }

    @Override
    public void interact() {
        System.out.println("Vous avez trouvé la Lame du roi déchu!");
    }
}
