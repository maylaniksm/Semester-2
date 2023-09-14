package modul2.bangun2D;

import modul2.LKBangun2D;

public class Lingkaran extends LKBangun2D {
    private double jarijari;

    @Override
    public void infoBangun (double jarijari, int i) {
        super.infoBangun(jarijari, 2);
        hitungKeliling();
        hitungLuas();
    }

    @Override
    public void hitungKeliling () {
        Keliling = 3.14*jarijari;
        super.hitungKeliling();
    }

    @Override
    public void hitungLuas () {
        Luas = 3.14*jarijari*jarijari;
        super.hitungLuas();
    }


    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }
    private double getJarijari () {return jarijari;}
}
