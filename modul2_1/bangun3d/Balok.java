package modul2.bangun3d;

import modul2.LKBangun3D;
public class Balok extends LKBangun3D{
    double panjang,lebar,tinggi;

    @Override
    public void infoBangun(double panjang, double lebar, double tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;

        super.infoBangun(panjang,lebar,tinggi);
        hitungVolume();
    }
    @Override
    public void hitungVolume(){
        volume = panjang * lebar * tinggi;
        super.hitungVolume();
    }
}
