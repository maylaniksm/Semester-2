abstract class hero {
private double HP;
private double attackdamage;
private double defense;

    public hero(int level) {
        this.level = level;
        this.isdefeated = false;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    private int level;
private boolean isdefeated;

    public double getHP() {
        return HP;
    }

    public void setHP(double HP) {
        this.HP = HP;
    }

    public double getAttackdamage() {
        return attackdamage;
    }

    public void setAttackdamage(double attackdamage) {
        this.attackdamage = attackdamage;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isIsdefeated() {
        return isdefeated;
    }

    public void setIsdefeated(boolean isdefeated) {
        this.isdefeated = isdefeated;
    }

    public abstract void spawnintro();

    public void reviewdagame(double damage){
        setHP(getHP()-damage);
        if (getHP()<=0){
            setHP(0);
            setIsdefeated(true);
        }
    }

    public void infostatus(){
        System.out.println("HP :"+getHP());
        System.out.println("Damage : "+getAttackdamage());
        System.out.println("Level : "+getLevel());
        System.out.println(" "+isIsdefeated());

    }

    public abstract double totaldamage();

    public void battlestatus(String pemain){
        System.out.println(""+pemain +"" +"HP : "+(int)HP);
    }
    public void attack(hero target){
        target.reviewdagame(totaldamage());
    }
}


