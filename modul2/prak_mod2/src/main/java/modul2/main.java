package modul2;
import modul2.bangun2d.*;
import modul2.bangun3d.*;
import java.util.Scanner;

public class main{

    public static void main(String[] args) {
        Scanner ready = new Scanner(System.in);
        boolean go = true;

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("       Selamat Datang di Kalkulator    ");
        System.out.println("Menghitung Luas Keliling Volume Dengan Lebih Mudah");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Kamu ingin menghitung apa? ");
        System.out.println("1.Bangun Datar 2 Dimensi ");
        System.out.println("2.Bangun Ruang 3 Dimensi ");

        do{
            System.out.print("Silahkan pilih: ");
            int pilih = ready.nextInt();
            
            if (pilih==1){
                hitung2D();
            } else if (pilih==2){
                hitung3D();
            } else {
                System.out.println("Pilih dengan benar!");
                go = false;
            }
        } while(go == false);
        ready.close();
    }
    
    public static void hitung2D(){
        Scanner ready = new Scanner(System.in);
        int dipilih;

        System.out.println("Kalkulator Penghitung Luas dan Keliling 2D");
            System.out.println("1.Persegi");
            System.out.println("2.Persegi Panjang");
            System.out.println("3.Segitiga");
            System.out.println("4.Lingkaran");
            System.out.println("5.Belah Ketupat");
            System.out.println("6.Jajar Genjang");
            System.out.print("Pilih bangun yang ingin dihitung : ");
            dipilih = ready.nextInt();

            switch(dipilih){
                case 1 -> {
                    persegi segi= new persegi();
                    segi.setSisi();
                    segi.infoBangun();
                    segi.hitungLuas();
                    segi.hitungKeliling();
            }
                case 2 -> {
                    persegiPanjang jang = new persegiPanjang();
                    jang.setPanjang();
                    jang.setLebar();
                    jang.infoBangun();
                    jang.hitungLuas();
                    jang.hitungKeliling();
            }
                case 3 -> { 
                    segitiga tiga = new segitiga();
                    tiga.setAlas();
                    tiga.setTinggi();
                    tiga.infoBangun();
                    tiga.hitungKeliling();
                    tiga.hitungLuas();
            }
                case 4 -> {
                    lingkaran karan = new lingkaran();
                    karan.setJarijr();
                    karan.infoBangun();
                    karan.hitungKeliling();
                    karan.hitungLuas();
            }
                case 5 -> {
                    belahKetupat tupat = new belahKetupat();
                    tupat.setD1();
                    tupat.setD2();
                    tupat.setSisi();
                    tupat.infoBangun();
                    tupat.hitungKeliling();
                    tupat.hitungLuas();
            }
                case 6 -> {
                    jajarGenjang jang = new jajarGenjang();
                    jang.setAlas();
                    jang.setTinggi();
                    jang.setMiring();
                    jang.infoBangun();
                    jang.hitungLuas();
                    jang.hitungKeliling();
            }
                default -> {
                    System.out.println("Pilih angka dengan benar!");
            }
            }ready.close();   
    }

    public static void hitung3D(){
        Scanner ready = new Scanner(System.in);
        int choose;
        
        System.out.println("Kalkulator Penghitung Bangun Ruang 3D");
            System.out.println("1.Kubus");
            System.out.println("2.Bola");
            System.out.println("3.Kerucut");
            System.out.println("4.Balok");
            System.out.println("5.Tabung");
            System.out.print("Pilih bangun yang ingin dihitung = ");
            choose = ready.nextInt();

            switch(choose){
                case 1 : 
                   kubus bus = new kubus();
                    bus.setRusuk();
                    bus.infoBangun();
                    bus.hitungVolume();
                    break;
                case 2 :
                    bola la = new bola();
                    la.setJarijr();
                    la.infoBangun();
                    la.hitungVolume();
                    break;
                case 3:
                    kerucut cut = new kerucut();
                    cut.setJarijr();
                    cut.setTinggi();
                    cut.infoBangun();
                    cut.hitungVolume();
                    break;
                case 4:
                    balok lok = new balok();
                    lok.setPanjang();
                    lok.setLebar();
                    lok.setTinggi();
                    lok.infoBangun();
                    lok.hitungVolume();
                    break;
                case 5:
                    tabung bung = new tabung();
                    bung.setJarijr();
                    bung.setTinggi();
                    bung.infoBangun();
                    bung.hitungVolume();
                    break;
                default:
                    System.out.println("Pilih angka dengan benar!");
          
            }
            ready.close();
    
}
}