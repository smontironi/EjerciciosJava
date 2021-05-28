/*
Las implementacion de funciones iran acompañadas de una funcion main que sirva de
prubea. En esta esercicio, el prototipo de la funcion es: void eco(int n).
 */
package ejercicio0401;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio0401 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	
	System.out.print("Introduzca un numero: ");
	int n = sc.nextInt();
	System.out.println("--Antes de llamar a la funcion--");
	eco(n); //invocamos a la funcion
	System.out.println("--Despues de llamar a la funcion--");
}

//la funcion, lo unico que hace es iterar en un bucle y mostrar un mensaje	
static void eco(int a) { //el parametro no tiene por que  llamarse como en la llamada
	for (int i = 0; i < a; i++) {
		System.out.println("Eco...");
	}
    }
}

