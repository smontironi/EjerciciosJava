/*
La funcion tendra en cuenta las vocales minusculas y mayusculas. No consideraremos las 
vocales acentuadas (á, é, .) o con dieresis.
 */
package ejercicio0406;

/**
 *
 * @author Seba
 */
public class Ejercicio0406 {

    /**
     * @param args the command line arguments
     */ 
    
    public static void main(String[] args){
	System.out.println("La i es una vocal " + esVocal('i'));
	System.out.println("La E es una vocal " + esVocal('E'));
	System.out.println("La f es una vocal " + esVocal('f'));
    }
	
    //comparamos el parametro de entrada c, con cada posible valor de una vocal
    static boolean esVocal (char c){
	boolean resultado; //true si una c es una vocal y false en caso contrario
		
	if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            resultado = true;
	} else {
            resultado = false;
	}
	return resultado;
	}
    }
    

