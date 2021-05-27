/*
Utilizaremos un bucle para mostrar cada fija, y dentro de este, otro para escribir
cada * (columna). El bucle que se escribe cada columna (dentro de la fila) dependera
de los valores d ela fija, asi conseguimos el efecto "triangulo"
 */
package ejercicio0314;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio0314 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Escriba n: ");
            int n = sc.nextInt();
		
            for (int fila = 1; fila <=n; fila++){
		for (int col = fila; col <= n; col++){//el numero de * coincide con n-fila+1
                    System.out.print("* "); 	//no println, para que no cambie de linea
		}
		System.out.println(""); //tras cada fila metemos una nueva linea
            }
    }
}   

