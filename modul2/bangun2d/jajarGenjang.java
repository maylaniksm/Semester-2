 package modul2.bangun2d;
import modul2.LKBangun2D;
import java.util.Scanner;

public class jajarGenjang extends LKBangun2D {
    private double tinggi, alas, miring;
    Scanner ready = new Scanner (System.in);
    
    public void setTinggi() {
        System.out.print("Tinggi = ");
        tinggi = ready.nextDouble();
    }
    
    public void setAlas() {
        System.out.println("Kamu Memilih Jajar Genjang");
        System.out.print("Alas = ");
        alas = ready.nextDouble();
    }
    
    public void setMiring() {
        System.out.print("Sisi miring = ");
        miring = ready.nextDouble();
    }
    
    public double getTinggi() {
        return tinggi;
    }
    
     public double getAlas() {
        return alas;
    }
    
     public double getMiring() {
        return miring;
    }
     
    @Override
    public void infoBangun(){
        System.out.println("Jika jajar genjang memiliki tinggi = " + getTinggi() + ", alas = " + getAlas()+ ", dan sisi miring = "+ getMiring());
    }
    @Override
    public void hitungLuas(){
        luas = alas*tinggi;
        super.hitungLuas();
    }
    @Override
    public void hitungKeliling(){
        keliling = 2 * (alas+miring);
        super.hitungKeliling();
    }

}
    