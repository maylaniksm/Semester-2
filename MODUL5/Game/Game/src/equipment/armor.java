package equipment;

import system.element.Element;
import system.element.air;
import system.element.api;

public class armor {
    private double defensepoint;
    private double realdefensepoint;
    private double elementdefensepoint;
    private double excessdamage = 0;
    Element element;

    public double getDefensepoint() {
        return defensepoint;
    }
    public double getRealdefensepoint() {
        return realdefensepoint;
    }
    public double getElementdefensepoint() {
        return elementdefensepoint;
    }
    public double getExcessdamage() {
        return excessdamage;
    }

    public armor(double defensepoint, Element e){
        this.defensepoint = defensepoint;
        this.element = e;
        this.elementdefensepoint = e.getDefenseBonus();
        this.realdefensepoint = this.defensepoint + e.getDefenseBonus();
    } 
    
    public armor(double defensepoint){
        this.defensepoint = defensepoint;
        this.realdefensepoint = this.defensepoint + 0;
    } 
    public void reducerealdefensepoint(double damage){
        this.realdefensepoint -= damage;
        if (this.realdefensepoint < 0 ) {
            this.excessdamage -= realdefensepoint;
            this.realdefensepoint = 0;
        }
    }

    public void elementtype(){
        if (element instanceof api) {
            System.out.println("armor element : Api");
        } else if(element instanceof air){
            System.out.println("armor element : Air");
        } else {
            System.out.println("armor element : -");
        }
    }
}
