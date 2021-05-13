/*
Para ordenar dos numeros tendremos que compararlos. Es posible realizar este programa 
utilizando if-else, pero en este caso vamos a hacerlo con el operador ternario
 */
package ejercicio0206;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio0206 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        	
	Scanner sc = new Scanner(System.in);
	int num1, num2; //numeros introducidos por el usuario
	int mayor, menor; //variables que contendran el mayor y el menor de entre num1 y num2
		
	System.out.print("Introduzca un numero: ");
	num1 = sc.nextInt();
		
	System.out.print("Introduzca otro numero: ");
	num2 = sc.nextInt();
		
        mayor = num1 > num2 ? num1 : num2; //si num1 es mayor que num2, entonces mayor = num1, si no = num2
	menor = num1 < num2 ? num1 : num2; //si num1 es menor que num2, entonces mayor = num2, si no = num1
        
        System.out.println(mayor + " , " + menor);
    }
}

