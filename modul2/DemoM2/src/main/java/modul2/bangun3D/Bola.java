package modul2.bangun3D;

import modul2.LKBangun3D;

public class Bola extends LKBangun3D {
    private double jarijari;

    @Override
    public void infoBangun (double jarijari) {
        infoBangun(jarijari);
        hitungVolume();
    }

    @Override
    public void hitungVolume () {
        Volume = 1.33333333333*3.14*(jarijari*3);
        super.hitungVolume();
    }

    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }
    private double getJarijari () {return jarijari;}
}
