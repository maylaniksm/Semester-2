/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2;

/**
 *
 * @author Maylani Kusuma
 */
public class LKBangun2D {
    //Protected : Atribut yg diparent bisa dipake di anaknya atau subsclassnya
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

