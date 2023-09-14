package modul2.bangun2d;
import modul2.LKBangun2D;
import java.util.Scanner;

public class persegi extends LKBangun2D {
    public double sisi;
    Scanner ready = new Scanner(System.in);
    
    public void setSisi() {  
        System.out.println("Kamu Memilih Persegi");
        System.out.print("Sisi = ");
        sisi = ready.nextDouble();
    }
    
    public double getSisi(){
        return sisi;
    }
    
    @Override
    public void infoBangun(){
        System.out.println("Jika persegi memiliki sisi = " + getSisi());
    }

    @Override
    public void hitungLuas (){
        luas = sisi*sisi;
        super.hitungLuas();
    }

    @Override
    public void hitungKeliling(){
        keliling = 4*sisi;
        super.hitungKeliling();
    }
}
