/*
Vamos a utilizar un bucle for, inicializando la i a 0, e iterando hasta que el valor
supere 100. Los multiplos de 7, se caracterizan por que se diferencian en 7.
 */
package ejercicio0306;

/**
 *
 * @author Seba
 */
public class Ejercicio0306 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 100; i += 7){
            System.out.println(i);
        }
    // cuando el bloque de instrucciones de for, while o do-while está
    // formado por una sola instruccion, no precisa de llaves {}
    // aunque, por claridad en el codigo se aconseja ponerlas
    } 
}
