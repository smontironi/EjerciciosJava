/*
Sabiendo que para calcular la letra de un documento nacional de identidad el algoritmo es el siguiente

	Obtener el modulo 23 del DNI
	
	Segun el modulo obtenido y la siguiente tabla, se le asigna la letra correspondiente al DNI

	0 1 2 3	4 5 6 7 8 9 10 11  12 13  14 15	16 17 18 19 20 21 22
	T R W A	G M Y F P D  X  B   N  J   Z  S  Q  V  H  L  C 	K  E
	
Diseñar una aplicacion en la que, dado un numero de DNI, calcule la letra que le corresponde.
 */
package ejercicio0217;
import java.util.Scanner;
/**
 *
 * @author Seba
 */
public class Ejercicio0217 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int numeroDNI, moduloDNI;
		
	System.out.print("Introduzca su numero de DNI: ");
	numeroDNI = sc.nextInt();
	
	moduloDNI = numeroDNI%23;
		
	switch (moduloDNI){
            case 0:
		System.out.println("T");
		break;
            case 1:
		System.out.println("R");
		break;
            case 2:
		System.out.println("W");
		break;
            case 3:
		System.out.println("A");
		break;
            case 4:
		System.out.println("G");
		break;
            case 5:
		System.out.println("M");
		break;
            case 6:
		System.out.println("Y");
		break;
            case 7:
		System.out.println("F");
		break;
            case 8:
		System.out.println("P");
		break;
            case 9:
		System.out.println("D");
		break;
            case 10:
		System.out.println("X");
		break;
            case 11:
		System.out.println("B");
		break;
            case 12:
		System.out.println("N");
		break;
            case 13:
		System.out.println("J");
		break;
            case 14:
		System.out.println("Z");
		break;
            case 15:
		System.out.println("S");
		break;
            case 16:
		System.out.println("Q");
		break;
            case 17:
		System.out.println("V");
		break;	
            case 18:
		System.out.println("H");
		break;
            case 19:
		System.out.println("L");
		break;
            case 20:
		System.out.println("C");
		break;
            case 21:
		System.out.println("K");
		break;
            case 22:
		System.out.println("E");
		break;
	}
    }
    
}
