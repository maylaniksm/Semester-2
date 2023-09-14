package modul2;

import java.util.Scanner;
import modul2.bangun2d.*;
import modul2.bangun3d.*;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static int pilihan;
    static String garis = "=======================================";

    static void hitung2d(){
        System.out.println("1. Persegi\n2. Persegi Panjang\n3. Segitiga\n4. Lingkaran\n5. Jajargenjang\n6. Belah Ketupat\n0. Kembali");
        System.out.print("Pilih salah satu: ");
        pilihan = scan.nextInt();
        switch(pilihan){
            case 0:
                return;
            case 1:
                Persegi persegi = new Persegi();
                double sisi;
                System.out.print("Masukkan sisi: ");
                sisi = scan.nextInt();
                System.out.println(garis);
                System.out.println("Hasil Bangun Persegi: ");
                persegi.infoBangun(sisi);
                break;
            case 2:
                PersegiPanjang perPanjang = new PersegiPanjang();
                double panjang,lebar;
                System.out.print("Masukkan panjang: ");
                panjang = scan.nextInt();
                System.out.print("Masukkan lebar: ");
                lebar = scan.nextInt();
                System.out.println(garis);
                System.out.println("Hasil Bangun Persegi Panjang: ");
                perPanjang.infoBangun(panjang, lebar, 1);
                break;
            case 3:
                Segitiga segitiga = new Segitiga();
                double alas,tinggi;
                System.out.print("Masukkan alas: ");
                alas = scan.nextInt();
                System.out.print("Masukkan tinggi: ");
                tinggi = scan.nextInt();
                System.out.println(garis);
                System.out.println("Hasil Bangun Segitiga: ");
                segitiga.infoBangun(alas, tinggi, 1);
            case 4:
                Lingkaran lingkaran = new Lingkaran();
                double jarijari;
                System.out.print("Masukkan jari-jari: ");
                jarijari = scan.nextInt();
                System.out.println(garis);
                System.out.println("Hasil Bangun Lingkaran: ");
                lingkaran.infoBangun(jarijari);
                break;
            case 5:
                Jajargenjang jajargenjang = new Jajargenjang();
                double miring;
                System.out.print("Masukkan alas: ");
                alas = scan.nextInt();
                System.out.print("Masukkan tinggi: ");
                tinggi = scan.nextInt();
                System.out.print("Masukkan miring: ");
                miring = scan.nextInt();
                System.out.println(garis);
                System.out.println("Hasil Bangun Jajargenjang: ");
                jajargenjang.infoBangun(alas,tinggi,miring,1);
                break;
            case 6:
                BelahKetupat belahKetupat = new BelahKetupat();
                double d1,d2;
                System.out.print("Masukkan sisi: ");
                sisi = scan.nextInt();
                System.out.print("Masukkan d1: ");
                d1 = scan.nextInt();
                System.out.print("Masukkan d2: ");
                d2 = scan.nextInt();
                System.out.println(garis);
                System.out.println("Hasil Bangun Belah Ketupat: ");
                belahKetupat.infoBangun(sisi,d1,d2,2);
                break;
        }
    }
    static void hitung3d(){
        System.out.println("1. Balok\n2. Bola\n3. Kerucut\n4. Kubus\n5. Tabung\n0. Kembali");
        System.out.print("Pilih salah satu: ");
        pilihan = scan.nextInt();
        switch (pilihan){
            case 0:
                return;
            case 1:
                Balok balok = new Balok();
                double panjang,lebar,tinggi;
                System.out.print("Masukkan panjang: ");
                panjang = scan.nextInt();
                System.out.print("Masukkan lebar: ");
                lebar = scan.nextInt();
                System.out.print("Masukkan tinggi: ");
                tinggi = scan.nextInt();
                System.out.println(garis);
                System.out.println("Hasil Bangun Balok: ");
                balok.infoBangun(panjang,lebar,tinggi);
                break;
            case 2:
                Bola bola = new Bola();
                double jarijari;
                System.out.print("Masukkan jari-jari: ");
                jarijari = scan.nextInt();
                System.out.println(garis);
                System.out.println("Hasil Bangun Bola: ");
                bola.infoBangun(jarijari);
                break;
            case 3:
                Kerucut kerucut = new Kerucut();
                System.out.print("Masukkan jari-jari: ");
                jarijari = scan.nextInt();
                System.out.print("Masukkan tinggi: ");
                tinggi = scan.nextInt();
                System.out.println(garis);
                System.out.println("Hasil Bangun Kerucut: ");
                kerucut.infoBangun(jarijari,tinggi);
                break;
            case 4:
                Kubus kubus = new Kubus();
                double rusuk;
                System.out.print("Masukkan rusuk: ");
                rusuk = scan.nextInt();
                System.out.println(garis);
                System.out.println("Hasil Bangun Kubus: ");
                kubus.infoBangun(rusuk);
                break;
            case 5:
                Tabung tabung = new Tabung();
                System.out.print("Masukkan jari-jari: ");
                jarijari = scan.nextInt();
                System.out.print("Masukkan tinggi: ");
                tinggi = scan.nextInt();
                System.out.println(garis);
                System.out.println("Hasil Bangun Tabung: ");
                tabung.infoBangun(jarijari,tinggi);
                break;
        }
    }
    public static void main(String[] args) {
        System.out.println(garis);
        System.out.println("Selamat datang di aplikasi penghitung bangun");
        System.out.println(garis);
        Scanner scan2 = new Scanner(System.in);
        int ulang = 1;
        char menu;
        while(ulang != 0){
            System.out.println("1. Menghitung Bangun 2 Dimensi\n2. Menghitung Bangun 3 Dimensi\n0. Keluar");
            System.out.print("Pilih menu: ");
            ulang = scan.nextInt();
            pilihan = ulang;
            if(ulang == 0){
                break;
            }
            if (pilihan == 1){
                hitung2d();
            } else if (pilihan == 2) {
                hitung3d();
            }
            System.out.print("Kembali ke menu? Y/N: ");
            menu = scan2.next().charAt(0);
            if(menu == 'N' || menu == 'n'){
                ulang = 0;
            }
        }
    }
}
