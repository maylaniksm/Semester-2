public class tank extends hero implements armorable{
    private armor ar;
    public tank(int level){
        super(level);
        setHP(7000 + (level*200));
        setDefense(500+(level*15));
        setAttackdamage(500+ (level*20));
    }
    @Override
    public void spawnintro() {
        System.out.println("GET OVER HERE!!");
    }

    @Override
    public double totaldamage() {
        double realdamage= getAttackdamage();
        return realdamage;
    }

    @Override
    public void infostatus(){
        System.out.println("Tank");
        super.infostatus();
        if (ar!= null){
            System.out.println("ARMORED TANK");
            ar.tipeelement();
            System.out.println("Armor : "+ar.getDefensepoint());
            System.out.println("Elemental Armor : "+ar.getEledefpoint());
            System.out.println("Total : "+ar.getRealdefensepoint());
        }
    }

    @Override
    public void usearmor(armor ar) {
        this.ar = ar;
    }
    //@Override
    public void battlestatus(String pemain){
        super.battlestatus(pemain);
        if (ar != null && ar.realdefensepoint !=0){
            if (ar.realdefensepoint<0){
                ar.realdefensepoint = 0;
                System.out.println(pemain+"Armor : "+(int) ar.getRealdefensepoint());
            }
        }
    }

}
