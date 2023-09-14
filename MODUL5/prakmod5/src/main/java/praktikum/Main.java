package praktikum;
import java.util.Scanner;

abstract class Hero {
    protected int healthPoint;
    protected int attackDamage;
    protected int defense;
    protected int level;
    protected boolean isDefeated;

    public Hero(int level) {
        this.level = level;
        isDefeated = false;
    }

    public void attack(Hero target) {
        System.out.println("Hero " + getClass().getSimpleName() + " Attack " + target.getClass().getSimpleName());
        target.reviewDamage(attackDamage);
        target.checkStatus();
    }
//PENGURANGAN DARAH
    public void reviewDamage(double damage) {
        double realDamage = damage - defense;
        if (realDamage < 0) realDamage = 0;
        healthPoint -= realDamage ;
        if (healthPoint <= 0) {healthPoint = 0;isDefeated = true;}
    }

    public abstract void spawnIntro();

    public void checkStatus() {

        System.out.println("Hero "  + getClass().getSimpleName() +  "- HP:" + healthPoint);
    }
    public abstract void firstInitiate();
}


class Assassin extends Hero implements CriticalDamage,Weaponable {
    private Weapon wp = new Gun();
    private int weaponDamage;
    private String weaponElement;

    public Assassin(int level) {
        super(level);
        healthPoint = 3000 + (level * 90);
        defense = 300 + (level * 15);
        attackDamage = 800 + (level * 30);
        weaponDamage = wp.getDamage();
        weaponElement = wp.getElement();
        attackDamage += attackDamage * bonusDamage;
        useWeapon();
    }
    public void useWeapon() {
        attackDamage += weaponDamage;
        if (weaponElement != null) {
            attackDamage += wp.getDamage();
        }
    }
    @Override
    public void spawnIntro() {
        System.out.println("KILL ME IF U CAN!");
    }

    @Override
    public void firstInitiate() {
        System.out.println(getClass().getSimpleName());
        System.out.println("Health : " + healthPoint);
        System.out.println("Level : " + level);
        System.out.println("Defense : " + defense);
        System.out.println("Life Status : " + (!isDefeated));
        System.out.println("Weapon : " + wp.getName());
        System.out.println("Weapon DMG (include with Element) : " + wp.getDamage());
        System.out.println("Weapon Element : " + wp.getElement());
        System.out.println("Element DMG : " + wp.getElementDMG());
    }

}

class Tank extends Hero {
    private Armor armor;
    public Tank(int level) {
        super(level);
        healthPoint = 7000 + (level * 200);
        defense = 500 + (level * 15);
        attackDamage = 500 + (level * 20);
        armor = new Armor();
    }

    @Override
    public void reviewDamage(double damage) {
        if (armor.getStrength() < 0) {
            super.reviewDamage(damage);
        } else {
            armor.decreaseStrength(damage);
        }
        System.out.println("Armor : " + Math.max(0,armor.getStrength()));
    }

    @Override
    public void spawnIntro() {
        System.out.println("Komm auf mich zu, wenn du dich traust!!");
    }

    @Override
    public void firstInitiate() {
        System.out.println(getClass().getSimpleName());
        System.out.println("Level : " + level);
        System.out.println("Defense : " + defense);
        System.out.println("Life Status : " + (!isDefeated));
        System.out.println("Armor Element : " + Armor.element.getClass().getSimpleName());
        System.out.println("Armor Defense : "+Armor.element.getAdditionalDamage());
    }
}

class Mage extends Hero implements MagicalDamage {
    public Mage(int level) {
        super(level);
        healthPoint = 2500 + (level * 85);
        defense = 200 + (level * 10);
        attackDamage = 700 + (level * 35);
        attackDamage += attackDamage * magicDamageBonus;
    }

    @Override
    public void spawnIntro() {
        System.out.println("Werden Sie Zeuge meiner arkanen Macht!!");
    }

    @Override
    public void firstInitiate() {
        System.out.println(getClass().getSimpleName());
        System.out.println("Level : " + level);
        System.out.println("Defense : " + defense);
        System.out.println("Life Status : " + (!isDefeated));
    }
}


interface CriticalDamage {
    double bonusDamage = 0.4;
}
interface Weaponable{
     void useWeapon();
}
interface Armorable{
    void useArmor();
}
interface MagicalDamage {
    double magicDamageBonus = 0.8;
}

abstract class Weapon{
    public abstract String getName();
    public abstract int getDamage();
    public abstract String getElement();
    public abstract int getElementDMG();
    Element Element = new FireElement();
}

class Gun extends Weapon{
    @Override
    public String getName() {return "Gun";}
    @Override
    public int getDamage() { return (super.Element != null) ? super.Element.getAdditionalDamage()+100 :100 ;}

    @Override
    public String getElement() {return super.Element.getClass().getSimpleName();}

    @Override
    public int getElementDMG() {return super.Element.getAdditionalDamage();}

}
class Sword extends Weapon{

    @Override
    public String getName() {return "Sword";}

    @Override
    public int getDamage() { return (super.Element != null) ? super.Element.getAdditionalDamage()+10 : 120 ;}

    @Override
    public String getElement() {return super.Element.getClass().getSimpleName();}

    @Override
    public int getElementDMG() {return super.Element.getAdditionalDamage();}
}
abstract class Element {
    public abstract int getAdditionalDamage();
}
class FireElement extends Element {
    @Override
    public int getAdditionalDamage() {
        return 50;
    }
}

class WaterElement extends Element {
    @Override
    public int getAdditionalDamage() {
        return 30;
    }
}

class EarthElement extends Element {
    @Override
    public int getAdditionalDamage() {
        return 20;
    }
}

class WindElement extends Element {
    @Override
    public int getAdditionalDamage() {
        return 40;
    }
}


class Armor {
    static Element element = new WaterElement();

    private double strength;

    public Armor() {
        strength = 1700 + element.getAdditionalDamage();
    }

    public double getStrength() {
        return strength;
    }

    public void decreaseStrength(double dmg) {
        strength = strength - dmg;
    }
}

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int round = 1;
        Hero[] Hero = new Hero[3];
        Scanner scanner = new Scanner(System.in);

        //player 1
        Hero[0] = new Assassin(5);
        //player 2
        Hero[1] = new Tank(5);

        for (int i = 0; i < 2 ; i++) {
            int numbering = 1;
            System.out.println("== Player "+ numbering + "===");
            Hero[i].firstInitiate();
            System.out.println("++++");
            numbering++;
        }
        System.out.println("FIGHT!!!!");
        do {
            System.out.println("++++++++++++++++++++++++++++");
            System.out.println("Round : " + round);
            System.out.println("++++++++++++++++++++++++++++");
            System.out.println("Player 1 Turn ");
            Hero[0].spawnIntro();
            Hero[0].attack(Hero[1]);

            System.out.println("\n\n");
            System.out.println("Player 2 Turn ");
            Hero[1].attack(Hero[0]);
            Hero[1].spawnIntro();
            System.out.println("+++++++++++++++++++++++++++++");
            Thread.sleep(1000);
            round++;
            if (Hero[0].isDefeated || Hero[1].isDefeated) {
                System.out.println("---------- WINNER ----------");
                System.out.println(Hero[0].isDefeated ?
                        Hero[1].getClass().getSimpleName() + " WIN "
                        :
                        //ELSE IF
                        Hero[1].isDefeated ? Hero[0].getClass().getSimpleName() + " WIN" :"" );
                break;
            }
        }while(true);

    }
}

