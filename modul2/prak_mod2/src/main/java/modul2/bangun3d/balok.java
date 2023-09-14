package modul2.bangun3d;
import modul2.LKBangun3D;
import java.util.Scanner;

public class balok extends LKBangun3D {
    private double panjang, lebar ,tinggi;
    Scanner ready = new Scanner(System.in);
    
     public void setLebar() {
        System.out.println("Kamu Memilih Balok");
        System.out.print("Lebar = ");
        lebar = ready.nextDouble();
    }
     
    public void setPanjang() {
        System.out.print("Panjang = ");
        panjang = ready.nextDouble();
    }
    
    public void setTinggi() {
        System.out.print("Tinggi = ");
        tinggi = ready.nextDouble();
    }
    
    public double getLebar() {
        return lebar;
    }
     
    public double getPanjang() {
        return panjang;
    }
    
    public double getTinggi() {
        return tinggi;
    }
    
    @Override
    public void infoBangun(){
        System.out.println("Jika balok memiliki panjang = " + getPanjang() + ", lebar = " + getLebar() + ", dan tinggi = "+ getTinggi());
    }

    @Override
    public void hitungVolume(){
        volume = panjang*lebar*tinggi;
        super.hitungVolume();
    }
}
