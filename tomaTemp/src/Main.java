import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int temp, tempMa = 0, tempMe = 0, tempCero = 0;
        int ttlMa = 0, ttlMe = 0, ttlCero = 0;

        Scanner scanner = new Scanner(System.in);

        for (int a = 1; a <= 10; a++) {
            System.out.print("Digite la temperatura actual: ");
            temp = scanner.nextInt();

            if (temp == 0) {
                tempCero += temp;
                ttlCero += 1;
            } else if (temp >= 1) {
                tempMa += temp;
                ttlMa += 1;
            } else if (temp <= -1) {
                tempMe += temp;
                ttlMe += 1;
            }
        }

        System.out.println("Cantidad de temperaturas cero: " + ttlCero);
        System.out.println("Cantidad de temperaturas mayores que cero: " + ttlMa);
        System.out.println("Cantidad de temperaturas menores que cero: " + ttlMe);

    }

}