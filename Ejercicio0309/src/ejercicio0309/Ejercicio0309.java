/*
Introducimos la altura de cada arbol dentro de un bucle y guardaremos la mayor y el
numero de etiqueta del arbol al que corresponde
En la busqueda del maximo (o minimo) se  no splantea un problema con que valor
inicializamos el maximo. Hemo de inicializar el maximo con un valor menor o igal a
algunos de los valores con los que trabajemos
Un ejemplo: si se desea calcular el maximo de {-2, -7 y -4}, esta claro que el
maximo es -2, pero si inicializamos de forma arbitaria el maximo a 0, al ser 0 mayor
que cualquier valor del conjunto, el algoritmo dira que el maximo es 0. Algo erroneo,
En este caso, como trabajamos con alturas (todos positivo), podrriamo inicializar 
sin problema a 0, ya que 0 es menor que cualquier positivo. Sin embargo, en el caso
general, la mejor opcion es inicializar el maximo al primer valor leido.
 */
package ejercicio0309;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio0309 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int etiquetaArbolMasAlto, 	//numero identificativo del arbol mas alto
		alturaArbolMasAlto;		//altura del arbol mas alto
			
            //como no sabemos cuantos arboles hay, utilizamos un while
            int etiqueta = 0; 	//numero identificativo del arbol del que se piden los datos
            int altura ;		//altura del arbol del que se piden los datos
		
            System.out.print("Altura del arbol (" + etiqueta + "): ");
            altura = sc.nextInt();
            alturaArbolMasAlto = altura; 	//el primer arbol sera, por ahora, el mas alto
            etiquetaArbolMasAlto = 0;           //el arbol con etiqueta 0 es, por ahora, el mas alto12
            
            while (altura != -1){
		if (altura > alturaArbolMasAlto){ //hemos encontrado un arbol mas alto
		alturaArbolMasAlto = altura;
		etiquetaArbolMasAlto = etiqueta;
                }
                
                etiqueta++;	//incrementamos la etiqueta, para solicitar la altura del siguiente
		System.out.print("Altura del arbol (" + etiqueta + "): ");
		altura = sc.nextInt();
            }
            
            if (etiquetaArbolMasAlto == -1){
		System.out.println("No hay ningun arbol");
            } else {
		System.out.println("El arbol mas alto mide: " + alturaArbolMasAlto);
		System.out.println("Corresponde al arbol con etiqueta: " + etiquetaArbolMasAlto);
            }
    }
}