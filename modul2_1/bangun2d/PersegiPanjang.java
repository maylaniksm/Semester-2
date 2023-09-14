package modul2.bangun2d;

import modul2.LKBangun2D;
public class PersegiPanjang extends LKBangun2D{
    double panjang, lebar;

    @Override
    public void infoBangun(double panjang, double lebar, int a){
        this.panjang = panjang;
        this.lebar = lebar;
        super.infoBangun(panjang,lebar,1);
        hitungKeliling();
        hitungLuas();
    }
    @Override
    public void hitungKeliling(){
        keliling = 2 * (panjang*lebar);
        super.hitungKeliling();
    }
    @Override
    public void hitungLuas(){
        luas = panjang*lebar;
        super.hitungLuas();
    }

    public void setLebar(double lebar){
        this.lebar = lebar;
    }
    public double getLebar(){
        return lebar;
    }
    
    public void setPanjang(double panjang){
        this.panjang = panjang;
    }
    public double getPanjang(){
        return panjang;
    }
}
