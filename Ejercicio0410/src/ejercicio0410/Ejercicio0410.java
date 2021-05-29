/*
Antes de ver que son los numeror amigos, una definicion:
divisores propios de un numero son todos los divisores, primos y no primos,
de dicho numero excepto él mismo.
Dos numeros a y b son amigos cuando la suma de los divisores propios de a
es b y viceversa. Ejemplos conocidos de pares de numeros amigos son:
(220, 284), (1184, 1210), (6232, 6368). Un numero amigo de si mismo se dice
que es perfecto, como 6, 28, 496, 8128.

 */
package ejercicio0410;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio0410 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.print("Introduzca a: ");
	int a = sc.nextInt();
	System.out.print("Introduzca b: ");
	int b = sc.nextInt();
		
	if (amigos(a, b)) {
            System.out.println(a + " y " + b + " son amigos.");
	} else {
            System.out.println("No son amigos. La proxima vez prueba con 220 y 284.");
	}
}
	
    //calcula la suma de sus divisores y comprueba
    static boolean amigos(int a, int b){
	boolean amigos;
		
	if (a == sumaDivisoresPropios(b) && b == sumaDivisoresPropios(a)) {
    	amigos = true; //son amigos
	} else { 
	amigos = false; //no son amigos
	}
	return (amigos);
    }
	
    //sumaDivisores devuelve la suma de los divisores propios, divisores en el 
    //rango 1...num-1
    static int sumaDivisoresPropios(int num) {
        int suma = 0;
		
	for (int i = 1; i < num; i++){ //al ser i<num no usamos el propio num
            if (num % i ==0) { //si i divide a num
		suma += i; //acumulamos if
            }
	}
    return (suma);
    }
}