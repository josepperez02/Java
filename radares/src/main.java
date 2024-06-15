import java.util.Scanner;

public class main {
    public static void main(String[] args){
        int num1, num2;
        double num3, num4;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite un numero del 1 al 5: ");
        num1 = scanner.nextInt();

        System.out.print("Digite el segundo numero: ");
        num2 = scanner.nextInt();

        System.out.print("Digite el tercer numero: ");
        num3 = scanner.nextDouble();

        System.out.print("Digite el cuarto numero: ");
        num4 = scanner.nextDouble();

        if (num1 % 2 == 0) {
            System.out.println("Avion en la zona");
            switch (num2) {
                case 1:
                    System.out.println("avion militar");
                    break;
                case 2:
                    System.out.println("avion civil de carga");
                    break;
                case 3:
                    System.out.println("avion civil de pasajero");
                    break;
                case 4:
                    System.out.println("avion enemigo");
                    break;
                case 5:
                    System.out.println("avion sin permiso");
                    break;
                default:
                    System.out.println("El numero es incorrecto");
                    break;
            }
            System.out.println(num3 + " KM");
            if (num4 >= 0.1 && num4 < 2.3) {
                System.out.println("Direccion norte");
            } else if (num4 > 2.3 && num4 < 4.5) {
                System.out.println("Direccion sur");
            } else if (num4 > 4.5 && num4 < 6.7) {
                System.out.println("Direccion oriente");
            } else if (num4 > 6.7 && num4 < 8.9) {
                System.out.println("Direccion occidente");
            } else if (num4 > 8.9) {
                System.out.println("Direccion desconocida");
            }
        } else {
            System.out.println("No hay avion en la zona");
        }

        System.out.println(num1 + " " + num2 + " " + num3 + " " + num4);

    }

}
