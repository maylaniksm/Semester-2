public class gun extends weapon{
    public gun(String nama, element e, double damagi){
        this.namaweap = nama;
        this.damage = damagi;
        this.elemental = e;
        this.damageemelemental = e.getAddpoint();
        this.total = this.damageemelemental + damagi;
    }
}
