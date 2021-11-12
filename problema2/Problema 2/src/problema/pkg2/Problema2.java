/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema.pkg2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Solución que imprima el costo de un pedido de un artículo del 
        cual se tiene la descripción, la cantidad que se requiere y el precio 
        unitario. Si la cantidad pedida excede de 50 unidades, se hace un 
        descuento de 15%. */
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double cantidad;
        double costoUnitario;
        double porcentaje;
        double descuento;
        double subtotal;
        double total;
        
        System.out.println("Ingrese el articulo deseado");
        String articulo = entrada.nextLine();
        System.out.println("Ingrese la cantidad que desee");
        cantidad = entrada.nextDouble();
        System.out.println("Ingrese el costo unitario");
        costoUnitario = entrada.nextDouble();
        
        if (cantidad > 50) { 
        porcentaje = 15;
        subtotal = (costoUnitario * cantidad);
        descuento = (subtotal * porcentaje)/100;
        total = (subtotal - descuento);
        System.out.printf("Su total a pagar es : %.2f\n", total);       
        } else {
        porcentaje = 0;
        subtotal = (costoUnitario * cantidad);
        descuento = (subtotal * porcentaje)/100;
        total = (subtotal - descuento);
        System.out.printf("Su total a pagar es : %.2f\n", total);       
    }
    }
}
