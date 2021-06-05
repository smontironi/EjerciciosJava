/*
Este ejercicio eliminaremos un elemento de la tabla, sin dejar hueco. La tabla no
tiene por que estar ordenada y, aunque al principio este completamente llena,
tendremos que utilizar un indicador para llevar la cuenta de los elementos que 
quedan tras los borrados
 */
package ejercicio0504;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio0504 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int t[] = {23, 8, 1, -3, 17, 5, 99}; 
	
	int numElem = t.length; //el numero de elementos validos de 7
	System.out.println(Arrays.toString(t)); //mostramos la tabla completamente
	System.out.println("Indice de elemento a borrar: ");
	int indiceBorrar = sc.nextInt();
	while (indiceBorrar >= 0 && numElem != 0) { //mientras el indice sea positivo y
            if (indiceBorrar < numElem) {           //existan elementos validos en la tabla
            //algoritmo de eliminacion en una tabla no rodenada
            t[indiceBorrar] = t[numElem - 1];       //sustituimos el valor del elemento por el 
                                                    //ultimo elemento valido
            numElem--; 	//ahora tenemos un dato menos en la tabla
            mostrarTabla(t, numElem); //muestra solo los datos validos de t
            } else {
		System.out.println("No existe elemento a borrar");
            }
		System.out.println("Indice del elemento a borrar");
		indiceBorrar = sc.nextInt(); //leemos de nuevo el indice a borrar
	}
    }	
	//Esta funcion muestra solo los primeros n elementos de la tabla t Suponemos que
	//la tabla pasada como parametro siempre tiene un tamaño mayor o igual que new
    static void mostrarTabla(int a[], int n){
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+ " ");
	}
            System.out.println("]");
	}
    }

