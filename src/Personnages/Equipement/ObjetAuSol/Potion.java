package Personnages.Equipement.ObjetAuSol;

import Game.Cases;

public class Potion implements Cases {
    public int soin;

    public Potion(int soin) {
        this.soin = soin;
    }

    @Override
    public void interact() {
        if(this.soin == 5){
            System.out.println("Grande potion de soin!");
        }else{
            System.out.println("Petite potion de soin!");
        }
    }
}