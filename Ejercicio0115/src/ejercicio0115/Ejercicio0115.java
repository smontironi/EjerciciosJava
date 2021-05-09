/*
 * Ejercicio 15 propuesto
 * 
 * Dado un polinomio de segundo grado (y = a*b^2 + bx + c)
 * crear un programa que pida
 * los coeicientes de a, b y c, asi como el valor de x, y calcule
 * el valor de y
 */
package ejercicio0115;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio0115 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a,b,c,x,y;
                      
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.println("Escriba el valor de a: ");
        a = sc.nextDouble();
        System.out.println("Escriba el valor de b: ");
        b = sc.nextDouble();
        System.out.println("Escriba el valor de c:: ");
        c = sc.nextDouble();
        System.out.println("Escriba el valor de x: ");
        x = sc.nextDouble();
        
        y = a *Math.pow(x, 2) + b*x + x;
        
        System.out.println("El valor de 1 es: " + y);
    }
    
}
