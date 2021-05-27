/*
Para un numero dado (i), calcularemos si es primo: para ello comprobaremos que no es
divisible por ningun numero perteneciente al rango 2..i-1.
El algoritmo anterior se repetira para cada numero entre 1 y n.
 */
package ejercicio0315;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio0315 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int j, contadorPrimos = 0;
	boolean primo; //bandera que indica si un numero es primo
	
	System.out.print("Escriba n: ");
	int n = sc.nextInt();
	
	//vamor procesando todos lo numeros entre 1 y new
	for (int i = 1; i<=n; i++) { //vamos a comprobar si i es primo
            primo = true; //suponemos inicialmente que i es primo
            j = 2; //j contendra los valores del rango 2...i-1
		
            //el bucle while puede iterar menos vueltas. Consultar algoritmos para primos
            //Saldremos del while cuando tengamos la certeza de que i no es primo o cuando
            //terminemos de comprobar todos los numeros, en cuto casi i es primo
            while (j<= i-1 && primo == true){
                if (i % j == 0) { //si i es divisible por j
                    primo = false; //si es divisible, no puede ser primo
		}
		j++;
            }
		
            if (primo) { //si es primo
		contadorPrimos++; //incrementamos el contador de primos
		System.out.println(i + (" es primo")); //y mostramos
            }
        }
        System.out.println("De 1 a " + n + ", hay " + contadorPrimos + " numeros primos");
    }
        
    
}
