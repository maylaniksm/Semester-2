package modul2.bangun3d;

import modul2.LKBangun3D;
public class Kubus extends LKBangun3D{
    double rusuk;

    @Override
    public void infoBangun(double rusuk){
        this.rusuk = rusuk;
        System.out.print("Rusuk: ");
        super.infoBangun(rusuk);
        hitungVolume();
    }
    @Override
    public void hitungVolume(){
        volume = rusuk * 3;
        super.hitungVolume();
    }

    public void setRusuk(double rusuk){
        this.rusuk = rusuk;
    }
    public double getRusuk(){
        return rusuk;
    }
}
