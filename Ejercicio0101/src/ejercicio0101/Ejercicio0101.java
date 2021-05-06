/*
 * Diseñar un programa que pida un número al usuario -por teclado- y a continuación
 * lo muestre.
 */
package ejercicio0101;
import java.util.Scanner;

/**
 * En este ejercicio se pide un número y déspues se muestra tal cual.
 * En este caso no procesamos el dato de entrada.
 * Esto no es un caos típico, pero sirve para ir mostrando las distintas
 * herramientas que disponemos.
 * @author Seba
 */
public class Ejercicio0101 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num; // en la variable num guardaremos el número que se introduzca
        
        System.out.println("Escriba un número: ");// salida por consola: mensaje
        Scanner sc = new Scanner(System.in);
        
        num = sc.nextInt(); // entrada por consola
        // ahora mostraremos el calor de la variable num
        System.out.println("Valor introducido: " + num);
        //utilizando + podemos concatenar en la salida por consola tantos
        //mensajes y variables como necesitemos
    }
    
}