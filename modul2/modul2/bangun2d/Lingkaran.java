package modul2.bangun2d;

import modul2.LKBangun2D;
public class Lingkaran extends LKBangun2D{
    double jarijari;

    @Override
    public void infoBangun(double jari2){
        this.jarijari = jari2;
        System.out.print("Jari-jari: ");
        super.infoBangun(jari2);
        hitungKeliling();
        hitungLuas();
    }
    @Override
    public void hitungKeliling(){
        keliling =3.14*jarijari;
        super.hitungKeliling();
    }
    @Override
    public void hitungLuas(){
        luas = 3.14*jarijari*jarijari;
        super.hitungLuas();
    }

    public void setJarijari(double jari2){
        this.jarijari = jari2;
    }
    public double getJarijari(){
        return jarijari;
    }
}
