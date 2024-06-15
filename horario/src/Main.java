import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int horaent, horasal, horat, minent, minsal, mint, segent, segsal, segt;
        int am, pm;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Escriba Hora Inicial: ");
        horaent = scanner.nextInt();
        System.out.print("Minutos: ");
        minent = scanner.nextInt();
        System.out.print("Segundos: ");
        segent = scanner.nextInt();
        System.out.print("Escoja la opcion 1.Am , 2.Pm: ");
        am = scanner.nextInt();

        System.out.print("Escriba Hora Final: ");
        horasal = scanner.nextInt();
        System.out.print("Minutos: ");
        minsal = scanner.nextInt();
        System.out.print("Segundos: ");
        segsal = scanner.nextInt();
        System.out.print("Escoja la opcion 1.Am o 2.Pm: ");
        pm = scanner.nextInt();

        if (am == 1 && pm == 2) {
            horat = (horasal + 12) - horaent;
            mint = minsal - minent;
            segt = segsal - segent;
        } else if (am == 2 && pm == 2) {
            horat = horasal - horaent;
            mint = minsal - minent;
            segt = segsal - segent;
        } else if (am == 1 && pm == 1) {
            horat = horasal - horaent;
            mint = minsal - minent;
            segt = segsal - segent;
        } else { // am == 2 && pm == 1 is invalid, handling other cases
            System.out.println("¡Configuración de tiempo no válida!");
            return;
        }

        // Adjust for negative values in minutes and seconds
        if (segt < 0) {
            segt += 60;
            mint -= 1;
        }

        if (mint < 0) {
            mint += 60;
            horat -= 1;
        }

        if (horat < 0) {
            horat += 24;
        }

        System.out.println("Tiempo Transcurrido: " + horat + ":" + mint + ":" + segt);
    }
}