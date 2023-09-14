package classhero;

import java.util.Random;

import equipment.armor;
import system.Armorable;

public class tank extends hero implements Armorable{
    public armor armor;
    Random acak = new Random();
    int int_random = acak.nextInt(11);

    public tank(int level){
        super(level);
        if (level > 0) {
            this.health_point = (int)(6000 + ((acak.nextInt(11))*400));
            this.defense = (int)(600 +(acak.nextInt(11)*30));
            this.attack_damage = (int)(500 + (acak.nextInt(11)*20));
            for (int i = 1; i < level; i++) {
                this.health_point += 200;
                this.defense += 15;
                this.attack_damage += 20;
            }
        } else {
            this.health_point = (int)(6000 + ((acak.nextInt(11))*300));
            this.defense = (int)(600 +(acak.nextInt(11)*30));
            this.attack_damage = (int)(500 + (acak.nextInt(11)*20));
        }
    }
    @Override
    public void checkStatus(){
        System.out.println("kelas : tank");
        super.checkStatus();
        if (armor != null) {
            System.out.println("tank ber armor");
            armor.elementtype();
            System.out.println("armor defense :" + armor.getDefensepoint());
            System.out.println("armor element :" + armor.getElementdefensepoint());
            System.out.println("total armor defense :"  + armor.getRealdefensepoint());
        }
    }

    public double getRealdefensepoint(){
        return armor.getRealdefensepoint();
    }

    @Override
    public void useArmor(armor a){
        this.armor = a;
    }

    @Override
    public void spawnIntro(){
        System.out.println("otot kawat tulang besi!!");
    }

    @Override
    protected double calculateRealDamage(){
        int realdamage = attack_damage;

        return realdamage;
    }

    @Override
    public void riviewdamage(Double damage){
        double realdamage = damage - this.defense;

        if (armor != null && armor.getRealdefensepoint()>0) {
            armor.reducerealdefensepoint(realdamage);
            if (armor.getRealdefensepoint()==0) {
                realdamage = (int) armor.getExcessdamage();
            } else if (getRealdefensepoint()>0) {
                realdamage = 0;
            }
        }

        if (realdamage>0) {
            health_point -= realdamage;
        }
        if (health_point <= 0) {
            health_point = 0;
            isDefeated = true;
        }
    }

    @Override
    public void checkBattleStat(String player) {
        super.checkBattleStat(player);
        if (armor != null) {
            System.out.println(player + " Defense : " + armor.getRealdefensepoint());
        }

    }
}
