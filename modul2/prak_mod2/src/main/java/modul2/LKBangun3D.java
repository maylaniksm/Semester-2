/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2;

/**
 *
 * @author Maylani Kusuma
 */
public class LKBangun3D {
  protected double volume;
    
    protected void setVolume(double volume){
        this.volume = volume;
    }
    
    protected double getVolume(){
        return volume;
    }
    
    protected void infoBangun(){
        
    }
    protected void hitungVolume(){
        System.out.println("Maka Volume Bangun 3d ini adalah = " + volume);
    }  
}