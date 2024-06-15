//@autor: Jose Polo Perez

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
        //creacion de objetos
        Operation op = new Operation();


        op.sumar(n1,n2);
        op.restar(n1,n2);
        op.multiplicar(n1,n2);
        op.dividir(n1,n2);
        op.raiz(n1);
        op.pote(n1, n2);
        op.imprimir();
    }
}