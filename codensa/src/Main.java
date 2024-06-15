import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            byte estrato, uso;
            double consumo, vConsumo, cargoFijo = 0, total=0, subcidio=0;
            String cuenta;

            Scanner entrada = new Scanner(System.in);
            do {
                System.out.println("::Ingrese su usuario::");
                cuenta = entrada.nextLine();
            }while (cuenta.length()!=3);

            do {
                System.out.println("Digite el estrato 1-5");
                estrato = entrada.nextByte();
            }while (estrato<1 || estrato>5);

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
                vConsumo = 320.45*consumo;}
            else if (consumo<=150){
                vConsumo = 450.75*consumo;
            } else if (consumo<=275) {
                vConsumo = 501.75 * consumo;
            }else {
                vConsumo = 600.50 * consumo;
            }
            switch (estrato){
                case 1:
                    cargoFijo=13550;
                    break;
                case 2:
                    cargoFijo=14280;
                    break;
                case 3:
                    cargoFijo=15485;
                    break;
                case 4:
                    cargoFijo=17090;
                    break;
                case 5:
                    cargoFijo=19895;
                    break;
            }
            switch (uso){
                case 1:
                    subcidio = ((cargoFijo+vConsumo)*30)/100;
                    break;
                case 2:
                    subcidio = ((cargoFijo+vConsumo)*27)/100;
                    break;
                case 3:
                    subcidio = ((cargoFijo+vConsumo)*18)/100;
                    break;
            }

            total=vConsumo+cargoFijo-subcidio;
            System.out.print("Total a pagar: $" + total);
    }
}