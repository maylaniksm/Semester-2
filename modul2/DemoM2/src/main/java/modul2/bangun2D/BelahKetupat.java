package modul2.bangun2D;


import modul2.LKBangun2D;

public class BelahKetupat extends LKBangun2D {
    private double sisi;
    private double d1;
    private double d2;

    @Override
    public void infoBangun (double sisi, double d1, double d2, int i) {
        super.infoBangun(sisi, d1, d2, 1);
        hitungKeliling();
        hitungLuas();
    }

    @Override
    public void hitungKeliling () {
        Keliling = 4*sisi;

        super.hitungKeliling();
    }

    @Override
    public void hitungLuas() {
        Luas = (d1*d2)/2;
        super.hitungLuas();
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    public double getSisi () {return sisi;}

    public void setD1(double d1) {
        this.d1 = d1;
    }
    public double getD1 () {return d1;}

    public void setD2(double d2) { this.d2 = d2; }

    public double getD2 () {return d2;}

}
