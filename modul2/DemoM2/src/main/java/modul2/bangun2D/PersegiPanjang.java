package modul2.bangun2D;

import modul2.LKBangun2D;

public class PersegiPanjang extends LKBangun2D {

    private double panjang, lebar;

    @Override
    public void infoBangun (double panjang, double lebar, int i) {
        this.panjang = panjang;
        super.infoBangun(panjang, lebar, 3);
        this.hitungKeliling();
        this.hitungLuas();
    }

    @Override
    public void hitungKeliling () {
        Keliling = 2*(panjang+lebar);
        super.hitungKeliling();
    }

    @Override
    public void hitungLuas () {
        Luas = panjang*lebar;
        super.hitungLuas();
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    private double getPanjang() {return panjang;}

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    private double getLebar () {return lebar;}
}
