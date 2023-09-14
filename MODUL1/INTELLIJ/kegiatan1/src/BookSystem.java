package com.mycompany.booksystem;
import java.util.Scanner;
import java.util.regex.*;

public class book_system {
    Scanner myScanner = new Scanner(System.in);
    private String Nama;
    private String alamat;
    private String Notelpon;
    private String Email;
    private int[][] Room1 = {
            { 0, 101, 150000 },  //0 tersedia
            { 0, 102, 200000 }, //1 tidak tersedia
            { 1, 103, 250000 },
            { 0, 104, 300000 },
            { 1, 105, 350000 }
    };
    private int noroom;
    private int uang;

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        this.Nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNotelpon() {
        return Notelpon;
    }

    public void setNotelpon(String notelpon) {
        this.Notelpon = notelpon;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }
    public int getUang() {
        return uang;
    }

    public void setUang(int uang) {
        this.uang = uang;
    }

    public int getNoroom() {
        return noroom;
    }

    public void setNoroom(int noroom) {
        this.noroom = noroom;
    }
    public boolean verifikasi() {

        String emailRegex = "^[\\w!#$%&amp;'+/=?`{|}~^-]+(?:\\.[\\w!#$%&amp;'+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        Pattern emailPattern = Pattern.compile(emailRegex);
        Matcher emailMatcher = emailPattern.matcher(getEmail());
        boolean isEmailValid = emailMatcher.matches();

        String phoneRegex = "^\\+62[0-9]{9,}$";
        Pattern phonePattern = Pattern.compile(phoneRegex);
        Matcher phoneMatcher = phonePattern.matcher(getNotelpon());
        boolean isPhoneValid = phoneMatcher.matches();

        if (!isPhoneValid) {
            System.out.println("Nomor Hp Invalid!\n");
        }

        if (!isEmailValid) {
            System.out.println("Email Invalid!\n ");
        }
        if (isPhoneValid && isEmailValid) {
            return true;
        } else {
            return false;
        }
    }


    public void Init() {
        do{
            System.out.println("Registrasi Data : ");
            System.out.print("Masukkan Nama : ");
            setNama(myScanner.next());
            System.out.print("Masukkan Alamat : ");
            setAlamat(myScanner.next());
            System.out.print("Masukkan Email : ");
            setEmail(myScanner.next());
            System.out.print("Masukkan No. Hp : ");
            setNotelpon(myScanner.next());

        }while(!verifikasi());

    }

    public void DisplayData() {
        System.out.println(" Data : ");
        System.out.println("Nama : " + getNama());
        System.out.println("Alamat : " + getAlamat());
        System.out.println("Email  :  " + getEmail());
        System.out.println("No Telpon : " + getNotelpon());
    }

    public void Book() {
        do {
            System.out.println(" Room List : ");
            for (int i = 0; i < 5; i++) {

                if (Room1[i][0] == 1) {
                    System.out.println(i + 1 + " No kamar : " + Room1[i][1] + " " + "tidak tersedia");

                } else if(Room1[i][0] == 0) {
                    System.out.println(i + 1 + " No kamar : " + Room1[i][1] + " Rp. " +  Room1[i][2]);
                }

            }
            System.out.print(" Pilih No Room : ");
            setNoroom(myScanner.nextInt());
            if (Room1[getNoroom() - 1][0] == 1) {
                System.out.println("Kamar Yang DI pilih Tidak Tersedia!");
            }
        } while (Room1[getNoroom() - 1][0] == 1);

    }

    public void Dopaymentroom(int noroom) {
        System.out.println("======Pembayaran : =====");
        DisplayData();
        System.out.println("Kamar       : " + Room1[noroom - 1][1]);
        System.out.println("Harga kamar : " + Room1[noroom - 1][2]);
        do {

            System.out.print("Masukkan Nilai Uang : ");
            setUang(myScanner.nextInt());
            if (getUang() >= Room1[noroom - 1][2]) {
                System.out.println("Pembayaran Berhasil !");
                Room1[noroom - 1][0] = 1;
            } else {
                System.out.println("Uang Yang di Masukkan Kurang!");
            }

        } while (getUang() < Room1[noroom - 1][2]);
    }


    public static void main(String[] args) {
        int condition;
        book_system Mybooking = new book_system();
        Scanner Myscannermain = new Scanner(System.in);
        do {
            System.out.println("~~~~ GuestHouse Lojikka1 ~~~~~");
            Mybooking.Init();
            Mybooking.Book();
            Mybooking.Dopaymentroom(Mybooking.getNoroom());
            System.out.print("Apakah Ingin Kembali Ke Menu (1/0) : ");
            condition = Myscannermain.nextInt();

        } while (condition == 1);
        Myscannermain.close();

    }

}