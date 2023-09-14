import java.util.Scanner;


abstract class weapon {
    Scanner input = new Scanner(System.in);
protected String  namaweap;
protected double damage;
protected element elemental;

protected double damageemelemental;
protected double total;

    public String getNamaweap() {
        return namaweap;
    }

    public void setNamaweap(String namaweap) {
        this.namaweap = namaweap;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public element getElemental() {
        return elemental;
    }

    public void setElemental(element elemental) {
        this.elemental = elemental;
    }

    public double getDamageemelemental() {
        return damageemelemental;
    }

    public void setDamageemelemental(double damageemelemental) {
        this.damageemelemental = damageemelemental;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }


    public void namaelemental(){
        if (elemental instanceof api){
            System.out.println("Element : Cyro");
        } else if (elemental instanceof air) {
            System.out.println("Element : Hydro");
        } else if (elemental instanceof listrik){
            System.out.println("Element : Elektro");
        }
    }
}