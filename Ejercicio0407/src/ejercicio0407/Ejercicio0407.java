/*
La funcion esPRimo() indica, mediante un booleano, si el numero pasado como parametro
es primo. Un numero n es primo si no es divisible por ningun numero entre 2 y n-1
Recordemos que un numero primo es solo divisible por el mismo y por 1.
 */
package ejercicio0407;

/**
 *
 * @author Seba
 */
public class Ejercicio0407 {

    /**
     * @param args the command line arguments
     */
    static boolean esPrimo(int num) {
        boolean primo = true; //suponemos que el numero es primo
	int i = 2; //primer numero por el que veremos si es divisible
	
	if (num < 2) { //el primer primo es 2
            primo = false;
	}
	
	while (i < num && primo == true) {
            if (num % i == 0) { //si num es divisible por if
                primo = false; //entonces no es numero primo
            }
            i++;
	}
	
	//este algortimo puede mejorar sabiendo que si un numero no es divisible por
	//ningun entero comprendido entre 2 y su raiz cuadrada, entonces ya no sera 
	//divisible por ningun otro numero y sera primo. Quedaria:
	
	// while (i <= (int) MAth.sqrt(num) && primo == true){
	//	...
	//}
	//lo cual ahorra muchas vueltas para numero primo grandes
	return (primo);
    }

    public static void main (String[] args) {
	for (int i = 1; i <= 15; i++){
            if (esPrimo(i)) {
		System.out.println(i + " es primo");
            } else {
		System.out.println(i + " es compuesto");
            }
        }
    }
}

