package Personnages.Equipement.ObjetAuSol.Soins;

import Game.Cases;
import Personnages.Personnage;

public class Potion implements Cases {
    protected int soin;
    protected String name;

    public Potion(int soin, String name) {
        this.soin = soin;
        this.name = name;
    }

    @Override
    public void interact(Personnage personnage) {
            System.out.println("Vous avez trouvez " +  name + " ! Vous vous sentez plus vivant.");
            int newHealth = personnage.getHealthPoint() + soin;
            personnage.setHealthPoint(newHealth);
    }
}