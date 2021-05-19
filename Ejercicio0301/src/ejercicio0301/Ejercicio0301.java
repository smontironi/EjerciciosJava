/*
A priori no tenemos la certeza de cuantas veces se ejecutara el innorme, por lo tanto,
los unicos bucles que se adptan son while o do-while. Recordamos que la diferencia
entre ellos es que uno se ejecuta 0 o mas veces, y el otro al menos 1 vez.
En este caso, si se itroduce un 0 como primer número, el informe no se ejecuta.
Utilizaremos un bucle while.
 */
package ejercicio0301;
import java.util.Scanner;
/**
 *
 * @author Seba
 */
public class Ejercicio0301 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean esPar, esPositivo; //indicadores para el informe
        System.out.print("Introduzca un número: ");
	int num = sc.nextInt(); //leemos el número
        
        while(num !=0){ //repetimos mientras el número leido no sea 0
            //si divido un número entre 2 y tengo como resto 0, significa que es par
            //el operador %(resto y modulo) calculael resto. Asi sabremos la paridad
            esPar = num % 2 ==0 ? true : false; //si el resto es 0, sera par
            esPositivo = num >= 0 ? true : false; //consideramos el 0 positivo
            
            System.out.println("Es par?: " + esPar + "\nEs positivo?: " + esPositivo);
            System.out.println("Cuadrado: "+ num*num);
            System.out.print("Introduzca otro número: ");
            
            num = sc.nextInt(); //volvemos a leer
        }
        
    }
    
}
