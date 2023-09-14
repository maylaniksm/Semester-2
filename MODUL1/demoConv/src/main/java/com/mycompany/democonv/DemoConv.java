/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.democonv;

/**
 *
 * @author Maylani Kusuma
 */
public class DemoConv {
    static int convCM(){
        return 1 * 100;
    }
    static int convMM(){
        return 1 * 1000;
    }
    static void dispConv(){
        System.out.println("1 Meter = " + convCM() + " cm, " + convMM() + " mm");
    }
    public static void main(String[] args){
        dispConv();
    }
}
