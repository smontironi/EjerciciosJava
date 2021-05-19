/*
Como no sabesmos cuantas edades se van a utilizar como datos, utilizaremos un bucle
while. En cada iteracion acumularemo la edad, incrementaremos un contador para llevar 
la cuenta de las edades introducidas y deendeindo si el alumno es mayor de edad,
incrementaremos el contador de alumnos mayores de edad.
Cuando salgamos del bucle mostraremos los datos y calcularemos la media

 */
package ejercicio0302;

//para salir del while usamos un numero negativo

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio0302 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumaEdades = 0; //acumulara la suma de todas las edades
        int contadorAlumnos = 0,    //contador de alumnos (o de edades introducidas)
            contadorMayorEdad = 0; //contador del numero de alumnos maores de edad
        double media; //media de las edades
        
        System.out.print("Introduzca la edad: ");
        int edad = sc.nextInt();
        
        while (edad>=0) {   //repetimos mientras la edad no sea negativa
            sumaEdades += edad; //acumulamos la edad introducida
            contadorAlumnos ++;  //incrementamos, se ha introducido la edad de un alumnos mas
            if (edad >=18){ //si la edad introducida corresponde a un mayor de edad
                contadorMayorEdad++;    //incrementamos, ahora hay un mayor de edad
            }
            System.out.print("Introduzca la edad: ");
            edad = sc.nextInt(); //volvemos a leer
        }
        media = (double) sumaEdades / contadorAlumnos;  //con el cast la division es real
        
        //mostramos el informe estadistico
        System.out.println("Suma de todas las edades: "+ sumaEdades);
        System.out.println("Media: " + media);
        System.out.println("Número total de alumnos: " + contadorAlumnos);
        System.out.println("Mayores de edad: " + contadorMayorEdad);
    }
    
}
