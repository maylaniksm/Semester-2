public class mage extends hero implements magicaldamage{

    public mage(int level){
        super(level);
        setHP(2500+ (level*85));
        setDefense(200+ (level*10));
        setAttackdamage(700+ (level*35)+ (getAttackdamage()*mgldmg));
    }
    @Override
    public void spawnintro() {
        System.out.println("I'M NOT JUST YOUR HEALER");
    }

    @Override
    public double totaldamage() {
        double realdamage = getAttackdamage();
        return realdamage;
    }

    @Override
    public void infostatus(){
        System.out.println("Mage");
        super.infostatus();
    }
}
