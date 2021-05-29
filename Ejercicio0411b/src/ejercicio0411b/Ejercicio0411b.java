/*
Las funciones recursivas tienen casi todas la misma estructura:
- caso base, que permite salir de la recursividad
- llamada recursivas
En nuestro caso: el caso base es aElevadoN(x, o) = 1
y la llamada recursiva aElevadoN(a, n) = aElevadoN(a, n-1)
 */
package ejercicio0411b;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio0411b {

    /**
     * @param args the command line arguments
     */
    
    //programa princila para probar la funcion aElevadoN() de forma recursiva
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	sc.useLocale(Locale.US);
		
	System.out.print("Introduzca base (real): ");
	double base = sc.nextDouble();
	System.out.print("Introduzca exponente (entero): ");
	int exp = sc.nextInt();
	System.out.println("El resultado es: " + aElevadoN(base, exp));
    }
	
    static double aElevadoN(double a , int n){
        double res;
		
	if (n == 0) { 	//caso base
            res = 1; 	//a elevado a 0 es 1
	} else {
            res = a * aElevadoN(a, n-1); //llamada recursiva
	}
	return (res);
	}
    }
    

