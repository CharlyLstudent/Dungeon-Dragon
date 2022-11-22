package Personnages.Equipement;

abstract public class EquipementOffensif {
   protected String name;
    private String type;
    protected int attackLevel;


    public EquipementOffensif(int attackLevel, String name) {
        this.attackLevel = attackLevel;
        this.name = name;
    }

    //getter & setter
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAttackLevel() {
        return attackLevel;
    }

    public void setAttackLevel(int attackLevel) {
        this.attackLevel = attackLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Equipement offensif: " + "\r\n"+
                "Nom: " + name + "\r\n" +
                "Dégats: " + attackLevel + "\r\n";
    }
}
