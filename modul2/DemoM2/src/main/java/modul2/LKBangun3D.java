package modul2;

public class LKBangun3D {
    protected double Volume;

    protected void infoBangun(double h1, double h2, double h3) {
        System.out.println("Panjang: " + h1 + ", Lebar: " + h2 + " Tinggi: " + h3);
    }
    protected void infoBangun(double h1, int i) {
        if (i==1) {
            System.out.println("Jari-jari: " + h1);
        }
    }
    protected void infoBangun(double h1) {
        System.out.println("Sisi: " + h1);
    }

    protected void infoBangun(double h1, double h2, int i) {
        if (i==1) {
            System.out.println("Jari-jari: " + h1 + ", Tinggi: " + h2);
        }
    }
    protected void infoBangun(double h1, double h2) {
        System.out.println("Jari-jari: " + h1 + ", Tinggi: " + h2);
    }

    protected void hitungVolume() {
        System.out.println("Volume: 12.0" +Volume);
    }
    public void setVolume(double Volume) { this.Volume = Volume;}
    public double getVolume () {return this.Volume;}
}
