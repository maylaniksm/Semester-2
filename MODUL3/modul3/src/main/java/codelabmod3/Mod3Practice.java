package codelabmod3;
import java.util.Scanner;

public class Mod3Practice extends Converter {
    public double value;
    
    public double getValue() {
        return value;
    }

    public void setValue(double value, String params) {
       switch(params){
            case "1" -> {
                this.value = setValueToM(value);
            }
            case "2" -> {
                this.value = setValueToCM(value);
            } 
            case "3" -> {
                this.value = setValueToFeet(value);
            }
            case "4" -> {
                this.value = setValueToMiles(value);
            }
       }
    }
    
       
    public static void main(String[] args) {
        Mod3Practice ready = new Mod3Practice();
        String dipilih;
        int jadi;
       
        do {
        Scanner go = new Scanner(System.in);

        System.out.println("Yard Converter to m, cm, feet & miles");
        System.out.println("1. Yard to M");
        System.out.println("2. Yard to CM");
        System.out.println("3. Yard to Feet");
        System.out.println("4. Yard to Miles");
        
        System.out.print("Pilih menu: ");
        dipilih = go.nextLine();
        System.out.print("Masukkan Yard: ");
        int angka = go.nextInt() ;
        ready.setValue(angka, dipilih);
        System.out.println("Hasil: " + ready.getValue() );
        
        System.out.print ("Apakah anda ingin mengulang? 0/1 : ");
        jadi = go.nextInt();
        } while ( jadi == 1);
    }
      
       
}