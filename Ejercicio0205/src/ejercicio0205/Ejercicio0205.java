/*
Un numero casi-cero es el que se encuentra entre el rango (-1, 1), donde se excluye el
-1, el 0 y el 1. Para comprobar si un numero es casi-cero tendramos que utilizar
una condicion con una expresion logica.
 */
package ejercicio0205;

import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author Seba
 */
public class Ejercicio0205 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	sc.useLocale(Locale.US); //para utilizar punto (.) con los decimales
		
	System.out.print("Introduzca un numero real positivo o negativo: ");
	double num = sc.nextDouble();
	
	//un casi-cero cumple: que es mayor que -1, que es menor que 1 y que no es 0
	if (-1 < num && num < 1 && num !=0){
            System.out.println("Es un numero casi cero");
	} else {
            System.out.println("No es casi cero.");
	}
    }
}
