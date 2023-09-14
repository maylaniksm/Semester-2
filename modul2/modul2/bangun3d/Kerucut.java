package modul2.bangun3d;

import modul2.LKBangun3D;
public class Kerucut extends LKBangun3D{
    double jarijari, tinggi;

    @Override
    public void infoBangun(double jarijari, double tinggi){
        this.jarijari = jarijari;
        this.tinggi = tinggi;

        super.infoBangun(jarijari, tinggi);
        hitungVolume();
    }
    @Override
    public void hitungVolume(){
        volume = 0.33333333333 * 3.14 * jarijari * jarijari * tinggi;
        super.hitungVolume();
    }

    public void setJarijari(double jarijari){
        this.jarijari = jarijari;
    }
    public double getJarijari(){
        return jarijari;
    }
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    public double getTinggi(){
        return tinggi;
    }
}
