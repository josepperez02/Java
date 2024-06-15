import java.util.Scanner;

/**
 * @author Jose Alfonso P. Perez
 */
public class Main {
        public static void main(String[] args) {
            byte estrato, uso;
            double consumo, vConsumo, cargoFijo = 0, alcantarillado=0, basura=0, total=0;
            String cuenta;

            Scanner entrada = new Scanner(System.in);
            do {
                System.out.println("::Ingrese su usuario::");
                cuenta = entrada.nextLine();
            }while (cuenta.length()!=7);

            do {
                System.out.println("Digite el estrato 1-6");
                estrato = entrada.nextByte();
            }while (estrato<1 || estrato>6);

            do {
                System.out.println("Digite el tipo de servicio");
                System.out.println("\n");
                System.out.println("1. Residencial \n2. Industrial \n3. Comercial");
                uso = entrada.nextByte();
            }while (uso<1 || uso>3);

            do {
                System.out.println("Digite el consumo");
                consumo = entrada.nextDouble();
            }while (consumo<0);

            if (consumo<100){
                vConsumo = 33.9*consumo;}
                else if (consumo<=150){
                    vConsumo = 95.45*consumo;
                } else if (consumo<=275) {
                vConsumo = 245.75 * consumo;
                }else {
                vConsumo = 295.50 * consumo;
            }
            switch (estrato){
                case 1:
                    cargoFijo=25000;
                    break;
                case 2:
                    cargoFijo=32000;
                    break;
                case 3:
                    cargoFijo=41500;
                    break;
                case 4:
                    cargoFijo=60500;
                    break;
                case 5:
                    cargoFijo=90000;
                    break;
                case 6:
                    cargoFijo=105500;
                    break;
            }
            switch (uso){
                case 1:
                    alcantarillado = (cargoFijo+vConsumo)*0.5;
                    break;
                case 2:
                    alcantarillado = (cargoFijo+vConsumo)*0.85;
                    break;
                case 3:
                    alcantarillado = (cargoFijo+vConsumo)*0.7;
                    break;
            }
            switch (estrato){
                case 1, 2:
                    basura=17830;
                    break;
                case 3, 4:
                    basura=25750;
                    break;
                case 5, 6:
                    basura=46550;
                    break;
            }
                total=vConsumo+cargoFijo+alcantarillado+basura;
            System.out.print("Total a pagar: $" + total);
        }
}