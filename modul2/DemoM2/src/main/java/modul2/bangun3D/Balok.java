package modul2.bangun3D;

import modul2.LKBangun3D;

public class Balok extends LKBangun3D {
    private double panjang, lebar, tinggi;

    @Override
    public void infoBangun (double panjang, double lebar, double tinggi) {
        super.infoBangun(panjang, lebar, tinggi);
        hitungVolume();
    }

    @Override
    public void hitungVolume () {
        Volume = panjang*lebar*tinggi;
        super.hitungVolume();
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    private double getPanjang () {return panjang;}

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    private double getLebar () {return lebar;}

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    private double getTinggi () {return tinggi;}
}
