/*
 * Redondear un número decimal significa aproximarlo al entero más cercano.
 * Para ello, lo que haremos sera sumar 0.5 y truncar (eliminar los decimales)
 * el resultado. Asi lo números:
 *      2.3 se redondea a 3
 *      4.8 se redondea a 5
 */
package ejercicio0107;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio0107 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double n;   //Aqui guardamos el número decimal introducido por el usuario
        int redondeo;   //utilizamos esta variable para truncar los decimales
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); // en lgar de coma usamos punto para los decimales
        
        System.out.println("Escriba un número decimal (con punto): ");
        n = sc.nextDouble();
        
        // ahora redondearemos n
        redondeo = (int) (n + 0.5); //convertimos un real a entero
        // Esta es una conversión por estrechamiento, por lo tanto estamos
        // obligamos a aplicar un cast (int). En caso de no hacerlo el
        // compilador generara un error.
        System.out.println(n + " redondeado es: " + redondeo);
        
        
    }
    
}
