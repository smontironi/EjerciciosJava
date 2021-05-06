/*
 * Pediremos tres notas enteras y calcularemos la media. Con la media puede
 * tener decimales utilizaremos una variable de tipo real.
 */
package ejercicio0106;
import java.util.Scanner;
/**
 *
 * @author Seba
 */
public class Ejercicio0106 {

    public static void main(String[] args) {
        int nota1, nota2, nota3;   //variables enteras para las notas
        double media;       //la media puede contener decimales: usamos double
        Scanner sc = new Scanner(System.in);
        
        //leemos la notas
        System.out.println("Nota 1: ");
        nota1 = sc.nextInt();
        System.out.println("Nota 2: ");
        nota2 = sc.nextInt();
        System.out.println("Nota : ");
        nota3 = sc.nextInt();
        
        //calculamos la media
        media = (int) ((nota1 + nota2) / 3.0); //convertimos un valor 
        // double en un valor real, truncando la parte decimal. 
        // Por lo tanto, hay perdida de informacion.
        
        System.out.println("La media es: " + media);
    }
    
}
