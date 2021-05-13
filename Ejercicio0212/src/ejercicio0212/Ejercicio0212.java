/*
Hay que tener en cuenta que no todos los meses tiene el mismo nuemro de dias.
 */
package ejercicio0212;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio0212 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int dia, mes, anio;
        boolean fechaCorrecta; //bandera que idica si la fecha es correcta
        
        System.out.print("Introduzca dia: ");
	dia = sc.nextInt();
        System.out.print("Introduzca mes: ");
	mes = sc.nextInt();
        System.out.print("Introduzca año: ");
	anio = sc.nextInt();
        
        if (anio ==0){ //el unico año que no existe es el 0
            fechaCorrecta = false;
        } else {
            //primero comprobaremos febrero (mes = 2)
            if ((mes == 2) && (1 <=dia && dia <= 28)){
                fechaCorrecta = true;
            } else  //veremo si e sun mes de 30 dias)
            if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (1 <= dia && dia <= 30)){
                fechaCorrecta = true;
            } else  //veremo si e sun mes de 31 dias)
            if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 ) && (1 <= dia && dia <= 31)){
                fechaCorrecta = true;
            } else { // en cualquier otro caso
                fechaCorrecta = false;
            }
        }
        if (fechaCorrecta) {
            System.out.println("Fecha correcta :" + dia +  "/" + mes + "/" + anio);
        } else {
            System.out.println("Fecha incorrecta");
        }
    }
}