package modul2.bangun3D;

import modul2.LKBangun3D;

public class Kubus extends LKBangun3D {
    private double rusuk;

    @Override
    public void infoBangun (double sisikb) {
        super.infoBangun(sisikb);
        rusuk = sisikb;
        hitungVolume();
    }

    @Override
    public void hitungVolume () {
        Volume = rusuk*3;
        super.hitungVolume();
    }

    public void setRusuk(double rusuk) {
        this.rusuk = rusuk;
    }
    private  double getRusuk () {return rusuk;}
}
