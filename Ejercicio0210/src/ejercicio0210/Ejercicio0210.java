/*
Un numero capicua se lee igual de derecha a izquierda, que de izquierda a derecha.
Para comparar los guarismos de un numero lo descompondremos  en decenas de millar (dm),
unidades de millar (um), centenas, (c), decenas (d) y unidades.
Un numero capicua tiene las decenas de millar iguales que las unidades, y las unidades
de millar iguales a las decenas. Las centenas no son necesarias compararlas con mas.
Pero hay que tener en cuenta que el numero 121 (que es capicua) al descomponerlo
resulta el entero 00121, por lo tanto, tendremos que trata con especial atencion.
Los numeros que, al descomponerlos, tienen ceros a la izquierda. asi el 121 o el 33
seran reconocidos como capicuas.
La idea es: sin tener en cuenta los ceros por la izquierda, comparar los guarismosdos 
dos por los extremos. }por ej: 121, se descompone 00121, detectar los ceros y 
comparar los guarismos en cada caso.
*/
package ejercicio0210;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio0210 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	
	int dm, um, c, d, u; //almacenaran cada guarismo del numero
	boolean capicua = false; //indica si el numero es capicua. Suponemos que no lo es
	
	System.out.print("Introduzca un numero entre 0 y 99.999: ");
	int num = sc.nextInt();
		
	// descomponemos el numero dividido entre 10 y mediante el resto
	u = num % 10; // unidades Ej: 12345 % 10 =  5 
	num = num / 10; // eliminamos las unidades del numero Ej 12345/ 10 = 1234
	
	d = num % 10; // unidades Ej: 1234 % 10 =  4 
	num = num / 10; // eliminamos las unidades del numero Ej 1234/ 10 = 123
	
	c = num % 10; // unidades Ej: 123 % 10 = 3
	num = num / 10; // eliminamos las unidades del numero Ej 123/ 10 = 12
	
	um = num % 10; // unidades Ej: 12 % 10 =  2 
	num = num / 10; // eliminamos las unidades del numero Ej 12/ 10 = 1
	
	dm = num; //decenas de millar. El numero solo contiene as decenas de millar
	
	//si el numero tiene 5 cifras (dm, um, c, d, u)
	if (dm !=0 && dm == u && um == d){
            capicua = true;
	}
	//si el numero tiene 4 cifras (0, um, c, d, u)
	if (dm == 0 && um != 0 && um == u && c == d){
            capicua = true;
	}
	//si el numero tiene 3 cifras (0, 0, c, d, u)
	if (dm == 0 && um == 0 && c != 0 && c == u){
            capicua = true;
	}
	//si el numero tiene 2 cifras (0, 0, 0, d, u)
	if (dm == 0 && um == 0 && c == 0 && d != 0 && d == u){
            capicua = true;
	}
	//se entiende que un numero de una cifra no es capicua
        if (capicua){
            System.out.println("El numero es capicua");
	} else {
            System.out.println("El numero no es capicua");
	}
    }
}