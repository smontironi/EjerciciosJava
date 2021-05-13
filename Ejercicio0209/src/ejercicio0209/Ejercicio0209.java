/* Sabemos que los numeros comprendidos entre 0 y 9, inclusives, tienen una cifra.
Los numeros comprendidos entre 10 y 99, inclusives, tienen dos cifras.
Los numeros comprendidos entre 100 y 999, inclusives, tienen tres cifras.
Etc.
 */

package ejercicio0209;

import java.util.Scanner;


/**
 *
 * @author Seba
 */
public class Ejercicio0209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
	System.out.print("Introduzca un numero entre 0 y 99.999: ");
	int num = sc.nextInt();
		
	if (num <10){
	System.out.println("Tiene una cifra");
	} else if (num <100){
	System.out.println("Tiene dos cifras");
	} else if (num <1000){
	System.out.println("Tiene tres cifras");
	} else if (num <10000){
	System.out.println("Tiene cuatro cifras");
	} else if (num <100000){
	System.out.println("Tiene cinco cifras");
	}
    }
    
}
