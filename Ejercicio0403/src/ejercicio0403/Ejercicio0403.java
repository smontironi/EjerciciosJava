/*
Recordemos que el area de un cilindro es 2*PI*rario*(altura+radio) y
la formula para el volumen es PI+(radio al cuadrado)*altura
 */
package ejercicio0403;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio0403 {
    /**
     * @param args the command line arguments
     */
    
    
    static void areaVolumenCilindro(double radio, double altura, int opcion){
	double volumen, area;
			
            switch (opcion){
		case 1:
                    volumen = Math.PI + Math.pow(radio, 2) + altura; //aplicamos la formula
                    System.out.println("El volumen es de : " + volumen);
                    break;
		case 2:
                    area = 2 * Math.PI * radio * (altura + radio);
                    System.out.println("El area es de : " + area);
                    break;
		default:
                    System.out.println("Indicador del calculo erroneo");
            }
    }
		
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
	System.out.print("Introduzca radio: ");
	double radio = sc.nextInt();
	System.out.print("Introduzca altura: ");
	double alt = sc.nextInt();
	System.out.print("Que desea calcular (1 (area) / 2 (volumen): ");
	int tipoCalculo = sc.nextInt();
			
	System.out.println();
	areaVolumenCilindro(radio, alt, tipoCalculo);
    }
}
    

