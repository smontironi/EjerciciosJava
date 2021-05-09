/*
 * Ejercicio 17 propuesto
 *
 * Solicitar al usuario 3 distancias: 
 *  la primera, medida en milimetros;
 *  la segunda, medida en centimetros;
 *  la tercera, medida en metros;
 *
 *  Diseñar un programa que muestre la suma de las tres longitudes 
 *  introducidas (medida en centimetros)
 */ 
package ejercicio0117;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio0117 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double milimetros, centimetros, metros, milimetroEnCentimetros, metroEnCentimetros, centimetrosTotal;
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.println("Escriba la distancia en milimetros: ");
        milimetros = sc.nextDouble();
        System.out.println("Escriba la distancia en centimetros: ");
        centimetros = sc.nextDouble();
        System.out.println("Escriba la distancia en metros: ");
        metros = sc.nextDouble();
        
        milimetroEnCentimetros = milimetros*10;
        
        metroEnCentimetros = metros/100;
        
        centimetrosTotal = centimetros + metroEnCentimetros + milimetroEnCentimetros ;
        
        System.out.println("Las distancias sumadas en centimetros es: " + centimetrosTotal);
          
    }
    
}
