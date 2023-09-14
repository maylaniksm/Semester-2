import java.util.Scanner;
import java.lang.Exception;
public class codelab_m6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa orang = new Mahasiswa();

        boolean isNamaValid = false;
        String nama = "";
        System.out.println("--------------------------------------");
        while (!isNamaValid) {
            System.out.print("Input Nama : "); // Huruf alfabet
            nama = input.nextLine();
            try {
                orang.setNama(nama);
                isNamaValid = true;
            } catch (NamaFormatException e) {
                System.err.println("Error   : " + e.getMessage());
            } finally {
                System.out.println("Nama    : " + orang.getNama());
                System.out.println("--------------------------------------");
            }
        }

        boolean isNIMValid = false;
        String nim = "";
        while (!isNIMValid) {
            System.out.print("Input NIM : "); // 10370311 + 7 angka
            nim = input.nextLine();
            try {
                orang.setNIM(nim);
                isNIMValid = true;
            } catch (NIMFormatException e) {
                System.err.println("Error   : " + e.getMessage());
            } finally {
                System.out.println("NIM     : " + orang.getNIM());
                System.out.println("--------------------------------------");
            }
        }

        boolean isEmailValid = false;
        String email = "";
        while (!isEmailValid) {
            System.out.print("Input Email : "); // contoh@example.com
            email = input.nextLine();
            try {
                orang.setEmail(email);
                isEmailValid = true;
            } catch (EmailFormatException e) {
                System.err.println("Error   : " + e.getMessage());
            } finally {
                System.out.println("Email   : " + orang.getEmail());
                System.out.println("--------------------------------------");
            }
        }

        orang.display();

        System.out.println("--------------------------------------");
        System.out.println("Data Anda Sudah Terinput");
        input.close();
    }
}