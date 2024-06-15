import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int unid, dec, cent, umil, dmil, cmil;
        String numero;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Digite un numero de seis digitos: ");
            numero = scanner.nextLine();
        }while (numero.length()!=6);

        int num = Integer.parseInt(numero);
            cmil = num % 10;
            num = num / 10;
            dmil = num % 10;
            num = num / 10;
            umil = num % 10;
            num = num / 10;
            cent = num % 10;
            num = num / 10;
            dec = num % 10;
            num = num / 10;
            unid = num % 10;
            num = num / 10;

            System.out.println("Unidades: " + unid);
            System.out.println("Decenas: " + dec);
            System.out.println("Centenas: " + cent);
            System.out.println("Unidades de Mil: " + umil);
            System.out.println("Decenas de Mil: " + dmil);
            System.out.println("Centenas de Mil: " + cmil);

            int sumaCentro = cent + umil;
            System.out.println("El resultado de la suma de los digitos del centro es: " + sumaCentro);

            int multiplicacionExtremos = unid * cmil;
            System.out.println("El resultado de la multiplicacion de los digitos de los extremos es: " + multiplicacionExtremos);

            int restaQuintoSegundo = dmil - dec;
            System.out.println("El resultado de la resta entre el quinto y segundo digito es: " + restaQuintoSegundo);

        }
    }
