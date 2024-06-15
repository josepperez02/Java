// crea una funcion a la cual le pase un array de numeros y un numero que sera el resultado de la suma de los valores

import javax.swing.*;


/**
 *
 * @author Jose Polo Perez
 */

public class Main {
    public static void main(String[] args) {
        int suma, primero, segundo, cant;
        do {
            cant=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad numeros"));
        }while (cant<=0);


        int[] numeros = new int[cant];
        for (int i=0; i <= cant-1; i++ ){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numeros"));
        }
        suma=Integer.parseInt(JOptionPane.showInputDialog("Resultado a buscar"));

        for (int i=0; i<= cant-1; i++){
            primero = numeros[i];
            segundo = suma-numeros[i];

            for (int j=(i+1); j<cant-1; j++){
                if(numeros[j] == segundo) {
                    System.out.println("los numeros son " + primero + " " + segundo);
                }
            }

        }
    }
}