package Personnages;

public class EquipementOffensif {

    private String weapon;
    private String spell;
    private int attackLevel;
    private String name;

    public EquipementOffensif(int attackLevel, String name) {
        this.attackLevel = attackLevel;
        this.name = name;
    }

    //getter & setter
    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
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
