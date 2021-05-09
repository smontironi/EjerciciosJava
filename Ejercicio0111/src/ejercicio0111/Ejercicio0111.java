/* Primer ejercicio propuesto:
 * 
 * Un economista nos ha escargado un programa para realizar calculos con el IVA.
 * La aplicacion debe solicitar la base imponible y el IVA a aplicar. Debemos mostrar le
 * la pantalla el importe correspondiente al IVA y al total
 */
package ejercicio0111;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio0111 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double baseImponible, montoTotal, iva, ivaCoef, ivaMonto;
                
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        //pedimos la base imponible
        System.out.println("Escriba la base imponible: ");
        baseImponible = sc.nextDouble();
        
        //pedimos el IVA
        System.out.println("Escriba el IVA a aplicar (en porcentaje): ");
        iva = sc.nextDouble();
        
        //pasamos el entero a coeficiente
        ivaCoef = (iva/100);
        
        //calculamos los resultados
        ivaMonto = (baseImponible * ivaCoef); 
        montoTotal = (baseImponible + ivaMonto);
        
        System.out.println("La base imponible es de: $"+ baseImponible+".");
        System.out.println("El porcentaje de IVA es " + iva + "% y el valor de IVA es de: $ " + ivaMonto+".");
        System.out.println("El monto total a pagar es de $: " + montoTotal + ".");
        
    }
    
}
