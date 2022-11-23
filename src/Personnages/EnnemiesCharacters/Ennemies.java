package Personnages.EnnemiesCharacters;

import Game.Cases;
import Personnages.Personnage;

public class Ennemies extends Personnage implements Cases {

    public Ennemies(String name, int healthPoint, int attackDamage) {
        super(name);
        this.healthPoint = healthPoint;
        this.attackDamage = attackDamage;
    }

    @Override
    public void interact(Personnage personnage) {
        System.out.println( "vous rencontrez un " + name + " !");
    }
}
