/*
Supondremos que todos los numeros introducidos por teclado son distintos. Para 
el caso de numeros iguales solo hay que utilizar el operador >=.
Vamos a plantear tantos condicionales como casos existen con tres numeros. 
 */
package ejercicio0207;

import java.util.Scanner;
/**
 *
 * @author Seba
 */
public class Ejercicio0207 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int a, b, c; //numeros a ordenar
		
            System.out.print("Introduzca primer numero: ");
            a = sc.nextInt();
            System.out.print("Introduzca segundo numero: ");
            b = sc.nextInt();
            System.out.print("Introduzca tercer numero: ");
            c = sc.nextInt();
		
	if (a > b && b > c) {
            System.out.println(a + ", " +  b + ", " + c);
	} else if (a > c && c > b){
            System.out.println(a + ", " +  c + ", " + b);
	} else if (b > a && a > c){
            System.out.println(b + ", " +  a + ", " + c);
	} else if (b > c && c > a){
            System.out.println(b + ", " +  c + ", " + a);
	} else if (c > a && a > b){
            System.out.println(c + ", " +  a + ", " + b);
	} else if (c > b && b > a){
            System.out.println(c + ", " +  b + ", " + a);
	}
    }
}
