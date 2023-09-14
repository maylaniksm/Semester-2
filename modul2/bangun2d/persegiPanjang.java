package modul2.bangun2d;
import modul2.LKBangun2D;
import java.util.Scanner;

public class persegiPanjang extends LKBangun2D{
    private double panjang, lebar;
    Scanner ready = new Scanner(System.in);
    
    public void setPanjang() {
        System.out.print("Panjang: ");
        panjang = ready.nextDouble();
    }
    
    public void setLebar() {
        System.out.println("Kamu Memilih Persegi Panjang");
        System.out.print("Lebar: ");
        lebar = ready.nextDouble();
    }
    
     public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }
    
     @Override
    public void infoBangun(){
        System.out.println("Jika persegi panjang memiliki panjang = " + getPanjang() + ", dan lebar = " + getLebar());
    }

    @Override
    public void hitungLuas(){
        luas = panjang*lebar;
        super.hitungLuas();
    } 
    @Override
    public void hitungKeliling(){
        keliling = 2*(panjang*lebar);
        super.hitungKeliling();
    }
}
 

