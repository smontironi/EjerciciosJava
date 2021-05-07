/*
 * Para calcular la longitud y el area fijaremosel alor de pi 
 * como una constante
 * 
 */
package ejercicio0110a;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio0110a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double PI = 3.14; // pi como constante
        double radio;           // el radio puede contener decimales
        double area, longitud;  //hay que tener cuidado de no utilizar el identificador
                                //long: ya que es una palabra reservada
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        //pedimos el radio
        System.out.println("Escriba el radio: ");
        radio = sc.nextDouble();
        
        longitud = 2 *PI * radio;
        area = PI * radio * radio; //radio * radio es radio al cuadrado
        // para calcular el cuadrado tambien poemos utilizar:
        // Math.pow(radio, 2) que eleba radio al cuadrado (es decir, a 2)
        
        System.out.println("La longitud del circulo es: " + longitud);
        System.out.println("El area de la circunferencia es : " + area);
    }  
}
