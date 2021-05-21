/*
introducir numero entre 1 y 10. 
mostrar la tabla de muultiplicar de dicho numero
 */
package ejercicio0310;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio0310 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num; //del que mostraremos la tabla de multiplicar
		
	//nos aseguramos de que el numero esta entre 1 y 10
	do {
            System.out.print("Introduzca un numero (de 1 a 10): ");
            num = sc.nextInt();
	} while (!(1 <= num && num <= 10));
            System.out.println("\n\nTabla del " + num);
            for (int i = 1; i <= 10; i++) {
		System.out.println(num + " x " + i + " = " + num * i);
            }
    }
}
    

