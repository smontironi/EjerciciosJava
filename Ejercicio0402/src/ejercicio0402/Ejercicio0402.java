/*
Tenemos que saber si los numeros estan en orden creciente (3, 7) o decreciente (7, 3).
 */
package ejercicio0402;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio0402 {

    //La funcion ordena los valores pasados y los utiliza como valores devun bucle for
    static void mostrar(int a, int b){
	int mayor = a > b ? a : b; //asignamos a mayor el mayor entre a y b
	int menor = a < b ? a : b; //y en menor el mas pequeños entre a y b
		
	for (int i = menor; i <= mayor; i++) { //siempre iremos del menor al mayor
    	System.out.println(i);
	}
		
	}
	
	public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduzca primer numero: ");
            int a = sc.nextInt();
            System.out.print("Introduzca segundo numero: ");
            int b = sc.nextInt();
		
            mostrar(a, b);
		
    }
}
    