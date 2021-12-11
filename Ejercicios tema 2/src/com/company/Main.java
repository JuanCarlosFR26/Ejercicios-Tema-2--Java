package com.company;


public class Main {

    //Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.
    public static void main(String[] args) {


        devolverPrecio(34);
        devolverPrecio(128);
        devolverPrecio(-22);


    }

    private static double devolverPrecio(int precio) {

        if(precio > 0) {
            double iva = 0.21d;
            double valorDevuelto = precio + (precio * iva);
            System.out.println(valorDevuelto + " €");
            return valorDevuelto;

        } else {
            System.out.println("El valor introducido no puede ser menor a 0");
        }


        return 0;
    }


}
