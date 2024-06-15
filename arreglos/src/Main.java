import java.util.Scanner;

/**
 *
 * @author Jose Polo Perez
 */

public class Main {
    public static void main(String[] args) {
        int cant, i, j, aux;


        Scanner entrada = new Scanner(System.in);


        System.out.print("Digite la cantidad de elementos a ingresar: ");
        cant = entrada.nextInt();

        int [] numeros = new int[cant];

        for (i = 0; i<cant; i++){
            System.out.println("Digite el elemento: "+ (i+1) + ": ");
            numeros[i] = entrada.nextInt();
        }

//        System.out.println("Los numeros son: ");
//        for (i = 0; i<cant; i++){
//
//            System.out.print(numeros[i] + "  ");
//        }

//        System.out.println("Los numeros en orden de ingreso son: ");
//        for(int i : numeros){
//            System.out.print(" "+ i);
//        }

//        System.out.println("Los numeros en orden inverso de ingreso son: ");
//        for (i = cant-1 ; i>=0; i--){
//
//            System.out.print(numeros[i] + "  ");
//        }

        System.out.println("Los numeros en orden son: ");
        for (i = 0; i<(cant-1); i++){
            for (j=0; j<(cant-1); j++){
                if (numeros[j]>numeros[j+1]){
                    aux = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = aux;
                }
            }
        }
        for (i = 0; i<cant; i++){

            System.out.print(numeros[i] + "  ");
        }




    }
}