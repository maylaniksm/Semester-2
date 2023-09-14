 public class assasin extends hero implements critdamage,weaponable{
    private weapon weap;
    public assasin(int level){
        super(level);
        setHP(3000 + (level*90));
        setDefense(300+(level*15));
        setAttackdamage(800+ (level*30));
    }

     @Override
     public void spawnintro() {
         System.out.println("Jokes over your Dead!!!");
     }

     @Override
     public void useweap(weapon senjata) {
        this.weap = senjata;
     }
     @Override
     public void infostatus(){
         System.out.println("Assasin");
         super.infostatus();
         if (weap != null){
             System.out.println("Weapon : "+weap.getDamage());
             weap.namaelemental();
             System.out.println("Damage Weapon : "+weap.getDamage());
             System.out.println("Damage Elemental Weapon : "+weap.getDamageemelemental());
             System.out.println("Total Damage : "+weap.getTotal());
         }
     }

     @Override
     public double totaldamage(){
        double realdamage = getAttackdamage();
        if (weap != null){
            if (weap.getDamageemelemental() !=0){
                realdamage += weap.getDamageemelemental();
            }
            realdamage +=weap.getDamage();
        }
        return realdamage;
     }
 }
