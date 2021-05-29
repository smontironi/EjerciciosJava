/*
Para calcular n! (factorial de n), una forma es n!= n(n-1)+(n-2)...1, y otra consiste
en n! = n*(n-1)!. Per ejemplo, 3! = 3*2*1, pero tambien 3! = 3*2!
El caso base es 0! = 1
 */
package ejercicio0413;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio0413 {

    /**
     * @param args the command line arguments
     */
    //programa princila que pide un numero y calcula su factorial
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
	System.out.print("Introduzca un numero: ");
	int num = sc.nextInt();
	System.out.println(num + "! es igual a " + factorial(num));
	}
	//funcion recursiva para calcular el factorial
	static int factorial(int num){
            int res ;
		
            if (num == 0){ //caso base: 0! (factorial de 0) es 1 (por definicion)
		res = 1;
            } else { 
		res = num * factorial(num -1); //llamada recursiva
            }
		
	return (res);
	}
    }
 
