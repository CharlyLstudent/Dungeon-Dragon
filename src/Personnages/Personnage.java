package Personnages;

public class Personnage {

    private String name;
    private String type;
    private int healthPoint;
    private int attackDamage;

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

    public Personnage(String name,String type){
        this.name = name;
        this.type = type;
    }


    public String showNameAndTypeOfCreaction() {
        return "Votre Personnage" +
              ' ' + name + " sera un " + type ;
    }

    @Override
    public String toString() {
        return "Personnage{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", healthPoint=" + healthPoint +
                ", attackDamage=" + attackDamage +
                '}';
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


}
