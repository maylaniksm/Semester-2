package modul2.bangun3D;

import modul2.LKBangun3D;

public class Tabung extends LKBangun3D {
    private double jarijari, tinggi;

    @Override
    public void infoBangun (double jarijarit, double tinggit) {
        super.infoBangun(jarijarit, tinggit);
        jarijari=jarijarit;
        tinggi=tinggit;
        hitungVolume();
    }

    @Override
    public void hitungVolume () {
        Volume = 3.14*jarijari*jarijari*tinggi;
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
