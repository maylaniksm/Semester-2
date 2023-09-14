package equipment;

import system.element.Element;
import system.element.air;
import system.element.api;

public abstract class weapon {
    protected String name;
    protected double damage;
    protected Element element;
    protected double elementdamage;
    protected double totaldamage;
    
    public String getName() {
        return name;
    }

    public double getDamage() {
        return damage;
    }

    public Element getElement() {
        return element;
    }

    public double getElementdamage() {
        return elementdamage;
    }

    public double getTotaldamage() {
        return totaldamage;
    }

    public void weapontype(){

    }

    public void elementtype(){
        if (element instanceof api) {
            System.out.println("element : Api");
        } else if (element instanceof air){
            System.out.println("element : air");
        } else{
            System.out.println("element : -");
        }
    }
}
