package com.mycompany.booksystem;
import java.util.Scanner;
import java.util.regex.*;

public class bookSystem {
    Scanner myScanner = new Scanner(System.in);
    private String Nama;
    private String alamat;
    private String Notelpon;
    private String Email;
    private int[][] Room1 = { 
            { 1, 101, 150000 },  //0 tersedia
            { 0, 102, 200000 }, //1 tidak tersedia
            { 1, 103, 250000 }, 
            { 0, 104, 300000 }, 
            { 1, 105, 350000 }
                                };
    private int noRoom;
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
        return noRoom;
    }

    public void setNoroom(int noRoom) {
        this.noRoom = noRoom;
    }
      public boolean verifikasi() {
        String namaRegex = "[a-zA-Zs]+";
        Pattern namaPattern = Pattern.compile(namaRegex);
        Matcher namaMatcher = namaPattern.matcher(getNama());
        boolean isNamaValid = namaMatcher.matches();
        
        String emailRegex = "^[\\w!#$%&amp;'+/=?`{|}~^-]+(?:\\.[\\w!#$%&amp;'+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        Pattern emailPattern = Pattern.compile(emailRegex);
        Matcher emailMatcher = emailPattern.matcher(getEmail());
        boolean isEmailValid = emailMatcher.matches();

        String phoneRegex = "^\\+62[0-9]{9,}$";
        Pattern phonePattern = Pattern.compile(phoneRegex);
        Matcher phoneMatcher = phonePattern.matcher(getNotelpon());
        boolean isPhoneValid = phoneMatcher.matches();
        
        if (!isNamaValid) {
            System.out.println("Nama Invalid!\n");
        }
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

    
     public void init() { 
/*digunakan untuk menginisialisasi attribut diatas dengan memanggil setter
atributnya.*/

        do{
        System.out.println("====+=== REGISTRASI DATA ===+==== ");
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

    public void dispPerson() { 
    /* digunakan untuk menampilkan atribut identitas yang telah diinisialisasi
    dengan memanggil getter atributnya*/
        System.out.println(" Data : ");
        System.out.println("Nama : " + getNama());
        System.out.println("Alamat : " + getAlamat());
        System.out.println("Email  :  " + getEmail());
        System.out.println("No Telpon : " + getNotelpon());
    }

     public void bookRoom() {
        /*digunakan untuk user memilih kamar yang telah diinisialisasi, kamar
tidak bisa dipilih ketika kamar berstatus tidak tersedia ( memiliki nilai 1 pada indek
kolom 0 )*/
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
                System.out.println("Kamar Yang Di pilih Tidak Tersedia!");
            }
        } while (Room1[getNoroom() - 1][0] == 1);

    }

    public void doPayment(int noRoom) {
        /*berisi tentang pembayaran dan informasi kamar yang akan
dibayar oleh user pada method bookRoom(),*/
        System.out.println("======Pembayaran : =====");
        dispPerson();
        System.out.println("Kamar       : " + Room1[noRoom - 1][1]);
        System.out.println("Harga kamar : " + Room1[noRoom - 1][2]);
        do {
 
   System.out.print("Masukkan Nilai Uang : ");
            setUang(myScanner.nextInt());
            if (getUang() >= Room1[noRoom - 1][2]) {
                System.out.println("Pembayaran Berhasil !");                            
                Room1[noRoom - 1][0] = 1;
            } else {
                System.out.println("Uang Yang di Masukkan Kurang!");
            }
            
        } while (getUang() < Room1[noRoom - 1][2]);
    }
    

    public static void main(String[] args) {
        int condition;
        bookSystem Mybooking = new bookSystem();
        Scanner Myscannermain = new Scanner(System.in);
        do {
            System.out.println("===== CROWN VICTORIA HOTEL =====");
            Mybooking.init();
            Mybooking.bookRoom();
            Mybooking.doPayment(Mybooking.getNoroom());
            System.out.print("Apakah Ingin Kembali Ke Menu (1/0) : ");
            condition = Myscannermain.nextInt();

        } while (condition == 1);
        Myscannermain.close();
 
    }

}