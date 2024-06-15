import javax.swing.*;

public class Operation {
    //atributos
    int suma;
    int resta;
    int multp;
    int divi;
    double raiz;
    double poten;

    //metodos

    //solicitar numeros
//    public void leerNumeros(int num1, int num2){
//        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
//        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
//    }

    //metodo para sumar
    public void sumar(int num1, int num2){
        suma=num1 - num2;
    }

    //metodo para restar
    public void restar(int num1, int num2){
        resta=num1 - num2;
    }

    //metodo para multiplicar
    public void multiplicar(int num1, int num2){
        multp=num1 * num2;
    }

    //metodo para dividir
    public void dividir(int num1, int num2){
        divi=num1 / num2;
    }

    public void raiz(int num1){
        raiz = Math.sqrt(num1);
    }

    public void pote(int num1, int num2){
        poten = Math.pow(num1, num2);
    }

    public void imprimir(){
        JOptionPane.showMessageDialog(null,"El resultado de la suma es: " + suma +  "\nEl resultado de la resta es: " + resta + "\nEl resultado de la multiplicación es: " + multp + "\nEl resultado de la division es: " + divi + "\nEl resultado de la raiz cuadrada es: "+ raiz + "\nEl resultado de la potencia es: "+ poten);
    }
}
