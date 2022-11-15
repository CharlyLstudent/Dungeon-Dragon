package Personnages;

public class EquipementDefensif {
    private String shield;
    private String philtre;
    private int defenseLevel;
    private String name;
 public EquipementDefensif(String name, int defenseLevel){
     this.name = name;
     this. defenseLevel = defenseLevel;
 }
    //getter & setter
    public String getShield() {
        return shield;
    }

    public void setShield(String shield) {
        this.shield = shield;
    }

    public String getPhiltre() {
        return philtre;
    }

    public void setPhiltre(String philtre) {
        this.philtre = philtre;
    }

    public int getDefenseLevel() {
        return defenseLevel;
    }

    public void setDefenseLevel(int defenseLevel) {
        this.defenseLevel = defenseLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EquipementDefensif" + "\r\n" +
                "nom: " + name + "\r\n" +
                "Niveau de défense: " + defenseLevel ;
    }
}
