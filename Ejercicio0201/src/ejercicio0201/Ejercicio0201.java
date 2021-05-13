/*
* Vamos a introducir por teclado un numero (entero). Para distinguir si es pas o
* impar comprobamos el resto de dividir por 2.
*/
package ejercicio0201;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio0201 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int num; //numero introducido por el ususario

	System.out.print("Introduzca un numero :");
	num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("Es par.");
        } else { //es impar
            System.out.println("Es impar.");
        }
    }
}
