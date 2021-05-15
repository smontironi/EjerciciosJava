/*
utilizaremos switch, para distinguir las distintas alternativas


 */
package ejercicio0215;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio0215 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int dia;
		
	System.out.print("Introduzca un numero del 1 al 7 :");
	dia = sc.nextInt();
		
	switch (dia){
            case 1:
                System.out.print("Lunes");
                break;
            case 2:
		System.out.print("Martes");
		break;
            case 3:
		System.out.print("Miercoles");
		break;
            case 4:
		System.out.print("Jueves");
		break;
            case 5:
		System.out.print("Viernes");
            	break;
            case 6:
		System.out.print("Sabado");
		break;
            case 7:
		System.out.print("Domingo");
		break;
            }
    }
    
}
