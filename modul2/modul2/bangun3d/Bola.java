package modul2.bangun3d;

import modul2.LKBangun3D;
public class Bola extends LKBangun3D{
    double jarijari;

    @Override
    public void infoBangun(double jarijari){
        this.jarijari = jarijari;
        System.out.print("Jari-jari: ");
        super.infoBangun(jarijari);
        hitungVolume();
    }
    @Override
    public void hitungVolume(){
        volume = 1.33333333333 * 3.14 * (jarijari*3);
        super.hitungVolume();
    }

    public void setJarijari(double jarijari){
        this.jarijari = jarijari;
    }
    public double getJarijari(){
        return jarijari;
    }
}
