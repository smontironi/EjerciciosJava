/* Ejercicio 18 propuesto
Un biologo esta realizando un estdio de distintas especias de invertebrados y necesita
una aplicacion que le ayude a contabilizar el numero de patas tiene en total todos
los animales capturados durante una jornada de trabajo. Para ello, nos ha solicitado
que escribamos una aplicacion a la que ha que proporcionar:

    + numero de hormigas capturadas (6 patas)
    + numero de arañas capturadas (8 patas)
    + numero de cochinillas capturadas (14 patas)

La aplicacion debe mostrar el numero de patas que poseen todos los animales.
 
 */
package ejercicio0118;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio0118 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int hormiga, arania, cochinilla, patasHormiga, patasArania, patasCochinilla, patasTotal;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escriba la cantidad de hormigas capturadas: ");
        hormiga = sc.nextInt();
        System.out.println("Escriba la cantidad de arañas capturadas: ");
        arania = sc.nextInt();
        System.out.println("Escriba la cantidad de cochinilla capturadas: ");
        cochinilla = sc.nextInt();
        
        patasHormiga = hormiga * 6;
        patasArania = arania * 8;
        patasCochinilla = cochinilla *14;
        
        patasTotal = patasHormiga + patasArania + patasCochinilla; 
        
        System.out.println("El numero total de patas es : " + patasTotal+ ".");
    }
    
}
