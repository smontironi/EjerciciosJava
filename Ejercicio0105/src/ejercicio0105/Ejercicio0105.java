/*
 * Pediremos dos notas enteras y calcularemos la media. Con la media puede
 * tener decimales utilizaremos una variable de tipo real.
 */
package ejercicio0105;
import java.util.Scanner;
/**
 *
 * @author Seba
 */
public class Ejercicio0105 {

    public static void main(String[] args) {
        int nota1, nota2;   //variables enteras para las notas
        double media;       //la media puede contener decimales: usamos double
        Scanner sc = new Scanner(System.in);
        
        //leemos la notas
        System.out.println("Nota 1: ");
        nota1 = sc.nextInt();
        System.out.println("Nota 2: ");
        nota2 = sc.nextInt();
        
        //calculamos la media
        media = (nota1 + nota2) / 2.0;
        // en la operacion (nota1 + nota2) / 2.0 , el punto del 2 hace que 
        // no sea una divison entera. Con ello el resultado subre una 
        // conversion automatica a real en doble precision y conserva
        // la parte decimal.
        
        System.out.println("La media es: " + media);
    }
    
}
