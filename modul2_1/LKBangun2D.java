package modul2;

public class LKBangun2D {
    public double keliling, luas;

    public void infoBangun(double a1){
        System.out.println(a1);
    }
    public void infoBangun(double a1, double a2, int a3){
        if(a3 == 1){
            System.out.println("Panjang: "+ a1+", Lebar: "+ a2);
        }
        if(a3 == 2){
            System.out.println("Alas: "+ a1+", Tinggi: "+ a2);
        }
    }
    public void infoBangun(double a1, double a2, double a3, int a4){
        if(a4 == 1){
            System.out.println("Alas: "+ a1+", Tinggi: "+ a2 + " Miring: " + a3);
        }
        if(a4 == 2){
            System.out.println("Sisi: "+ a1+", d1: "+ a2 + " d2: " + a3);
        }
    }

    public void hitungKeliling(){
        System.out.println("Keliling: " + keliling);
    }
    public void hitungLuas(){
        System.out.println("Luas: " + luas);
    }

    public double getLuas(){
        return luas;
    }
    public void setLuas(double luas){
        this.luas = luas;
    }

    public double getKeliling(){
        return keliling;
    }
    public void setKeliling(double keliling){
        this.keliling = keliling;
    }
}
