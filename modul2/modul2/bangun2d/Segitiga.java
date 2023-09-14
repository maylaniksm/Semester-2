package modul2.bangun2d;

import modul2.LKBangun2D;
import java.lang.Math;
public class Segitiga extends LKBangun2D{
    double alas, tinggi;

    @Override
    public void infoBangun(double alas, double tinggi, int a){
        this.alas = alas;
        this.tinggi = tinggi;
        super.infoBangun(alas,tinggi,2);
        hitungKeliling();
        hitungLuas();
    }
    @Override
    public void hitungKeliling(){
        keliling = Math.sqrt((tinggi*tinggi)+(alas*alas));
        super.hitungKeliling();
    }
    @Override
    public void hitungLuas(){
        luas = 0.5*alas*tinggi;
        super.hitungLuas();
    }

    double getAlas(){
        return alas;
    }
    void setAlas(double alas){
        this.alas = alas;
    }

    double getTinggi(){
        return tinggi;
    }
    void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
}
