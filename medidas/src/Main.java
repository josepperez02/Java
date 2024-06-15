import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int tipo;
        double cantidad;


        System.out.println("Escriba una cantidad");
        Scanner entrada= new Scanner(System.in);
        cantidad = entrada.nextInt();

        System.out.println("Digite la unidad de almacenamiento");
        System.out.println("Digite 1, si es kilobyte");
        System.out.println("Digite 2, si es Byte");
        System.out.println("Digite 3, si es Bit");
        tipo=entrada.nextInt();

        switch(tipo){
            case 1: System.out.println(cantidad + " Kilobyte, equivale a: "+cantidad*1000+" Byte");
                System.out.println(cantidad + " Kilobyte, equivale a: "+cantidad*8000+" Bit");
                break;
            case 2: System.out.println(cantidad + " Byte, equival a: "+cantidad/1000+" Kilobyte");
                System.out.println(cantidad + " Byte, equivalesn a: "+cantidad*8+" Bit");
                break;
            case 3: System.out.println(cantidad + " Bit, equivale a: "+cantidad/8000+" Kilometros");
                System.out.println(cantidad + " Bit, equivale a: "+cantidad/8+" Byte");
                break;
            default: System.out.println("La unidad de longitud ingresada no es correcta");

        }
    }
}