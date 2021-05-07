/*
 * Los datos de entrada que necesitamos son:
 *      - cantidad vendida en el trimestre 1 (de peras y manzanas)
 *      - cantidad vendida en el trimestre 2
 *      - cantidad vendida en el trimestre 3
 *      - cantidad vendida en el trimestre 4
 */
package ejercicio0108;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio0108 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double PRECIO_MANZANAS = 2.35;    // valores constantes, ya que no tienen que 
        final double PRECIO_PERAS = 1.95;       // variar a lo largo del programa.
        // lo identificadores de constanteslos escribimos en mayusculas.
        
        int vManza1t, vManza2t, vManza3t, vManza4t; //ventas (en kilos) por trimestre
        int vPeras1t, vPeras2t, vPeras3t, vPeras4t; // igual para las peras
        
        double impTotal; //importe total
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        //pedimos los datos
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
        impTotal = (vManza1t + vManza2t + vManza3t + vManza4t) * PRECIO_MANZANAS;
        impTotal += (vPeras1t + vPeras2t + vPeras3t + vPeras4t) * PRECIO_PERAS;
        
        System.out.println("El importe total es de: " + impTotal + " euros");
    }
    
}
