import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c, discriminante, x1, x2, imag, preal;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el coeficiente a: ");
        a = scanner.nextDouble();
        System.out.print("Ingrese el coeficiente b: ");
        b = scanner.nextDouble();
        System.out.print("Ingrese el coeficiente c: ");
        c = scanner.nextDouble();

        discriminante = Math.pow(b, 2) - 4 * a * c;

        if (discriminante > 0) {
            System.out.println("El discriminante es positivo, hay DOS soluciones reales.");
            x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las soluciones son: " + x1 + " y " + x2);
        } else if (discriminante == 0) {
            System.out.println("El discriminante es cero, hay UNA solución real.");
            x1 = -b / (2 * a);
            System.out.println("La solución es: " + x1);
        } else {
            System.out.println("El discriminante es negativo, hay DOS soluciones con números imaginarios.");
            preal = -b / (2 * a);
            imag = Math.sqrt(Math.abs(discriminante)) / (2 * a);
            System.out.println("Las soluciones son: " + preal + " + " + imag + "i y " + preal + " - " + imag + "i");
        }

    }
}