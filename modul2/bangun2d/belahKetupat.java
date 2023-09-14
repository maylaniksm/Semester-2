package modul2.bangun2d;
import modul2.LKBangun2D;
import java.util.Scanner;

public class belahKetupat extends LKBangun2D {
    private double sisi, d1, d2;
    Scanner ready = new Scanner(System.in);
   
    public void setD1() {
        System.out.println("Kamu Memilih Belah Ketupat");
        System.out.print("Diagonal 1 = ");
        d1 = ready.nextDouble();
    }
     
    public void setD2() {
        System.out.print("Diagonal 2 = ");
        d2 = ready.nextDouble();
    }
    
    public void setSisi() {
        System.out.print("Sisi = ");
        sisi = ready.nextDouble();
    }
    
    public double getD1() {
        return d1;
    }

    public double getD2() {
        return d2;
    }
    
    public double getSisi() {
        return sisi;
    }
    

    @Override
    public void infoBangun(){
        System.out.println("Jika belah ketupat memilki sisi = " + getSisi() +", diagonal 1 = " + getD1()+ ", dan diagonal 2 = " + getD2());
    }
    
    @Override
    public void hitungLuas(){
        luas = 0.5 * d1 *d2;
        super.hitungLuas();
    }

    @Override
    public void hitungKeliling(){
        keliling = 4*sisi;
        super.hitungKeliling();
    }
}