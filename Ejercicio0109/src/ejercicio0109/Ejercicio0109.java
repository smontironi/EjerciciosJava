/*
 * Los datos de entrada que necesitamos son:
 *      - precio por kilo de peras y manzanas
 *      - cantidad vendida en cada trimestre (de peras y manzanas)
 */
package ejercicio0109;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio0109 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double precioManzanas, precioPeras;
        
        int vManza1t, vManza2t, vManza3t, vManza4t; //ventas (en kilos) por trimestre
        int vPeras1t, vPeras2t, vPeras3t, vPeras4t; // igual para las peras
        
        double impTotal; //importe total
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        //pedimos los datos
        System.out.print("Precio del kilo de manzanas: ");
        precioManzanas = sc.nextDouble();
        
        System.out.print("Precio del kilo de peras: ");
        precioPeras = sc.nextDouble();
                      
        System.out.println("Para las manzanas :");
        System.out.print("Ventas (en kilos) del primer trimestre: ");
        vManza1t = sc.nextInt();
        System.out.print("Ventas (en kilos) del segundo trimestre: ");
        vManza2t = sc.nextInt();
        System.out.print("Ventas (en kilos) del tercer trimestre: ");
        vManza3t = sc.nextInt();
        System.out.print("Ventas (en kilos) del cuarto trimestre: ");
        vManza4t = sc.nextInt();
        System.out.println("Para las peras :");
        System.out.print("Ventas (en kilos) del primer trimestre: ");
        vPeras1t = sc.nextInt();
        System.out.print("Ventas (en kilos) del segundo trimestre: ");
        vPeras2t = sc.nextInt();
        System.out.print("Ventas (en kilos) del tercer trimestre: ");
        vPeras3t = sc.nextInt();
        System.out.print("Ventas (en kilos) del cuarto trimestre: ");
        vPeras4t = sc.nextInt();
        
        //calculamos el importe total obtenido
        impTotal = (vManza1t + vManza2t + vManza3t + vManza4t) * precioManzanas;
        impTotal += (vPeras1t + vPeras2t + vPeras3t + vPeras4t) * precioPeras;
        
        System.out.println("El importe total es de : " + impTotal + " euros");
    }
    
}
