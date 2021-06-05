/*
Una vez leido n, crearemos una table de n enteros. Ac ontinuacion leeremos n numeros
que guardaremos en cada elemento de la table. Por ultimo, recorremos la tabla y
procesaremos, sumando los valores(positivo y negativos), para calcular las medias
y contar los ceros
 */
package ejercicio0503;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio0503 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.println("Escriba n: ");
	int n = sc.nextInt();	//leemos n
	int numeros[] = new int[n]; 	//declaramos y creamos una tabla de n elementos
	int sumaPositivos = 0,		//acumulador de numero positivos
		contPositivos = 0,		//contador de numeros positivos
		sumaNegativos = 0, 		//acumulador de numeros negativos
		contNegativos = 0, 		//contador de numeros negativos
		contCeros = 0;			//contador de ceros
		
	for (int i = 0 ; i < numeros.length; i++) { //recorremos para leer los numeros
            System.out.print("Introduzca un numero: ");
            numeros[i] = sc.nextInt();
	}
	//Utilizarmos un bucle para leer los tados y usaremos otro para procesar. Se
	//podria incluir todo en un solo bucle. Es importante comprender que para leer
	//los elementos de una tabla no es posible utilizar un bucle for-each
	
	//procesamos utiliando un for-each
	for (int x : numeros) { //x es una copia del valor de cada elemento
            if (x==0) { //si es un cero
		contCeros++;
            } else { 
                if (x > 0) { //si es positivo
                    sumaPositivos += x;	//acumulamos el numero positivo para hacer la medias
                    contPositivos++; 	//e incrementamos la cantidad de positivos
		} else {
                    sumaNegativos +=x;	//igual para los negativos
                    contNegativos++;
		}
            }
	}
	//al hacer las medias hay que tener cuidado de no realizar una divicion por cero
	if (contPositivos == 0) {
            System.out.println("Imposible realizar la media de los positivos");
	} else { 
            System.out.println("Media de los positivos: " + (double)sumaPositivos/contPositivos); 	
            //el cast es para evitar la division entera, que suprime la parte decimal
	}																							
	if (contNegativos == 0) {
            System.out.println("Imposible realizar la media de los negativos");
	} else { 
            System.out.println("Media de los negativos: " + (double)sumaNegativos/contNegativos); 
	}
	System.out.println("Cantidad de ceros: " + contCeros);
    }
}

