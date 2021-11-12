/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema.pkg1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author 0KevinB
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /* Solución que permita calcular y mostrar el valor a cancelar de una 
       planilla de luz. Se debe ingresar el valor de costo por 
       kilovatio/hora y el número de kilovatios consumidos en el mes. Si el 
       usuario tiene edad mayor a 65 años, se debe descontrar el 10%. */
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double kw_h;
        double kw_mes;
        double planilla;
        double descuento;
        int edad;
        System.out.println("Ingrese el costo por kilovatio/hora");
        kw_h = entrada.nextDouble();
        System.out.println("Ingrese los kilovatios consumidos en el mes");
        kw_mes = entrada.nextDouble();
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        
        planilla = (kw_h * kw_mes);
        if (edad >= 65 ){
            descuento = (kw_h * kw_mes) *10 /100 ;
            
        }    else {
            descuento = 0;
        }
        planilla = (planilla - descuento);
         System.out.printf("La planilla de luz costara: %.2f\n", planilla);
    }
    
}
