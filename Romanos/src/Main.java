import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Constantes para los valores romanos
        final int I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000;
        int total = 0, vprev = 0;
        String numero;

        Scanner scanner = new Scanner(System.in);

        // Se solicita numero
        do {
            System.out.println("Ingrese un número romano");
            numero = scanner.nextLine();
        } while (numero.length() <= 0);

        for (int i = numero.length() - 1; i >= 0; i--) {
            char actual = numero.charAt(i);
            int valor = 0;

            // Asignar el valor correspondiente al carácter romano actual
            switch (actual) {
                case 'I':
                    valor = I;
                    break;
                case 'V':
                    valor = V;
                    break;
                case 'X':
                    valor = X;
                    break;
                case 'L':
                    valor = L;
                    break;
                case 'C':
                    valor = C;
                    break;
                case 'D':
                    valor = D;
                    break;
                case 'M':
                    valor = M;
                    break;
                default:
                    System.out.println("Símbolo romano inválido: " + actual);
                    return;
            }

            // Si el valor actual es menor que el valor previo, se resta, de lo contrario, se suma
            if (valor < vprev) {
                total -= valor;
            } else {
                total += valor;
            }
            vprev = valor;
        }

        System.out.println("El número romano " + numero + " es " + total + " en entero.");
    }
}