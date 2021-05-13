/* Vamoa a resolver el ejercicio utilizando una estructura switch en lugar de if's
anidados, aprovechando la propiedad de que en switch, se ejecuta un case y
los siguientes hasta que encontramos un break o se llegue al final del bloque */

package ejercicio0211b;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio0211b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int nota;
		
	System.out.println("Introduzca una nota :");
	nota = sc.nextInt();
		
	switch (nota) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Insuficiente");
		break;
            case 5:
		System.out.println("Suficiente");
		break;
            case 6:
		System.out.println("Bien");
		break;
            case 7:
            case 8:
		System.out.println("Notable");
		break;
            case 9:
            case 10:
		System.out.println("Sobresaliente");
                break;
            default :
		System.out.println("Error: nota no valida");
		break; //el ultimo break no es necesario; pero es buena costumbre ponerlo
	}
    }
}
