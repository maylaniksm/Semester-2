package classhero;

import java.util.Random;

import system.magicdamage;

public class mage extends hero implements magicdamage {
    Random acak = new Random();
    int int_random = acak.nextInt(11);

    public mage(int level) {
        super(level);
        if (level > 0) {
            this.health_point = (int) ((2000 + (acak.nextInt(11) + acak.nextInt(11) + acak.nextInt(11)) * 100));
            this.defense = (int) (300 + (acak.nextInt(11) * 10));
            this.attack_damage = (int) (700 + (acak.nextInt(11) * 20));
            for (int i = 1; i < level; i++) {
                this.health_point += 80;
                this.defense += 10;
                this.attack_damage += 30;
            }
        } else {
            this.health_point = (int) (2000 + (acak.nextInt(11) * 300));
            this.defense = (int) (200 + (acak.nextInt(11) * 30));
            this.attack_damage = (int) (700 + (acak.nextInt(11) * 50));
        }
        this.attack_damage += (this.attack_damage * magic_damage_bonus);
    }

    @Override
    public void checkStatus() {
        System.out.println("kelas hero : Mage");
        super.checkStatus();
    }

    @Override
    public void spawnIntro() {
        System.out.println("hati-hati dengan bayanganku, aku bisa dimana saja, jangan sendirian.");
    }

    @Override
    protected double calculateRealDamage() {
        int realdamage = attack_damage;
       return realdamage;
    }
}
