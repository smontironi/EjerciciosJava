/*
Para calcular las soluciones de una ecuacion de segundo grado solo hay que aplicar
una sencilla formula. El unico inconveniente es que hay que comprobar que no existan 
divisiones por cero o que no calculemos la raiz cuadrada de un nuemro negativo.
Estos erroes producen una parada de la ejecucion del programa.
*/
package ejercicio0208;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author Seba
 */
public class Ejercicio0208 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	sc.useLocale(Locale.US);
	double a, b, c; // coeficientes ax^2 + bx + c = 0
	double x1, x2, d; //souciones y discriminante.
		
	System.out.print("Introduzca primer coeficiente(a): ");
	a = sc.nextDouble();
		
	System.out.print("Introduzca segundo coeficiente (b): ");
	b = sc.nextDouble();
		
	System.out.print("Introduzca tercer coeficiente (c): ");
	c = sc.nextDouble();
		
	//calculamos el discriminante
	d = (b * b  - 4 * a * c);
	if (d < 0) { //hay que calcular la raiz cuadrada de d (d no puede ser negativo)
	System.out.println("No existen soluciones reales");
	} else {
	//si a = 0 nos encontrariamos con una division por cero. Y en este caso, ni siquiera
	//seria una ecuacion de segundo grado.
	if (a==0) { //si a es igual a cero
	System.out.println("No es una ecuacion de segundo grado");
	} else {
	x1 = (-b + Math.sqrt(d)) / (2*a); //Math.sqrt() calcula la raiz cuadrada
	x2 = (-b - Math.sqrt(d)) / (2*a); 	
				
	System.out.println("Solucion 1: "+ x1);
	System.out.println("Solucion 2: "+ x2);
				
	}
	}
    }
    
}
