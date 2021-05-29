/*
Programa calculadora
 */
package ejercicio0412;

/**
 *
 * @author Seba
 */
public class Ejercicio0412 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int operacion = 1; operacion <= 4; operacion++){ 	//todas las operaciones
            double resultado = calculadora(3, 4, operacion); 	//operamos con 3 y 4
            System.out.println(resultado);
        }
    }
    //realiza la operacion indicada:
    // suma (1), resta (2), multiplicacion(3) o division (4)
    static double calculadora(int a, int b, int operacion) {
        double result; // resultado de l aoperacion
		
        switch (operacion) {
            case 1: //suma
                result = a + b;
                break;
            case 2: //resta
		result = a - b;
		break;
            case 3: //multiplicacion
                result = a * b;
		break;
            case 4: //division
		result = (double)a / b; //el cast fuerza que la division sea realiza
		break;
            default:
		result = 0; //si la operacion no tiene sentido devolvemos 0
		System.out.println("operacion no valida");
		break;
        }
	return (result);
        
    }
}
