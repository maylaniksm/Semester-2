package modul2.bangun2d;
import javax.swing.LayoutStyle;

import modul2.LKBangun2D;

public class Jajargenjang extends LKBangun2D{
    double alas, tinggi, miring;

    @Override
    public void infoBangun(double alas, double tinggi, double miring, int a1){
        this.alas = alas;
        this.tinggi = tinggi;
        this.miring = miring;

        super.infoBangun(alas,tinggi,miring,1);
        hitungKeliling();
        hitungLuas();
    }
    @Override
    public void hitungKeliling(){
        keliling = 2 * (alas+miring);
        super.hitungKeliling();
    }
    @Override
    public void hitungLuas(){
        luas = alas * tinggi;
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

    double getMiring(){
        return miring;
    }
    void setMiring(double miring){
        this.miring = miring;
    }
}