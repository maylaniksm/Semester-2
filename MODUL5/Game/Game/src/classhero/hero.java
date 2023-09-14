package classhero;

public abstract class hero {
    protected double health_point;
    protected int attack_damage;
    protected double defense;
    protected int level;
    protected boolean isDefeated;

    public hero(int level) {
        this.level = level;
        this.isDefeated = false;
    }

    public abstract void spawnIntro();
    protected abstract double calculateRealDamage();
    
    public void attack(hero target){
        target.riviewdamage(calculateRealDamage());
    }


    public void riviewdamage(Double damage){
        double realdamage = damage - defense;
        if (realdamage > 0) {
            health_point -= realdamage;
        }
        if (health_point <= 0) {
            health_point =0;
            isDefeated = true;
        }
    }

    public void checkStatus(){
        System.out.println("Health Point :" + health_point);
        System.out.println("attack damage :" + attack_damage);
        System.out.println("defense : " + defense);
        System.out.println("level :" + level);
        System.out.println("life status :" + (isDefeated ? "defeated" : "alive"));
    }

    public boolean lifestatus(){
        if (this.isDefeated == true) {
            return false;
        } else {
            return true;
        }
    }
    public void checkBattleStat(String player) {
        System.out.println(player + " HP : " + getHealth_point());
    }

    public double getHealth_point() {
        return health_point;
    }

    

}
