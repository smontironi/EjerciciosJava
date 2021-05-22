/*
Ya tenemos un algoritmo (en el ejercicio anterior) para realizar la tabla de multiplicar 
de un numero dado. La idea es aprovecharlo, yejecutar el codigo repetidas 
veces para mostrar las tablas de mulitplicar del 1 al 10.
 */
package ejercicio0311;

/**
 *
 * @author Seba
 */
public class Ejercicio0311 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int tabla = 1; tabla <= 10; tabla++) {
            System.out.println("\n\nTabla del " + tabla);
			
            //por cada iteracion del bucle enterior, el interior se ejecuta 10 veces
            for (int i = 1; i<=10; i++){
		System.out.println(tabla + " x " + i  + " = " + tabla * i);
            }
	}
    }
    
}
