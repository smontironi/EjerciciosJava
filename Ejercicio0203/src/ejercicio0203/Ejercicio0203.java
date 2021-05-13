/*
 * Leemos dos numeros enteros, que compararemos con el operador >
 */
package ejercicio0203;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio0203 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        
	System.out.print("Introduzca un numero :");
        num1 = sc.nextInt();

	System.out.print("Introduzca otro numero :");
	num2 = sc.nextInt();

	// el caso donde ambos numeros son iguales no se contempla e imprimiria
	// en pantalla que n2 es mayor que n1.

	if (num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
	} else {
            System.out.println(num2 + " es mayor que " + num1);
	}
    }
}
