import java.util.Scanner;
import exception.exceptNegative;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean inputTrue = false;

        System.out.print("Masukan index : ");
        while (!inputTrue) {
            try {
                int jumlahSuku = input.nextInt();
                if (jumlahSuku < 0) {
                    throw new exceptNegative("Harus bilangan positif");
                }

                inputTrue = true;
                deretInt deretInt1 = new deretInt(jumlahSuku); //inisialisasi object
                deretInt1.inputUser();
                deretInt1.sortAsc();
                deretInt1.sortDsc();

                int[] maxMin = deretInt1.maxMin();

                System.out.println("Nilai maksimal: " + maxMin[0]);
                System.out.println("Nilai minimal: " + maxMin[1]);
            } catch (exceptNegative minus) {
                System.out.println(minus.getMessage());
            } catch (Exception minus) {
                System.out.println("Masukan angka integer");
                input.nextLine(); 
            } 
        }

        input.close();
    }
}
