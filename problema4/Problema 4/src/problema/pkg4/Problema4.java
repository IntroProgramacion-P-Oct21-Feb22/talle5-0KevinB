/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema.pkg4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* En una hosteria de la ciudad de Loja se hace un descuento del 10% 
        si el cliente se hospeda más de 5 días, del 15% si se hospeda más de 
        10 días y del 20% si se hospeda más de 15 días. Elaborar un solución 
        que pida como datos de entrada el número de días y el precio diario de 
        la habitación y luego calcule e imprima el subtotal por pagar, el 
        descuento y el total por pagar. */
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double numero_Dias;
        double precio_Diario;
        double porcentaje;
        double descuento;
        double subtotal; 
        double total;
        
        System.out.println("Ingrese el numero de dias que desea estar");
        numero_Dias = entrada.nextDouble();
        System.out.println("Ingrese su cuota diaria");
        precio_Diario = entrada.nextDouble();
        
        if (numero_Dias <= 5 && numero_Dias >= 0) { 
        subtotal = precio_Diario * numero_Dias;
        descuento = 0;
        total = subtotal - descuento;
            System.out.printf("Su total a pagar es : %.2f\n", total);
            System.out.printf("Su subtotal a pagar es : %.2f\n", subtotal);
            System.out.printf("Su descuento es : %.2f\n", descuento);
            
        } else {
            
        if ((numero_Dias > 5) && (numero_Dias <= 10)) { 
        porcentaje = 10;
        subtotal = precio_Diario * numero_Dias;
        descuento = (subtotal * porcentaje)/100;
        total = subtotal - descuento;
            System.out.printf("Su total a pagar es : %.2f\n", total);
            System.out.printf("Su subtotal a pagar es : %.2f\n", subtotal);
            System.out.printf("Su descuento es : %.2f\n", descuento);
            
        } else {
            
        if ((numero_Dias > 10) && (numero_Dias <= 15)) { 
        porcentaje = 15;
        subtotal = precio_Diario * numero_Dias;
        descuento = (subtotal * porcentaje)/100;
        total = subtotal - descuento;
        
            System.out.printf("Su total a pagar es : %.2f\n", total);
            System.out.printf("Su subtotal a pagar es : %.2f\n", subtotal);
            System.out.printf("Su descuento es : %.2f\n", descuento);
            
        } else {
            
        if (numero_Dias > 15) { 
        porcentaje = 20;
        subtotal = precio_Diario * numero_Dias;
        descuento = (subtotal * porcentaje)/100;
        total = subtotal - descuento;
            System.out.printf("Su total a pagar es : %.2f\n", total);
            System.out.printf("Su subtotal a pagar es : %.2f\n", subtotal);
            System.out.printf("Su descuento es : %.2f\n", descuento);
                    
        }
       }
      }  
     }
    }
   }
