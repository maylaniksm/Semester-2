package modul2.bangun3d;
import modul2.LKBangun3D;
import java.util.Scanner;

public class kubus extends LKBangun3D{
    private double rusuk;
    Scanner ready = new Scanner(System.in);
    
    public void setRusuk() {
        System.out.println("Kamu Memilih Kubus");
        System.out.print("Rusuk = ");
        rusuk = ready.nextDouble();
    }

    public double getRusuk() {
        return rusuk;
    }
    
    @Override
    public void infoBangun(){
        System.out.println("Jika kubus memiliki rusuk =  " + getRusuk());
    }
    
    @Override
    public void hitungVolume(){
        volume = rusuk*3;
        super.hitungVolume();
    }

}
