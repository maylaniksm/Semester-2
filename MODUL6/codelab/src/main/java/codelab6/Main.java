package codelab6;
import java.util.Scanner;

class NimFormatException extends Exception {
    public NimFormatException(String argE){
        super(argE);
    }
}
class Mahasiswa{
    private String nim,email,nama;
    public void setNim(String nim) throws NimFormatException {
        this.nim = nim;
        this.cekNim();
    }
    public void setNama(String nama) {
        this.nama = nama;
        this.cekName();
    }

    public void setEmail(String email) {
        this.email = email;
        this.cekEmail();
    }
    private void cekNim() throws NimFormatException {
        if (!this.nim.matches("^[^a-zA-Z\\\\p{P}]*10370311[^a-zA-Z\\\\p{P}]*$") && !(this.nama.length() == 15) ) {
            throw new NimFormatException("Nim Harus 15 Karakter Dan Tidak Alphabet, Dan Format 10370311");
        }
    }
    private void cekName(){
        if(!this.nama.matches("^\\D+$")) throw new IllegalArgumentException("Nama Tidak Boleh Ada Angka");
    }
    private void cekEmail(){
        if (!this.email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) throw  new IllegalArgumentException("Format Email Salah");
    }
}
public class Main {
    public static void main(String[] args) {
        Mahasiswa objMhs = new Mahasiswa();
        Scanner objInput = new Scanner(System.in);
        try {
            System.out.print("Masukkan Nama : ");
            objMhs.setNama(objInput.nextLine());
            System.out.print("Masukkan Nim  : ");
            objMhs.setNim(objInput.next());
            System.out.print("Masukkan Email : ");
            objMhs.setEmail(objInput.next());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            main(null);
        }
        finally {
            System.out.println("Data Anda Sudah Terinput");
        }
    }
}