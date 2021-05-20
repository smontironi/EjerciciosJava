/*
Primero solicitamos los valores extremos del rango. A continuacion, utilizaremos un
bucle do-while para pedir un numero y verificar que pertenece al rango. Una propiedad
del bucle do-while es que su bloque de instrucciones se ejecuta al menos una vez.
 */
package ejercicio0305;
import java.util.Scanner;
/**
 *
 * @author Seba
 */
public class Ejercicio0305 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, min, max; //variables
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Valor minimo del rango: ");
	min = sc.nextInt(); //supondremos que min sera menor que max
	System.out.print("Valor maximo del rango: ");
	max = sc.nextInt();
	
	do {
            System.out.print("Escriba un numero: ");
            n = sc.nextInt();
	} while (! (min <= n && n <= max)); //mientras n no pertenezca al rango
	
	System.out.println(n + " pertenece al rango"); //al salir del bucle, tenemos la
                                                    //certeza que n pertenece al rango min max
	
	}
    
    
}
