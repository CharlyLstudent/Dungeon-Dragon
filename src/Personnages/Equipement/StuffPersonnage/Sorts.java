package Personnages.Equipement.StuffPersonnage;

import Game.Cases;
import Personnages.Equipement.EquipementOffensif;
import Personnages.Personnage;

public class Sorts extends EquipementOffensif implements Cases {
    public Sorts(int attackLevel, String name) {
        super(attackLevel, name);
    }

    @Override
    public void interact(Personnage personnage) {
        System.out.println("vous avez trouvez " + name + " !");
    }
}
