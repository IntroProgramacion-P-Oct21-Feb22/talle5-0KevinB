/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema.pkg3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Elaborar una solución que permita leer los datos de un automóvil 
        (marca, origen y costo) imprima el impuesto por pagar y el precio de 
        venta (incluido el impuesto). Si el origen es Alemania el impuesto es 
        20%, si es de Japón el impuesto es 30%, si es de Italia, 15%, y si es 
        de USA, 8% */
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double costo;
        double impuesto;
        double porcentaje;
        double total;
        
        System.out.println("Ingrese el pais de origen");
        String pais = entrada.nextLine();
        System.out.println("Ingrese la marca del vehiculo");
        String marca = entrada.nextLine();
        System.out.println("Ingrese el costo de su vehiculo");
        costo = entrada.nextDouble();
           
        if (pais.equals("Alemania")) {
        porcentaje = 20;
        impuesto = (costo * porcentaje)/100;
        total = impuesto + costo;
        System.out.printf("Su total a pagar es : %.2f\n", total);
        System.out.printf("Impuesto : %.2f\n", impuesto);
        
        } else {
        if (pais.equals("Japon")) {
        porcentaje = 30;
        impuesto = (costo * porcentaje)/100;
        total = impuesto + costo;
        System.out.printf("Su total a pagar es : %.2f\n", total);
        System.out.printf("Impuesto : %.2f\n", impuesto);
        }
        }
        if (pais.equals("Italia")) {
        porcentaje = 15;
        impuesto = (costo * porcentaje)/100;
        total = impuesto + costo;
        System.out.printf("Su total a pagar es : %.2f\n", total);
        System.out.printf("Impuesto : %.2f\n", impuesto);
        
        } else {
            
        if (pais.equals("USA") || pais.equals("EEUU") || 
        pais.equals("Estados Unidos")) {
        porcentaje = 8;
        impuesto = (costo * porcentaje)/100;
        total = impuesto + costo;
        System.out.printf("Su total a pagar es : %.2f\n", total);
        System.out.printf("Impuesto : %.2f\n", impuesto);
        }
        }
        
        

}
}

