package Personnages.Equipement.StuffPersonnage;

import Game.Cases;
import Personnages.AlliesCharacters.Magicien;
import Personnages.Equipement.EquipementOffensif;
import Personnages.Personnage;

public class Sorts extends EquipementOffensif implements Cases {
    public Sorts(int attackLevel, String name) {
        super(attackLevel, name);
    }

    @Override
    public void interact(Personnage personnage) {
        System.out.println("vous avez trouvez " + name + " pour Magicien!");
        if(personnage instanceof Magicien){
            int newDamage = personnage.getAttackDamage() + attackLevel;
            personnage.setAttackDamage(newDamage);
        }else{
            System.out.println("Vous êtes un Guerrier c'est dommage pour vous :(.");
        }
    }
}
