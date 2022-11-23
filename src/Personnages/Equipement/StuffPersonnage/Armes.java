package Personnages.Equipement.StuffPersonnage;

import Game.Cases;
import Personnages.AlliesCharacters.Guerrier;
import Personnages.Equipement.EquipementOffensif;
import Personnages.Personnage;

public class Armes extends EquipementOffensif implements Cases {
    public Armes(int attackLevel, String name) {
        super(attackLevel, name);
    }

    @Override
    public void interact(Personnage personnage) {
        System.out.println("Vous avez trouvé une " + name + " pour Guerrier !");
        if(personnage instanceof Guerrier){
            int newDamage = personnage.getAttackDamage() + attackLevel;
            personnage.setAttackDamage(newDamage);
        }else{
            System.out.println("Vous êtes un Magicien, c'est dommage pour vous :(.");
        }
    }
}
