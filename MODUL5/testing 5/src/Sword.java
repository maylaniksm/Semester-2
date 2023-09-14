public class Sword extends weapon{
    public Sword (String nama, double damage, element elementul){
        this.namaweap = nama;
        this.damage = damage;
        this.elemental = elementul;
        this.damageemelemental = elementul.getAdddefense();
        this.total = this.damageemelemental+damage;
    }
}
