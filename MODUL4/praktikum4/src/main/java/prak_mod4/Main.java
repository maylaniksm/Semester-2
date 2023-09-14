//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package prak_mod4;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    static void ngulang() {
        System.out.println("Masukkan input yang benar!\n");
    }

    public static void main(String[] args) {
        Gitar gitar = new Gitar();
        GitarElektrik gitarElektrik = new GitarElektrik();
        Cashier kasir = new Cashier();
        Scanner input = new Scanner(System.in);
        Voucher vocer = new Voucher();
        int stock = 0;
        int ulang = 1;
        //int total = false;
        String nama = "";
        String membertype = "";
        String namaitem = "";

        while(true) {
            while(ulang == 1) {
                while(ulang == 1) {
                    System.out.println("Selamat datang di Toko Musik JJ");
                    System.out.print("Berbelanja sebagai Karyawan? Y/N: ");
                    char yesno = input.next().charAt(0);
                    if (yesno != 'Y' && yesno != 'y' && yesno != 'N' && yesno != 'n') {
                        ngulang();
                        break;
                    }

                    input.nextLine();
                    System.out.print("Masukkan nama anda: ");
                    nama = input.nextLine();
                    kasir.setName(nama);
                    if (yesno != 'N' && yesno != 'n') {
                        membertype = "Karyawan";
                        kasir.isKaryawan();
                        System.out.printf("\nSelamat anda mendapatkan diskon sebanyak %d%% sebagai karyawan\n", (int)(kasir.getMembershipDiscount() * 100.0F));
                    } else {
                        if (kasir.isMember() == Boolean.TRUE) {
                            System.out.printf("\nSelamat anda mendapatkan diskon sebanyak %d%% sebagai %s member\n", (int)(kasir.getMembershipDiscount() * 100.0F), kasir.getMemberType());
                        }

                        membertype = kasir.getMemberType() + " Member";
                    }

                    System.out.println("Selamat datang tuan/putri " + nama);
                    System.out.println("\nItem yang tersedia: ");
                    System.out.printf("1.Gitar \nBrand: %s \nModel: %s\nHarga: %d\nStock: %d\nDiscount: %s", gitar.getBrand(), gitar.getModel(), gitar.getPrice(), gitar.getStock(), gitar.getOnSale());
                    System.out.printf("\n\n2.Gitar Elektrik\nBrand: %s \nModel: %s\nHarga: %d\nStock: %d\nDiscount: %s\n", gitarElektrik.getBrand(), gitarElektrik.getModel(), gitarElektrik.getPrice(), gitarElektrik.getStock(), gitarElektrik.getOnSale());
                    System.out.print("\nPilih item yang diinginkan: ");
                    int item = input.nextInt();
                    if (item != 1 && item != 2) {
                        ngulang();
                        break;
                    }

                    if (item == 1) {
                        if (gitar.getOnSale() == Boolean.TRUE) {
                            System.out.printf("Selamat anda mendapatkan diskon sebanyak %d%%\n", (int)(gitar.getDiscount() * 100.0F));
                        }

                        namaitem = "Gitar";
                        stock = gitar.getStock();
                    } else if (item == 2) {
                        if (gitarElektrik.getOnSale() == Boolean.TRUE) {
                            System.out.printf("Selamat anda mendapatkan diskon sebanyak %d%%\n", (int)(gitarElektrik.getDiscount() * 100.0F));
                        }

                        namaitem = "Gitar Elektrik";
                        stock = gitarElektrik.getStock();
                    }

                    System.out.print("Ingin membeli berapa buah?: ");
                    int stockUser = input.nextInt();
                    if (stockUser > stock) {
                        System.out.println("Anda melebihi stock dari item.\n");
                        break;
                    }

                    System.out.print("Apakah anda mempunyai kode voucher? Y/N: ");
                    yesno = input.next().charAt(0);
                    input.nextLine();
                    if (yesno == 'y' || yesno == 'Y') {
                        System.out.print("Silahkan masukkan kode voucher: ");
                        String kode = input.nextLine();
                        float diskon = vocer.getdiscount(kode);
                        if (diskon != 0.0F) {
                            kasir.setDisc(diskon);
                        }
                    }

                    System.out.println("\nNama pembeli: " + nama);
                    System.out.printf("Nama item: %s\n", namaitem);
                    int total;
                    if (item == 1) {
                        kasir.setPrice((float)(gitar.getPrice() * stockUser));
                        total = (int)kasir.getTotal();
                    } else {
                        kasir.setPrice((float)(gitarElektrik.getPrice() * stockUser));
                        total = (int)kasir.getTotal();
                    }

                    System.out.println("Harga total " + total);
                    System.out.printf("Anda akan membeli %s sebanyak %d buah\n\n", namaitem, stockUser);
                    System.out.print("Masukkan uang anda: ");
                    int duit = input.nextInt();
                    if (total > duit) {
                        System.out.println("Uang anda tidak mencukupi.");
                    } else {
                        System.out.println("Pembayaran berhasil. Uang kembalian: " + (duit - total));
                    }

                    System.out.print("\nApakah anda ingin mengulang? 0/1: \n");
                    ulang = input.nextInt();
                    if (ulang == 1) {
                        System.out.println("");
                    }
                }
            }

            System.out.println("Terima kasih telah berbelanja.");
            return;
        }
    }
}
