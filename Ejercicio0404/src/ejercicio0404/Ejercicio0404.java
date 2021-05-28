/*
 En caso de que ambos numeros sean iguales, el algoritmo tambien es valido

 */
package ejercicio0404;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio0404 {
    
    //compara los parametros, a y b, y devuelve el mayor de ambos
	static int maximo(int a, int b){ //si a es mayor que b
            int max;
            
            if (a > b) { //si a es mayor que b
                max = a;
            } else { //si son iguales o b mayor que a
                max = b;
            }	//del if
        
            return (max); //devuelve el valor de la variable max
}
	

    /**
     * @param args the command line arguments
     */
    
        
        /* main para probar la funcion */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
            System.out.print("Introduzca un numero: ");
            int a = sc.nextInt();
            System.out.print("Introduzca otro numero: ");
            int b = sc.nextInt();
		
            System.out.println("El numero mayor es : " + maximo(a, b));
	}
}
    
