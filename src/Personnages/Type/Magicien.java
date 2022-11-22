package Personnages.Type;

import Personnages.Equipement.Stuff.Philtre;
import Personnages.Equipement.Stuff.Sorts;
import Personnages.Personnage;

public class Magicien extends Personnage {
Sorts sort;
Philtre philtre;
    public Magicien(String name, String type) {
        super(name, type);
        this.healthPoint = 6;
        this.attackDamage = 15;
        sort = new Sorts(5, "Embrasement");
        philtre = new Philtre("Stun potion", 3);
    }

    @Override
    public String toString() {
        return
                "Nom: " + name + "\r\n" +
                        "Points de vie: " + healthPoint + "." + "\r\n" +
                        "Dégats d'attaque: " + attackDamage + "." + "\r\n" +
                        "Arme: " + sort.getName() + ", " + sort.getAttackLevel() + " points de dégats." + "\r\n" +
                        "Bouclier: " + philtre.getName() + ", " + philtre.getDefenseLevel() + " points de défense.";
    }
}
