/*
Este ejercicio es similar al anterior, en el que incrementamos la hora. En este caso
la dificultad es que no todol los meses tienen el mismo numero de dias. Por eso, lo
primero que haremos es ver cuantos dias tiene el mes de la fecha.
No tendremos en cuenta los años bisiestos y suprondremos correcta la fecha introducida.
 */
package ejercicio0214;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio0214 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int diaDelMes=0; //Aqui guardaremos el numero de dias que tiene el mes 
	int dia, mes, anio;
		
	System.out.print("Introduzca dia :");
	dia = sc.nextInt();
	System.out.print("Introduzca mes :");
	mes = sc.nextInt();
	System.out.print("Introduzca año :");
        anio = sc.nextInt();
		
	// suponemos que la fecha introducida es correcta
	if (mes == 2){ //febrero tiene 28 dias
            diaDelMes = 28;
	}
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {//estos meses tienen 30 dias
            diaDelMes = 30;
	}
	if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8) {//estos meses tienen 31 dias
            diaDelMes = 31;
	}
	dia++; //infrementamos el dia
		
	if (dia > diaDelMes) { //si dia supera el numero de dias del mes
            dia = 1;	//reiniciamos el dia a 1
            mes++; 		//e incrementamos el mes
	if (mes > 12) { //si mes supera 12
            mes = 1;	//reiniciamos el mes a 1
            anio++; 	//e incrementamos el año
            }
	}
	//Hay que tener en cuenta que el año paso del -1 a 1 El año 0 nunca existio.
	//Para evitar que el año pase del -1 a 1
		
	if (anio == 0){
            anio = 1;
	}
		
	System.out.println(dia + "/" + mes + "/" + anio);
    }
    
}
