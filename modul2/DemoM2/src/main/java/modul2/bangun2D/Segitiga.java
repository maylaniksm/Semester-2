package modul2.bangun2D;

import modul2.LKBangun2D;
import java.lang.Math;

public class Segitiga extends LKBangun2D {
    private double alas, tinggi;

    @Override
    public void infoBangun (double alass, double tinggis) {
        super.infoBangun(alass, tinggis);
        alas= alass;
        tinggi= tinggis;
        hitungKeliling();
        hitungLuas();

    }

    @Override
    public void hitungKeliling () {
        Keliling = Math.sqrt((tinggi*tinggi)+(alas*alas));
        super.hitungKeliling();
    }

    @Override
    public void hitungLuas () {
        Luas = (alas*tinggi)/2;
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
}
