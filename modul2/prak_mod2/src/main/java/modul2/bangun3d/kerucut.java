package modul2.bangun3d;
import modul2.LKBangun3D;
import java.util.Scanner;
        
public class kerucut extends LKBangun3D{
    private double tinggi, jarijr;
    Scanner ready = new Scanner(System.in);
    
    public void setTinggi() {
        System.out.print("Tinggi = ");
        tinggi = ready.nextDouble();
    }
    
    public void setJarijr() {
        System.out.println("Kamu Memilih Kerucut");
        System.out.print("Jari-jari = ");
        jarijr = ready.nextDouble();
    }
    
    public double getTinggi() {
        return tinggi;
    }
    
    public double getJarijr() {
        return jarijr;
    }
     
    @Override
    public void infoBangun(){
        System.out.println("Jika kerucut memiliki jari-jari = " + getJarijr() +", dan tinggi " + getTinggi());
    }
    
    @Override
    public void hitungVolume(){
        volume = 0.33 * 3.14 * jarijr * jarijr * tinggi;
        super.hitungVolume();
    }

}
