package equipment;

import system.element.Element;

public class gun extends weapon {

    public gun(String name, Element e, double damage){
        this.name = name;
        this.element = e;
        this.damage = damage;
        this.elementdamage = e.getAttackBonus();
        this.totaldamage = this.elementdamage + damage;
    }
    
    public gun(String name, double damage){
        this.name = name;
        this.elementdamage = 0;
        this.totaldamage = this.elementdamage + damage;
    }
}
