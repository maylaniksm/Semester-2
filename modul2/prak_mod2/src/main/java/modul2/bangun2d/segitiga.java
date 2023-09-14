package modul2.bangun2d;
import modul2.LKBangun2D;
import java.util.Scanner;

public class segitiga extends LKBangun2D {
    private double alas, tinggi;
    Scanner ready = new Scanner(System.in);
    
    public void setAlas() {
        System.out.print("Alas: ");
        alas = ready.nextDouble();
    }
    
    public void setTinggi() {
        System.out.println("Kamu Memilih Segitiga");
        System.out.print("Tinggi: ");
        tinggi = ready.nextDouble();
    }
    
    public double getAlas() {
        return alas;
    }
    
     public double getTinggi() {
        return tinggi;
    }
     
    @Override
    public void infoBangun(){
        System.out.println("Jika segitiga memiliki alas = " + getAlas() + ", dan tinggi = " + getTinggi());
    }

    @Override
    public void hitungLuas(){
        luas = 0.5*alas*tinggi;
        super.hitungLuas();
    }

    @Override
    public void hitungKeliling(){
        keliling = alas*3 ;
        super.hitungKeliling();
    } 
}