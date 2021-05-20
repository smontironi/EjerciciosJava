/*
Para calcular los 10 primeros numeros impares utilizaremos un bucle for que:
- comience en 1
- en cada vuelta se incremente en 2; asi obtenemos
    1, 3, 5, 7, 9, 11, 13, 15, 17 y 19
- la i del buclefor debe ser <=19 (o (<20 o <10*2)
 */
package ejercicio0307;

/**
 *
 * @author Seba
 */
public class Ejercicio0307 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int producto = 1;    //guardara la multiplicacion de los primeros numeros
                                //impares. Es muy importante acordarse de inicializarlo a 1. Ya que si lo hacemos
                                //a 0, el produto siempre valdra 0 (por estar multiplicando)
        for (int i = 1; i< 20; i += 2){
            producto = producto * i ; //equivalente a: producto *=i
        }   
        System.out.println("El producto de los 10 primeros impares es: " + producto);
    }
    
}
