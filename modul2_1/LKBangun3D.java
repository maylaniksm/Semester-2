package modul2;

public class LKBangun3D {
    public double volume;

    public void infoBangun(double jari2, double tinggi){
        System.out.println("Jari jari: " + jari2 + " , Tinggi: " + tinggi);
    }
    public void infoBangun(double a1){
        System.out.println(a1);
    }
    public void infoBangun(double panjang, double lebar, double tinggi){
        System.out.println("Panjang: " + panjang + ", Lebar: "+lebar+", Tinggi: "+ tinggi);
    }

    public void hitungVolume(){
        System.out.println("Volume: " + volume);
    }
    
    public double getVolume(){
        return volume;
    }
    public void setVolume(double volume){
        this.volume = volume;
    }
}
