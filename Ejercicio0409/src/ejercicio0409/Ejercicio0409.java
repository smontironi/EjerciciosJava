/*
La funcion comprobara todos los numeros comprendidos entre 1 y el numero que se pasa
como parametro (num). Para cada uno de ellos, verificamos si es primo y si divide
a num, en cuyo caso, significa que es un divisor primo de num.

 */
package ejercicio0409;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio0409 {

    //ejemplo de uso
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Introduzca numero: ");
	int num = sc.nextInt();
	divisoresPrimos(num); //mostramos los divisores primos de num
    }
    static boolean esPrimo(int num) {
        boolean primo = true; //suponemos que el numero es primo
	int i = 2; //primer numero por el que veremos si es divisible
	
	if (num < 2) { //el primer primo es 2
            primo = false;
	}
	
	while (i < num && primo == true) {
            if (num % i == 0) { //si num es divisible por if
                primo = false; //entonces no es numero primo
            }
            i++;
	}
	
	//este algortimo puede mejorar sabiendo que si un numero no es divisible por
	//ningun entero comprendido entre 2 y su raiz cuadrada, entonces ya no sera 
	//divisible por ningun otro numero y sera primo. Quedaria:
	
	// while (i <= (int) MAth.sqrt(num) && primo == true){
	//	...
	//}
	//lo cual ahorra muchas vueltas para numero primo grandes
    return (primo);
    }
    //comprobaremos todos los numeros en el rango comprendido entre el 1 y num (el numero
    //1 siempre sera divisor primo de cualquier numero, podriamos obviarlo)
    static void divisoresPrimos(int num){
	System.out.println("Divisores primos de " + num); //mostramos una cabecera
		
	//recorremos los numeros del rango 1 ..num
	for (int i =1; i <= num; i++) {
	if (esPrimo(i) && num % i == 0) { //si i e primo y divide a num
            //i es un divisor primo de num
            System.out.println("El numero " + i); //mostramos
        }
    }
}
}