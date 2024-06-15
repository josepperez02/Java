import java.util.Scanner;

/**
 * @author Jose Alfonso P. Perez
 */

public class Main {
    public static void main(String[] args) {
        int n, partido, sivota = 0, novota = 0;
        int ttlcp = 0, ttlpl = 0, ttlag = 0;
        int ttlsi = 0, ttlno = 0;
        int vtcp = 0, vtag = 0, vtpl = 0;
        char respuesta;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Numero de votantes: ");
            n = scanner.nextInt();
        }while (n<=0);


        for (int a = 1; a <= n; a++) {
            System.out.println("Encuestados " + a);
            System.out.print("¿Va a votar? (S/N): ");
            respuesta = scanner.next().charAt(0);

            if (respuesta == 'S' || respuesta == 's') {
                sivota++;
                System.out.println("¿Por cual partido desea votar?");
                System.out.println("1. Partido centro paramilitar");
                System.out.println("2. Paracos libres");
                System.out.println("3. alianza guerrilla");
                partido = scanner.nextInt();

                switch (partido) {
                    case 1:
                        vtcp++;
                        break;
                    case 2:
                        vtpl++;
                        break;
                    case 3:
                        vtag++;
                        break;
                    default:
                        System.out.println("No se encontro el partido");
                        break;
                }
            } else {
                novota++;
            }
        }

        ttlno = (int) ((novota / (double) n) * 100);
        ttlsi = (int) ((sivota / (double) n) * 100);
        ttlag = (int) ((vtag / (double) n) * 100);
        ttlcp = (int) ((vtcp / (double) n) * 100);
        ttlpl = (int) ((vtpl / (double) n) * 100);

        System.out.println("Total encuestados: " + n);
        System.out.println("Total votantes por partido 1: " + ttlcp + "%");
        System.out.println("Total votantes por partido 2: " + ttlpl + "%");
        System.out.println("Total votantes por partido 3: " + ttlag + "%");
        System.out.println("Total personas que no votaran: " + ttlno + "%");
        System.out.println("Total personas que votaran: " + ttlsi + "%");

        if (vtag > vtcp && vtag > vtpl) {
            System.out.println("El partido mas votado es: alianza guerrilla");
        } else if (vtcp > vtag && vtcp > vtpl) {
            System.out.println("El partido mas votado es: Partido centro paramilitar");
        } else if (vtpl > vtcp && vtpl > vtag) {
            System.out.println("El partido mas votado es: Paracos libres");
        }
    }
}