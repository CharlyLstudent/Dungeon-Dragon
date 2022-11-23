package Personnages;

import Game.Cases;
import Game.PlayerOutOfBoard;

abstract public class Personnage{

    protected String name;
    protected String type;
    protected int healthPoint;
    protected int attackDamage;
    protected int pos;

    public Personnage(String name) {
        this.name = name;
    }
    public Personnage (String name, String type){
        this.name = name;
        this.type = type;
        this.healthPoint =  0;
        this.attackDamage = 0;

    }
    public Personnage(String name, int healthPoint, int attackDamage){
        this.name = name;
        this.healthPoint = healthPoint;
        this.attackDamage = attackDamage;
    }
    public String showNameAndTypeOfCreation() {
        return "Votre Personnage" +
              ' ' + name + " sera un " + type;
    }

    @Override
    public String toString() {
        return
                "Nom: " + name + "\r\n" +
                "Type: " + type + "\r\n" +
                "Points de vie: " + healthPoint + "\r\n" +
                "Dégats d'attaque: " + attackDamage + "\r\n";
    }

    public static void main(String[] args) {

    }
    //getter & setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
            this.pos = pos;
    }

}
