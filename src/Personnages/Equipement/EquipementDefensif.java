package Personnages.Equipement;

abstract public class EquipementDefensif {
    protected String name;
    private String type;
    protected int defenseLevel;

    public EquipementDefensif(String name, int defenseLevel) {
        this.name = name;
        this.defenseLevel = defenseLevel;
    }

    //getter & setter

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
                "Niveau de défense: " + defenseLevel;
    }
}
