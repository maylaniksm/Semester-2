package com.modul2.codelab;

import com.modul2.codelab.operator.*;

public class Main {
    public static void main(String[] args) {
        Penjumlahan jumlahan = new Penjumlahan();
        Pengurangan kurang = new Pengurangan();
        Perkalian Kali = new Perkalian();
        Pembagian bagi = new Pembagian();
        System.out.println("Penjumlahan : " + jumlahan.operation(10, 20));
        System.out.println("Pengurangan : " + kurang.operation(10, 20));
        System.out.println("Perkalian   : " + Kali.operation(10, 20));
        System.out.println("Pembagian   : " + bagi.operation(10, 20));
        System.out.println("Penjumlahan 3 param : " + jumlahan.operation(1, 2, 3));
        System.out.println("Pengurangan 3 param : " + kurang.operation(10, 2, 2));
        System.out.println("Perkalian   3 param : " + Kali.operation(1, 2, 3));
        System.out.println("Pembagian   3 param : " + bagi.operation(10, 2, 1));
    }

}
