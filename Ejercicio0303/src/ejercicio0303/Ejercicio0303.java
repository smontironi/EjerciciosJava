/*
La aplicacion generara un numero aleatorio entre 1 y 100. A continuacion el jugador
ira probando suerte con la ayuda de las indicaciones que la propia aplicacion le
ofrece. El juego termina cuando acierta o cuando se rinde (introduciendo un -1)
 */
package ejercicio0303;

import java.util.Scanner;
/**
 *
 * @author Seba
 */
public class Ejercicio0303 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numSecreto = (int) (Math.random()*100 +1); //numero aleatorio entre 1 y 100
        
        System.out.print("Introduzca un número entre entre 1 y 100: ");
        int num = sc.nextInt();
        
        while (numSecreto != num && //mientras no acertemos (ambos numero son distintos)
                num != -1)   {      //y no introduzamos un -1
            if (numSecreto < num){  //si el numero secreto es menor que el introducido
                System.out.println("Menor");
            } else { //en otro caso, sera mayor
                System.out.println("Mayor");
            }
            System.out.print("Introduzca otro numero: ");
            num = sc.nextInt();   
        }
        //salimos del bucle por: el jugador acierta el numero o se rinde
        if (numSecreto ==num){
            System.out.println("Felicitaciones !!!");
        } else { //en otro caso, sera mayor
            System.out.println("Otra vez sera..");            
        }
    }  
}
