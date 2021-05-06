/*
 * Veremos como Java evita que una operacion provoque un desbordamiento 
 */
package ejercicio0104;

/**
 *
 * @author Seba
 */
public class Ejercicio0104 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        short num;
        num = 32767; //valor máximo dentro del rango de short
        System.out.println("Valor máximo para el tipo short: " + num);
        num++;  //incrementamos en 1. Para evitar salirse del rango, la 
                //variable num tomará el valor mínimo paraeltipo short
        System.out.println("Valor mínimo para el tipo short: " + num);
    }
    
}
