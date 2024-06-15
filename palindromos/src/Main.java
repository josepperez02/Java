//dada una cadena de texto determine si es palindromo o no
//@author Jose Polo Perez

import javax.swing.*;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int cant, j=1;
        String palabra;

        do{
            palabra = JOptionPane.showInputDialog("Digite la frase");
        } while (palabra.length() <= 0);

        palabra = palabra.replace(" ","");
        cant = palabra.length();
        String frase[] = new String[cant];
        for (int i=0; i<cant; i++){
            frase[i] = palabra.substring(i, (i+j));
            System.out.print(frase[i] + " ");
        }
        System.out.println("");

        String fraseInv[] = new String[cant];
        for (int i=0; i<cant; i++){
            fraseInv[i] = frase[cant-1-i];
            System.out.print(fraseInv[i] + " ");
        }

        if (Arrays.equals(frase, fraseInv))
            JOptionPane.showMessageDialog(null, "EL TEXTO ES PALINDROMO");
        else
            JOptionPane.showMessageDialog(null, "EL TEXTO NO ES PALINDROMO");
    }
    }
