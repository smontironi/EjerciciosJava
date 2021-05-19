/*
Sabemos con certeza el numero de iteraciones del bucle: n, por lo que utilizaremos
un bucle forque recorrera todos lo numero de1 1 a n
 */
package ejercicio0304;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio0304 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca un número: ");
        int n = sc.nextInt();
        
        for (int i = 1 ; i <= n ; i++ ){
            //i tomara los valores de 1 a n, en cada iteracion la
            //variable i es una variable del bloquede istriciones del for, es decir, 
            //solo se puede utilizar dicho bloque (su ambito es el bloque)
            //intentar utilizar la variable i fuera del bloque genera un error
            System.out.println(i); //mostramos i
        }
    }
}
