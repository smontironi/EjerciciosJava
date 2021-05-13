/*
Leemos dos numeros enteros, que tendremos que comparar para decidir si son
iguales o distintos.
 */

package ejercicio0202;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio0202 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
            System.out.print("Introduzca un numero :");
            num1 = sc.nextInt();

	System.out.print("Introduzca otro numero :");
	num2 = sc.nextInt();

	if (num1 == num2){ //si num1 es igual que num2
            System.out.println("Ambos numeros son iguales");
	}  else {
            System.out.println("Los numeros son distintos");
	}
    }
}
