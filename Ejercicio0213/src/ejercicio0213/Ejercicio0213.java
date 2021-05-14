/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio0213;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio0213 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int h, m, s; //horas, minutos y segundos
        
	System.out.print("Introduzca hora: ");
	h = sc.nextInt();
        System.out.print("Introduzca minutos: ");
	m = sc.nextInt();
        System.out.print("Introduzca segundos: ");
	s = sc.nextInt();
        
        s++; //incrementamos los segundos
        
        if ( s > 59 ){//si los segundos superan 59
            s = 0 ; //los reiniciamos a 0
            m++;    //e incrementamos los minutos
            
            if ( m > 59 ){//si los minutos superan 59
            m = 0 ; //los reiniciamos a 0
            h++;    //e incrementamos la hora
                if (h > 23) {//si la hora suepra 23
                    h = 0; //reiniciamos la hora a 0
                    
                }
            }
        }
        System.out.println("Hora + 1 segundo: " + h +" : " + m + " : " + s);
    }
}
