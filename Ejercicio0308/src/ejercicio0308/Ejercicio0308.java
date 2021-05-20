/*
El factorial de n se define como el producto de todos los enteros entre 1 y n.
Por ejemplo: el factorial de 10 es: 10*9*8*7*6*5*4*3*2*1 
 */
package ejercicio0308;
import java.util.Scanner;
/**
 *
 * @author Seba
 */
public class Ejercicio0308 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //podriamos declarar log factorial, pero con una variable  de tipo long se puede
        //calcar hasta el factorial de 25. Mejor utilizaremos un double
        double factorial;
        int num;
        
        System.out.print("Escriba un numero: ");
        num = sc.nextInt();
        
        factorial = 1; //es importante inicialiarlo a 1, ya que multiplicara
        for (int i = num; i>0; i--){
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
    }
    
}
