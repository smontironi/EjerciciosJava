/*
Como 0 elevado a 0 no esta definido y admitimos el exponente 0,
excluiremos dicho valor para la base admitimos
 */
package ejercicio0411a;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio0411a {

    /**
     * @param args the command line arguments
     */
    static double aElevadoN(double a, int n){
	double res = 1; //el resultado se inicializa a 1, ya que multiplicamos
		
	if (n == 0) { //por definicion cualquier numero elevado a 0 es 1
            res = 1;
	} else {
	for (int i = 1; i <= n; i++) {
            res = res * a; //multiplicamos
            }
	}
		
	return (res);
    }
    
    //programa principal para probar la funcion
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	sc.useLocale(Locale.US); //para permitir puntos (.) en los decimales
		
	System.out.print("Introduzca base (real): ");
	double base = sc.nextDouble();
	System.out.print("Introduzca exponente (entero): ");
	int exp = sc.nextInt();
		
	double res = aElevadoN(base, exp);
	System.out.println(base + " elevado a " + exp + " = " + res);
    }
    
}
