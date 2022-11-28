package Personnages.AlliesCharacters;

import Personnages.Equipement.StuffPersonnage.Armes;
import Personnages.Equipement.StuffPersonnage.Bouclier;
import Personnages.Personnage;


public class Guerrier extends Personnage {
    protected Armes arme;
    protected Bouclier bouclier;
    public Guerrier(String name, String type) {
        super(name, type);
        this.healthPoint = 10;
        this.attackDamage = 1;
        arme = new Armes(5, "Épée de doran");
        bouclier = new Bouclier("Bouclier de doran", 5);
    }

    @Override
    public String toString() {
        return
                "Nom: " + name + "\r\n" +
                        "Points de vie: " + healthPoint + "." + "\r\n" +
                        "Dégats d'attaque: " + attackDamage + "." + "\r\n" +
                        "Arme: " + arme.getName() + ", " + arme.getAttackLevel() + " points de dégats." + "\r\n" +
                        "Bouclier: " + bouclier.getName() + ", " + bouclier.getDefenseLevel() + " points de défense.";
    }

}
