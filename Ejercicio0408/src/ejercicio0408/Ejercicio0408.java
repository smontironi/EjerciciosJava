/*
Para calcular los divisores de un numero, solo tendremos en cuenta los numeros primos
comprendidos entre el 1 y el numero que nos interese.
Un ejemplo: los divisores de 24 son 1, 2 y 3.
Aunque 4 y 6 tambien dividen a 24, nose consideran al no ser primos
 */
package ejercicio0408;

/**
 *
 * @author Seba
 */
public class Ejercicio0408 {

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
    static int numDivisoresPrimos(int num){
        int cont; //contador de divisiones
	cont = 1; //siempre habra un divisor seguro, el 1.
	for(int i = 2; i <= num; i++){
            if (esPrimo(i) && num % 1 == 0){ //si el numero i es primo y divide a num
		cont++; //incrementamos el numero de divisores
            }
	}
	return (cont);
    }
    
    public static void main(String[] args) {
        System.out.println("Divisores de 24: " + numDivisoresPrimos(24));
    }
    
}
