/*
Vamos a sobrecargar la funcion para que tenga tres parametros maximo (a, b, c). Para 
implementar la funcion tenemos dos opciones; escribimos el algoritmo desde cero, o nos
basamos en la funcion que ya hemos creado (en el ejercicio antorior). En este caso, 
vamos a reutilizar el codigo existente.
 */
package ejercicio0405;

/**
 *
 * @author Seba
 */
public class Ejercicio0405 {

    /**
     * @param args the command line arguments
     */
    
    static int maximo (int a, int b, int c){
        int aux = maximo(a, b); //la variable auxiliar contiene el mayor entre a y basamos
	return (maximo(a, b)); 	//devuelve el mayor entre aux y caso
    }
		
    // funcion maximo para dos numeros
    static int maximo (int a, int b){
	int max;
            
            if (a > b) { //si a es mayor que b
                max = a;
            } else { //si son iguales o b mayor que a
                max = b;
            }	//del if
        
            return (max); 
    }
    //main para probar la funcion
    public static void main(String[] agrs){
	int max =maximo(2, 9, 7);
	System.out.println("El valor es: " + max);
    }	
		
}
    

