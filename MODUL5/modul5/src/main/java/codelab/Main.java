package codelab;
import java.util.Scanner;

interface Destroyable{
    void destroyed(double argPercentageDmg);
    int getZombieInfo();
}

class Zombie implements Destroyable{
    protected int health;
    @Override
    //kondisi sebagai penghilang darah zombie
    public void destroyed(double argPercentageDmg) {
        double reducedBlood = this.health * argPercentageDmg;
        this.health = (int) (this.health - reducedBlood);
    }
    public int getZombieInfo(){
        return this.health;
    }
}
class WalkingZombie extends Zombie{
    private int health  = 100;
    WalkingZombie(){
        super.health = this.health;
    }

    public void destroyed() {
        super.destroyed(0.04);
    }

    @Override
    public int getZombieInfo() {
       return super.getZombieInfo();
    }
}
class Armor implements Destroyable{
    protected int strength = 50 ;
    @Override
    public void destroyed(double argPercentageDmg) {
        double reducedArmor = this.strength * argPercentageDmg;
        this.strength = (int) (this.strength - reducedArmor);
    }

    @Override
    public int getZombieInfo() {
        return strength;
    }
}
class ArmoredZombie extends  Zombie{
    private int health = 100;

    Armor Armor = new Armor();
    ArmoredZombie(){
        super.health = this.health;
    }
    @Override
    public void destroyed(double argPercentageDmg) {
        //mengecek apakah armor kurang dari 0
        //jika kurang dari 0 maka darahnya akan dikurangi
        if (this.Armor.strength <= 0) {
            super.destroyed(0.02);
        }else{
            Armor.destroyed(0.04);
            System.out.println("----------------Information Armor-----------------");
            System.out.println((Armor.strength<=0) ? "Armor Destroyed" : "Remaining Armor = "+ Armor.strength);
            System.out.println("--------------------------------------------");
        }
    }
}
class Plant{
    Destroyable objWZ = new WalkingZombie();
    Destroyable objAZ= new ArmoredZombie();
    void attack(WalkingZombie argWZ){
         //mengecek apakah pilihan user itu memilih walking zombie atau armored zombie
        if (argWZ instanceof WalkingZombie) {
            objWZ.destroyed(0.04);
            System.out.println("----------------Information-----------------");
            System.out.println((objWZ.getZombieInfo()<=0) ? "Walking Zombies Are Dead": "Remaining Walking Zombie Blood : "+objWZ.getZombieInfo()+"" );
            System.out.println("--------------------------------------------");
        }else{
            objAZ.destroyed(0.02);
            System.out.println("----------------Information-----------------");
            System.out.println((objAZ.getZombieInfo()<=0) ? "Armored Zombies Are Dead": "Remaining Armored Zombie Blood : "+objAZ.getZombieInfo()+"" );
            System.out.println("--------------------------------------------");
        }

    }


}
public class Main {

    public static void main(String[] args) {

        System.out.print("---------------------------\n");
        System.out.println("Tanaman VS Jombi");
        Scanner objInput = new Scanner(System.in);
        WalkingZombie objWZ = new WalkingZombie();
        ArmoredZombie objAZ = new ArmoredZombie();
        Plant objPlant= new Plant();
        do {
            //pilihan untuk serang zombie
            System.out.println("1.Walking Zombie\n2.Armored Zombie");
            System.out.print("Attack To : ");
            int choose = objInput.nextInt();
            if (choose == 1) {
                objPlant.attack(objWZ);
            }else{
                objPlant.attack(null);
            }
        }while(true);
    }
}