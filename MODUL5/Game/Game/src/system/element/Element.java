package system.element;


public abstract class Element {
    protected double attackBonus;
    protected double defenseBonus;

    public double getAttackBonus() {
        return attackBonus;
    }

    public double getDefenseBonus() {
        return defenseBonus;
    }
}
