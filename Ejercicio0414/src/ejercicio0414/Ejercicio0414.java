/*
En la serie de Fibonacci tendremos:
    - caso general: fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
    - existen dos casos base: 
                    fibonacci(0) = 1
                    fibonacci(1) = 1
 */
package ejercicio0414;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio0414 {

    /**
     * @param args the command line arguments
     */
    
    //programa principal para probar la funcion fibo
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Vamos a calcular fibonacci(n)");
        System.out.print("Introduzca n (se recomienda n <40): ");
	int num = sc.nextInt();
        
        int resultado = fibo(num); //si nes muy grande esto puede tardar bastante
        System.out.println("\nfibonacci(" + num + ") = " + resultado);
    }
    
    //funcion recursiva
    static int fibo(int num){
        int res;
        
        if (num == 0) { //primer caso base
            res = 1;
        } else {
            if (num == 1){ //segundo caso base
                res = 1;
            } else {
                res = fibo(num - 1) + fibo(num - 2); // caso general recursivo
            }
        }
        return (res);
    }
}
