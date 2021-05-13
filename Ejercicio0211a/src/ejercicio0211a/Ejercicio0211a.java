/* Hay alumnos que no estan muy de acuerdo con esta clasificacion de las notas, y toda
calificacion mayor a 3 debe ser notable */

package ejercicio0211a;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio0211a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int nota;
		
	System.out.println("Introduzca una nota :");
	nota = sc.nextInt();
		
	if (nota <= 0 || nota < 5) { //se podria usar nota <= 0 || nota <= 4
            System.out.println("Nota insuficiente");
	} else if (nota == 5) { 
            System.out.println("Suficiente");
	} else if (nota == 6) { 
            System.out.println("Bien");
	} else if (nota == 7 || nota == 8) { 
            System.out.println("Notable"); // si la nota es 7 u 8
	} else if (nota == 9 || nota == 10) { 
            System.out.println("Sobresaliente"); // si la nota es 9 o 10
	} else {
            System.out.println("Error: nota no valida");
	}
    } 
}