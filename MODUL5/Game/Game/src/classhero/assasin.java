package classhero;

import java.util.Random;

import equipment.weapon;
import equipment.weaponable;
import system.critdamage;

public class assasin extends hero implements critdamage, weaponable  {
    Random acak = new Random();
    int int_random = acak.nextInt(11);
    public weapon w;

    public assasin(int level) {
        super(level);
        if (level > 0) {
            this.health_point = (int) ((2000 + (acak.nextInt(11) + acak.nextInt(11) + acak.nextInt(11)) * 100));
            this.defense = (int) (200 + (acak.nextInt(11) * 30));
            this.attack_damage = (int) (700 + (acak.nextInt(11) * 50));
            for (int i = 1; i < level; i++) {
                this.health_point += 90;
                this.defense += 15;
                this.attack_damage += 30;
            }
        } else {
            this.health_point = (int) (2000 + (acak.nextInt(11) * 300));
            this.defense = (int) (200 + (acak.nextInt(11) * 30));
            this.attack_damage = (int) (700 + (acak.nextInt(11) * 50));
        }
        this.attack_damage += (this.attack_damage * Atk_dmg_bonus);
    }

    @Override
    public void checkStatus() {
        System.out.println("kelas hero : Assasin");
        super.checkStatus();
        if (w != null) {
            w.weapontype();
            System.out.println(" weapon name :" + w.getName());
            w.elementtype();
            System.out.println("weapon damage : " + w.getDamage());
            System.out.println("element damage :" + w.getElementdamage());
            System.out.println("total weapon damage :" + w.getTotaldamage());
        }
    }

    @Override
    public void useWeapon(weapon w) {
        this.w = w;
    }

    @Override
    public void spawnIntro() {
        System.out.println("hati-hati dengan bayanganku, aku bisa dimana saja, jangan sendirian.");
    }

    @Override
    protected double calculateRealDamage() {
        int realdamage = attack_damage;
        if (w != null) {
            if (w.getElementdamage() != 0) {
                realdamage += w.getElementdamage();
            }
            realdamage += w.getDamage();
        }
        return realdamage;
    }


}