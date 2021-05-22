/*
Utilizaremos una bandera para controlar si entre los alumnos existe al menos uno con una
asignatura suspensa (nota menor que 5). Una bandera es una variable, normalmente
booleana, que indica, mediante sus valores, alguna situacion o estado. En este caso
suspenso = false, significa que no existe ninguna nota suspensa
suspenso = true, significa que existe, al menos, un alumno suspenso 
Hay que tener cuidado, cuando se activa una bandera, en no volver a desactivarla, ya
que entonces no refleja lo que intentamos evaluar, sino la ultima situacion ocurrida
 */
package ejercicio0312;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio0312 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	boolean suspensos = false; // suponemos que en principio no hay ningun suspenso
		
            for (int i= 0; i<5; i++){
		System.out.print("Introduzca nota (de 0 a 10): ");
		int notas = sc.nextInt();
			
		if (notas < 5) { //si la nota corresponde a un suspenso
                    suspensos = true; //activamos la bandera a cierto
		}
            }
            if (suspensos) {
		System.out.println("Hay alumnos suspensos");
            } else {
		System.out.println("No hay alumnos suspensos");
            }
    }   
}
