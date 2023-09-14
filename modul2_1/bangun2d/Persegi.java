package modul2.bangun2d;

import modul2.LKBangun2D;
public class Persegi extends LKBangun2D{
    double sisi;

    @Override
    public void infoBangun(double sisi){
        this.sisi = sisi;
        System.out.print("Sisi: ");
        super.infoBangun(sisi);
        hitungKeliling();
        hitungLuas();
    }
    @Override
    public void hitungKeliling(){
        super.setKeliling(4*sisi);
        super.hitungKeliling();
    }
    @Override
    public void hitungLuas(){
        super.setLuas(sisi*sisi);
        super.hitungLuas();
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }
    public double getSisi(){
        return sisi;
    }
}
