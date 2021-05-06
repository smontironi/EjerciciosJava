/*
 * La edad puede calcularse como la diferencia entre el año actual y el de
 * nacimiento. Esto puede contener un error, en el caso de que en la fecha
 * actual aun nose haya celebrado el cumpleaños del año en curso.
 * Supondremos que el cumpleaños del usruario ya ha tenido lugar este año.
 */
package ejercicio0103;
import java.util.Scanner;
/**
 *
 * @author Seba
 */
public class Ejercicio0103 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aActual;        //año en curso (actual)
        int aNacimiento;    //año de nacimiento
        int edad;
        Scanner sc = new Scanner(System.in);
        
        //Leemos los datos
        System.out.println("Año de naciminento: ");
        aNacimiento = sc.nextInt();
        System.out.println("Año de actual: ");
        aActual = sc.nextInt();
        
        edad = aActual - aNacimiento; //calculamos la edad 
        
        System.out.println("Su edad es: " + edad + " años.");
        
    }
    
}