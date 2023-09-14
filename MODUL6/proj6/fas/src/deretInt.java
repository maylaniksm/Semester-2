import exception.exceptNegative;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


public class deretInt {
    private final int jumlahSuku;
    private final int[] deret;

    public deretInt(int jumlahSuku) {
        this.jumlahSuku = jumlahSuku;
        deret = new int[jumlahSuku];
    }

    public void inputUser() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < jumlahSuku; i++) {
            while (true) {
                try {
                    System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
                    int angka = scanner.nextInt();

                    if (angka < 0) {
                        throw new exceptNegative("Harus integer angka positif");
                    }

                    if (angka == 0) {
                        throw new IllegalArgumentException("Terdapat bilangan nol!");
                    }


                    deret[i] = angka;
                    
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Inputan harus berupa bilangan integer!");
                    scanner.nextLine(); 
                } catch (exceptNegative | IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        scanner.close();
    }

    public void sortAsc(){
        int[] ascDeret = deret.clone(); //
        Arrays.sort(ascDeret);

        System.out.println("Urutan atas ke bawah : " + Arrays.toString(ascDeret));
    }
    public void sortDsc(){
        int[] dscDeret = deret.clone();
        Arrays.sort(dscDeret);
        for (int i = 0; i < dscDeret.length / 2; i++) { //swap untuk nilai tengah
            int temp = dscDeret[i];
            dscDeret[i] = dscDeret[dscDeret.length - i - 1]; // menukar index terakhir yang belum di swap
            dscDeret[dscDeret.length - i - 1] = temp; 
        }
        System.out.println("Urutan dari bawah ke atas : " + Arrays.toString(dscDeret));
    }
    
    public int[] maxMin(){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE; //{8 7 6 6 }

        for (int angka : deret) {
            max = Math.max(max, angka); //membandingkan elemen array dengan
            min = Math.min(min, angka);
        }
        return new int[] {max, min};
    }

}
