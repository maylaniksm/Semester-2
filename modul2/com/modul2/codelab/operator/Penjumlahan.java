package com.modul2.codelab.operator;

import com.modul2.codelab.Operator;

public class Penjumlahan extends Operator{
    @Override
    public double operation(double a, double b) {
        // TODO Auto-generated method stub
        return a+b;

    }
    @Override
    public double operation(double a, double b, double c) {
        // TODO Auto-generated method stub
        return a+b+c;
    }
    
}
