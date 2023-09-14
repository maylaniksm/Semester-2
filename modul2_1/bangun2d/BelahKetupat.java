package modul2.bangun2d;

import modul2.LKBangun2D;
public class BelahKetupat extends LKBangun2D {
    double sisi, d1, d2;

    @Override
    public void infoBangun(double sisi, double d1, double d2, int a){
        this.sisi = sisi;
        this.d1 = d1;
        this.d2 = d2;

        super.infoBangun(sisi,d1,d2,2);
        hitungKeliling();
        hitungLuas();
    }
    @Override
    public void hitungKeliling(){
        keliling = 4 * sisi;
        super.hitungKeliling();
    }
    @Override
    public void hitungLuas(){
        luas = (d1 * d2)/2;
        super.hitungLuas();
    }

    double getSisi(){
        return sisi;
    }
    void setSisi(double sisi){
        this.sisi = sisi;
    }

    double getD1(){
        return d1;
    }
    void setD1(double d1){
        this.d1 = d1;
    }

    double getD2(){
        return d2;
    }
    void setD2(double d2){
        this.d2 = d2;
    }
}
