/*
Utilizaremos contadores que se incrementan cuando nos encontramos en una situacion 
concreta: la nota esta aprobada, esta condicionada o esta suspensa
 */
package ejercicio0313;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio0313 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int aprobados = 0, suspensos = 0, condicionados = 0; //contadores
			
            for (int i = 1; i <= 6; i++){
            	System.out.print("Nota del alumno número " + i + ": ");
		int nota = sc.nextInt();
				
		if (nota == 4) { //comprobaremos en que caso nos encontramos
                    condicionados++;
		} else if (nota >= 5) {
                    aprobados++;
		} else if (nota < 4) { 	//este if es redundante, al ser el unico caso posible
                    suspensos++;	//y podriamos poner else {...}
		}
            }
            System.out.println("Aprobados: " + aprobados); //mostramos el informa
            System.out.println("Suspensos: " + suspensos); 
            System.out.println("Condicionados: " + condicionados);
	}
}
