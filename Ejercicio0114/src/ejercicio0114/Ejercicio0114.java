/*
 * Cuarto ejercicio propuesto
 *
 * Crear un progama que pida la base y la altura de un triangulo y muestre su area
 */
package ejercicio0114;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Seba
 */
public class Ejercicio0114 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double base, altura, area;
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        // pedimos los datos
        System.out.println("Escriba la base: ");
        base = sc.nextDouble();
        System.out.println("Escriba la altura: ");
        altura = sc.nextDouble();
        
        area = (base * altura)/2;
        
        System.out.println("El area del triangulo es : "+area);
    }
    
}
