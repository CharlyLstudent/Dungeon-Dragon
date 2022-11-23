package Personnages.Equipement.StuffPersonnage;

import Game.Cases;
import Personnages.Equipement.EquipementOffensif;
import Personnages.Personnage;

public class Armes extends EquipementOffensif implements Cases {
    public Armes(int attackLevel, String name) {
        super(attackLevel, name);
    }

    @Override
    public void interact(Personnage personnage) {
        System.out.println("Vous avez trouvé une " + name + " !");
    }
}
