package modul2;

public class LKBangun2D {
    protected double Keliling;
    protected double Luas;

    public void infoBangun(double sisi, double d1, double d2, int i) {
        if (i == 1) {
            System.out.println("Sisi: " + sisi + ", d1: " + d1 + " d2: " + d2);}
    }

    protected void infoBangun(double alas, double tinggi, double miring) {
        System.out.println("Alas: " + alas + ", Tinggi: " + tinggi + " Miring: " + miring);
    }
    protected void infoBangun(double jarijari, int i) {
        if (i==2) {
            System.out.println("Jari-jari: " + jarijari);
        }
    }
    protected void infoBangun(double sisip) {
        System.out.println("Sisi: " + sisip);
    }
    protected void infoBangun(double panjang, double lebar, int i) {
        if (i==3) {
            System.out.println("Panjang: " + panjang + ", Lebar: " + lebar);
        }
    }
    protected void infoBangun(double alass, double tinggis) {

        System.out.println("Alas: " + alass + ", Tinggi: " + tinggis);
    }

    protected void hitungKeliling() {System.out.println("Keliling: 4.0" + Keliling);}
    protected void hitungLuas () {System.out.println("Luas: 3.0" + Luas);}
    public double getLuas () {return Luas;}
    public void setLuas (double Luas) { this.Luas = Luas;}
    public double getKeliling () {return Keliling;}
    public void setKeliling (double Keliling) {this.Keliling = Keliling;}
}
