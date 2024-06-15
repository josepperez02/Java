import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double htra, hex, phex = 0, sueldo, hijos, sub = 0, ttl, cat = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite la cantidad de horas trabajadas en este mes: ");
        htra = scanner.nextDouble();

        System.out.println("Ingresa la categoria del trabajador: ");
        System.out.println("1. Categoria 1");
        System.out.println("2. Categoria 2");
        System.out.println("3. Categoria 3");
        System.out.println("4. Categoria 4");
        int categoria = scanner.nextInt();

        switch (categoria) {
            case 1:
                cat = ((6000 * 45) / 100) + 6000;
                break;
            case 2:
                cat = ((6000 * 30) / 100) + 6000;
                break;
            case 3:
                cat = ((6000 * 15) / 100) + 6000;
                break;
            case 4:
                cat = 6000;
                break;
            default:
                System.out.println("¡Categoria invalida!");
                return; // Termina el programa si la categoría es inválida
        }


        System.out.print("Cantidad de horas extras trabajadas: ");
        hex = scanner.nextDouble();

        if (hex < 10) {
            phex = (cat * 50) / 100;
        } else if (hex >= 10 && hex <= 20) {
            phex = (cat * 40) / 100;
        } else if (hex > 20) {
            phex = (cat * 20) / 100;
        }

        sueldo = (htra * cat) + (hex * phex);

        System.out.print("¿Cuantos hijos tiene el trabajador? ");
        hijos = scanner.nextDouble();

        if (hijos >= 1 && hijos <= 2) {
            sub = (sueldo * 10) / 100;
        } else if (hijos >= 3 && hijos <= 4) {
            sub = (sueldo * 7.5) / 100;
        } else if (hijos == 0) {
            sub = 0;
        }

        ttl = sueldo + sub;

        System.out.println("El sueldo base es: " + sueldo);
        System.out.println("El subsidio por hijos: " + sub);
        System.out.println("Total pago: " + ttl);
    }
}