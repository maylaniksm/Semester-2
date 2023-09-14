package modul2;

import java.util.*;

import modul2.bangun2D.*;
import modul2.bangun3D.*;

public class Main {
//    Scanner scan = new Scanner(System.in);

    static void hitung2D () {
        Scanner scan = new Scanner(System.in);
        int pilih;

        System.out.println("\n.Berikut adalah pilihan bangun datar 2D.");
        System.out.println("1. Belah Ketupat\n2. Jajar Genjang\n3. Lingkaran\n4. Persegi\n5. Persegi Panjang\n6. Segitiga\n0. Kembali");
        System.out.print("Masukkan nomor bangun 2D: ");
        pilih = scan.nextInt();
        switch (pilih) {
            case 0 -> {

            }
            case 1 -> {
                BelahKetupat bk = new BelahKetupat();
                System.out.print("Masukkan nilai sisi: ");
                double sisi = scan.nextInt();
                System.out.print("Masukkan nilai d1: ");
                double d1 = scan.nextInt();
                System.out.print("Masukkan nilai d2: ");
                double d2 = scan.nextInt();
                System.out.println("\nHasil Belah Ketupat adalah: ");
                bk.infoBangun(sisi, d1, d2, 1);
            }
            case 2 -> {
                JajarGenjang jg = new JajarGenjang();
                System.out.print("Masukkan nilai alas: ");
                double alas = scan.nextInt();
                System.out.print("Masukkan nilai tinggi: ");
                double tinggi = scan.nextInt();
                System.out.print("Masukkan nilai miring: ");
                double miring = scan.nextInt();
                System.out.println("\nHasil Jajar Genjang adalah: ");
                jg.infoBangun(alas, tinggi, miring);
            }
            case 3 -> {
                Lingkaran lkn = new Lingkaran();
                System.out.print("Masukkan nilai jari-jari: ");
                double jarijari = scan.nextInt();
                System.out.println("\nHasil Lingkaran adalah: ");
                lkn.infoBangun(jarijari, 2);
            }
            case 4 -> {
                Persegi pg = new Persegi();
                System.out.print("Masukkan nilai sisi: ");
                double sisip = scan.nextInt();
                System.out.println("\nHasil Persegi adalah: ");
                pg.infoBangun(sisip);
            }
            case 5 -> {
                PersegiPanjang pp = new PersegiPanjang();
                System.out.print("Masukkan nilai panjang: ");
                double panjang = scan.nextInt();
                System.out.print("Masukkan nilai lebar: ");
                double lebar = scan.nextInt();
                System.out.println("\nHasil Persegi Panjang adalah: ");
                pp.infoBangun(panjang, lebar, 3);
            }
            case 6 -> {
                Segitiga sg = new Segitiga();
                System.out.print("Masukkan nilai alas: ");
                double alass = scan.nextInt();
                System.out.print("Masukkan nilai tinggi: ");
                double tinggis = scan.nextInt();
                System.out.println("\nHasil Belah Ketupat adalah: ");
                sg.infoBangun(alass, tinggis);
            }
        }
    }
    static void hitung3D () {
        Scanner scan = new Scanner(System.in);
        int pilih;

        System.out.println("\n.Berikut adalah pilihan bangun datar 3D.");
        System.out.println("1.Balok\n2. Bola\n3. Kerucut\n4. Kubus\n5. Tabung\n0. Kembali");
        System.out.print("Masukkan nomor bangun 3D: ");
        pilih = scan.nextInt();
        switch (pilih) {
            case 0 -> {
            }
            case 1 -> {
                Balok blk = new Balok();
                System.out.print("Masukkan nilai panjang: ");
                double panjang = scan.nextInt();
                System.out.print("Masukkan nilai lebar: ");
                double lebar = scan.nextInt();
                System.out.print("Masukkan nilai tinggi: ");
                double tinggi = scan.nextInt();
                System.out.println("\nHasil Balok adalah: ");
                blk.infoBangun(panjang, lebar, tinggi);
            }
            case 2 -> {
                Bola bl = new Bola();
                System.out.print("Masukkan nilai jari-jari: ");
                double jarijari = scan.nextInt();
                System.out.println("\nHasil Bola adalah: ");
                bl.infoBangun(jarijari, 1);
            }
            case 3 -> {
                Kerucut krt = new Kerucut();
                System.out.print("Masukkan nilai jari-jari: ");
                double jarijarik = scan.nextInt();
                System.out.print("Masukkan nilai tinggi: ");
                double tinggik = scan.nextInt();
                System.out.println("\nHasil Kerucut adalah: ");
                krt.infoBangun(jarijarik, tinggik, 1);
            }
            case 4 -> {
                Kubus kbs = new Kubus();
                System.out.print("Masukkan nilai sisi: ");
                double sisikb = scan.nextInt();
                System.out.println("\nHasil Kubus adalah: ");
                kbs.infoBangun(sisikb);
            }
            case 5 -> {
                Tabung tb = new Tabung();
                System.out.print("Masukkan nilai jari-jari: ");
                double jarijarit = scan.nextInt();
                System.out.print("Masukkan nilai tinggi: ");
                double tinggit = scan.nextInt();
                System.out.println("\nHasil Persegi Panjang adalah: ");
                tb.infoBangun(jarijarit, tinggit);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pilih, jadi;
        System.out.println("\nSelamat datang di alat penghitung bangun 2D dan 3D");
        do {
            System.out.println("Berikut bangun disediakan: ");
            System.out.println("1. Bangun 2D\n2. Bangun 3D\n0. Keluar");
            System.out.print("Piliih Bangun yang ingin dihitung: ");
            pilih = scan.nextInt();
            switch (pilih) {
                case 0 -> System.out.println("SESI BERAKHIR");
                case 1 -> hitung2D();
                case 2 -> hitung3D();
            }

            System.out.println("\n1. Ya\n2. Tidak");
            System.out.print("Apakah Anda ingin mengulang: ");
            jadi = scan.nextInt();

        } while (jadi == 1 );
    }
}


