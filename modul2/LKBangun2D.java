package modul2;

public class LKBangun2D {
    protected double luas;
    protected double keliling;
    
    protected void setLuas(double luas) {
        this.luas = luas;
    }
    
    protected void setKeliling(double keliling) {
        this.keliling = keliling;
    }
    
    protected double getLuas() {
        return luas;
    }
    
    protected double getKeliling() {
        return keliling;
    }
    
    protected void infoBangun(){

    }

    protected void hitungLuas(){
        System.out.println("Maka Luas Bangun 2D ini adalah = " + luas);
    }
    
    protected void hitungKeliling(){
        System.out.println("Maka Keliling Bangun 2D ini adalah = " + keliling);
    }
}
