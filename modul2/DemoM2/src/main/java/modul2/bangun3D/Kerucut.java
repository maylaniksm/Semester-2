package modul2.bangun3D;

import modul2.LKBangun3D;

public class Kerucut extends LKBangun3D {
    private double jarijari, tinggi;

    @Override
    public void infoBangun (double jarijarik, double tinggik) {
        super.infoBangun(jarijarik, tinggik);
        jarijari = jarijarik;
        tinggi = tinggik;
    }

    @Override
    public void hitungVolume () {
        Volume = 0.33333333333 * 3.14 * jarijari * jarijari * tinggi;
        super.hitungVolume();
    }

    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }
    private double getJarijari () {return jarijari;}

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    private double getTinggi () {return tinggi;}
}
