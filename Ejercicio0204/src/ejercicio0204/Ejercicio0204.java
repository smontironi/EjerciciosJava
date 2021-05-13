/*
 * En esta version contemplamos la posibiliadad que ambos numeros sean iguales
 */
package ejercicio0204;
import java.util.Scanner;
/**
 *
 * @author Seba
 */
public class Ejercicio0204 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un numero :");
	int num1 = sc.nextInt();

	System.out.print("Introduzca otro numero :");
	int num2 = sc.nextInt();

	if (num1 == num2){ //si n1 es igual que n2
            System.out.println("Son iguales");
	} else {
	//si no son iguales podemos decidir cual es el mayor
	if (num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
	} else {
            System.out.println(num2 + " es mayor que " + num1);
	}
	}
    }
}
