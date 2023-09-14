package modul2.bangun2D;

import modul2.LKBangun2D;

public class Persegi extends LKBangun2D {

    private double Sisi;

    public void infoBangun (double sisip) {
        super.infoBangun(sisip);
        Sisi = sisip;
        hitungKeliling();
        hitungLuas();
    }
    public void hitungKeliling () {
        Keliling = 4*Sisi;
        super.hitungKeliling();
    }
    public void hitungLuas () {
        Luas = Sisi*Sisi;
        super.hitungLuas();
    }


    public void setSisi(double Sisi) {
        this.Sisi = Sisi;
    }

    private double getSisi () {return Sisi;}
}
