/*
Primero leeremos la cantidad de numeros a introducir. Con esta informacion crearemos 
una tabla del tamaño adecuado para albergar todos los datos que se introduciran por 
teclado. Por ultimos, recorremos la tabla, pero comenzando en el ultimo elemento y 
finalizando en el primero, con lo que conseguimos mostrarlos en orden inverso
 */
package ejercicio0502;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio0502 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.println("Cuantos numeros desea introducir: ");
	int cuantosNumeros = sc.nextInt();
	
	int t[] = new int[cuantosNumeros]; //tabla con el tamaño adecuado
	
	for (int i = 0 ; i < t.length; i++) {	//recorremos desde 0 hasta t.length-1
		System.out.print("Introduzca un numero: ");
		t[i] = sc.nextInt();
	}
	
	System.out.println("Los numeros en orden inverso son: ");
	for (int i = t.length - 1; i >= 0; i--) {   //recorremos en orden inverso
		System.out.println(t[i]);
	}
	//en este caso no podemos utilizar Arrays.toString() para mostrar la tabla
    }
    
}
