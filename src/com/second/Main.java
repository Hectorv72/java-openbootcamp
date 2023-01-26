package com.second;

public class Main {
    public static void main(String[] args) {
        double precio = 100.50d;
        double total = ivaIncluido(precio);
        System.out.println(total);
    }

    public static double ivaIncluido( double precio ) {
        return precio + ((precio*21)/100);
    }


}
