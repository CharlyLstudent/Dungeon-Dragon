package Game;

import Personnages.Personnage;

public class CaseVide implements Cases{

    @Override
    public void interact(Personnage personnage) {
        System.out.println("Case vide");
    }
}