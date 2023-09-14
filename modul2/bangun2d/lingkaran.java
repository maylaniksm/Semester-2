package modul2.bangun2d;
import modul2.LKBangun2D;
import java.util.Scanner;

public class lingkaran extends LKBangun2D{
    private double jarijr;
    Scanner ready = new Scanner(System.in);
    
    public void setJarijr() {
        System.out.println("Kamu Memilih Lingkaran");
        System.out.print("Jari-jari = ");
        jarijr = ready.nextDouble();
    }
    
    public double getJarijr() {
        return jarijr;
    }
    
    @Override
    public void infoBangun(){
        System.out.println("Jika lingkaran memiliki jari-jari = " + getJarijr());
    }

    @Override
    public void hitungLuas(){
        luas = 3.14*jarijr*jarijr;
        super.hitungLuas();
    }

    @Override
    public void hitungKeliling(){
        keliling = 2*3.14*jarijr;
        super.hitungKeliling();
    }   
}