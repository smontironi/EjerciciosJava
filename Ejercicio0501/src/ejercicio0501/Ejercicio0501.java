/*
Para guardar 5 numeros es posible utilizar cinco variables escalares, pero es muchos
mas comodo una tabla con 5 elementos. Los numeros pueden tener decimales, por 
tanto declaramos la table de tipo double.
Una vez creada la tabla tendremos que realizar dos recorridos, el primero, para
insertar los valores y, el segundo, para mostrar los datos.
 */
package ejerccio0501;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio0501 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	sc.useLocale(Locale.US); 	//para separar los decimales con punto (no con coma)
	double t[] = new double [5];	//declaracion y crecion de la tabla con tamaño 5
    
        for (int i = 0; i < 5; i++) {	//recorremos para leer los valores
            System.out.print("Introduzca un numero: ");
            t[i] = sc.nextDouble();
	}
	
	System.out.println("Los numeros son: ");
	for (int i = 0; i < 5; i++) {	//recorremos para mostrar
            System.out.println(t[i]);
	}
	//podemos ahorrarnos el segundo recorrido, aprovechando Arrays.toString()
	System.out.println("Otra forma de mostrar la tabla ");
	System.out.println(Arrays.toString(t)); //muestra t
    
    }
    
}
