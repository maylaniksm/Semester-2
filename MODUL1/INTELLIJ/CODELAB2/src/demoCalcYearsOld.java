import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class demoCalcYearsOld { //kelas utama
    int yourBirthYear;

    public int getYourBirthYear() {
        return yourBirthYear;
    }
    //Method getYourBirthYear dan setYourBirthYear digunakan
    // untuk mengakses dan memodifikasi nilai atribut yourBirthYear
    public void setYourBirthYear(int yourBirthYear) {
        this.yourBirthYear = yourBirthYear;
    }

    public static void main(String[] args) { //method main digunakan untuk menjalankan program.
        demoCalcYearsOld demo = new demoCalcYearsOld();
        Scanner scanner = new Scanner(System.in);
        //Scanner untuk meminta pengguna memasukkan tahun kelahiran mereka.

        System.out.print("Masukkan tahun kelahiran anda: ");
        int birthYear = scanner.nextInt();
        //nilai tahun kelahiran tersebut disimpan ke dalam atribut yourBirthYear
        // dengan menggunakan method setYourBirthYear.
        demo.setYourBirthYear(birthYear); //memasukkan nilai birthyear ke yourbirthyear

        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        int age = Period.between(LocalDate.of(birthYear, 1, 1), LocalDate.of(currentYear, 1, 1)).getYears();
        /*Kemudian, menggunakan LocalDate dari library java.time untuk mendapatkan tanggal hari ini, dan
        tanggal lahir pengguna, dan Period untuk menghitung selisih antara dua tanggal*/
        /*menggunakan method between dari class Period untuk menghitung selisih antara tanggal 1 Januari pada tahun kelahiran
        dengan tanggal 1 Januari pada tahun sekarang. Dari selisih tersebut*/
        // program menggunakan method getYears untuk mendapatkan nilai umur dalam tahun.
        System.out.println("Umur anda adalah " + age + " tahun.");
    }
}
