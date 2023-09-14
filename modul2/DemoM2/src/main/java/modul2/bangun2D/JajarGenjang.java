package modul2.bangun2D;

import modul2.LKBangun2D;

public class JajarGenjang extends LKBangun2D {
    private double alas, tinggi, miring;

    @Override
    public void infoBangun (double alas, double tinggi, double miring) {
        super.infoBangun(alas, tinggi, miring);
        hitungKeliling();
        hitungLuas();
    }

    @Override
    public void hitungKeliling () {
        Keliling = 2*(alas+miring);
        super.hitungKeliling();
    }

    @Override
    public void hitungLuas () {
        Luas = alas*tinggi;
        super.hitungLuas();
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }
    private double getAlas () {return alas;}

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    private double getTinggi () {return tinggi;}

    public void setMiring(double miring) {
        this.miring = miring;
    }
    private double getMiring () {return miring;}
}
