package Personnages;

public class Personnage {

    private String name;
    private String type;
    private int healthPoint;
    private int attackDamage;
    private EquipementDefensif defensif;
    private EquipementOffensif offensif;

    public Personnage(){

//        Personnages.Personnage guerrier = new Personnages.Personnage();
//        guerrier.setAttackDamage(10);
//        guerrier.setHealthPoint(10);
//        guerrier.setType("Guerrier");
//        guerrier.setName("Enzo");
//        System.out.println("je suis un " + guerrier.getType() + " j'ai " + guerrier.getHealthPoint() + " points de vie et " + guerrier.getAttackDamage() + " dégats d'attaque");
    }
    public Personnage(String name){
        this.name = name;
    }

    public Personnage (String name, String type){
        this.name = name;
        this.type = type;
        this.healthPoint =  0;
        this.attackDamage = 0;
        this.defensif= new EquipementDefensif(" ", 0);
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
    public EquipementDefensif getDefensif() {
        return defensif;
    }

    public void setDefensif(EquipementDefensif defensif) {
        this.defensif = defensif;
    }

    public EquipementOffensif getOffensif() {
        return offensif;
    }

    public void setOffensif(EquipementOffensif offensif) {
        this.offensif = offensif;
    }

}
