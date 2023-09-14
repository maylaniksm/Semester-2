package modul2.bangun3d;
import modul2.LKBangun3D;
import java.util.Scanner;

public class bola extends LKBangun3D{
    private double jarijr;
    Scanner ready = new Scanner(System.in);
    
    public void setJarijr() {
        System.out.println("Kamu Memilih Bola");
        System.out.print("Jari-jari = ");
        jarijr = ready.nextDouble();
    }
    
    public double getJarijr() {
        return jarijr;
    }
    
    @Override
    public void infoBangun(){
        System.out.println("Jika bola memiliki jari-jari = " + getJarijr());
    } 
    @Override
    public void hitungVolume(){
      volume = 4/3*3.14*(jarijr*jarijr*jarijr);  
      super.hitungVolume();
    }
}
