/*
 * Pedir al un usuario su edad y mostrar la edad que tendrÃ¡ el prÃ³ximo aÃ±o
 */
package ejercicio0102;
import java.util.Scanner;
/**
 * En el ejercicio realizamos las tres fases tÃ­picas de cualquier aplicaciÃ³n:
 * - Entrada de datos: pedimos la edad
 * - Procesado: en este caso incrementar la edad en 1
 * - Salida de datos: mostrar los resultados
 * @author Seba
 */
public class Ejercicio0102 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad; // aquÃ­ guardaremos la edad del usuario
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba su edad :");
        edad = sc.nextInt();
        edad = edad + 1;//el aÃ±o que viene tendra un aÃ±o mas
        // la lÃ­nea anterior puede sustituirse por: edad++
        // ahora mostraremos el valor de la variable edad
        System.out.println("El prÃ³ximo aÃ±o su edad serÃ¡: " + edad + " aÃ±os.");
    }
    
}
