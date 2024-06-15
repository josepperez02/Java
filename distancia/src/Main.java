import java.util.Scanner;

/**
 * @author Jose Alfonso P. Perez
 */

public class Main {
   public static void main(String[] args){
int tipo;
double cantidad;


do {
    System.out.println("Escriba una cantidad");
    Scanner entrada = new Scanner(System.in);
    cantidad = entrada.nextInt();
}while (cantidad<=0);

do {
    System.out.println("Digite la unidad de longitud");
    System.out.println("Digite 1, si es kilometros");
    System.out.println("Digite 2, si es kilometros");
    System.out.println("Digite 3, si es millas");
    Scanner entrada = new Scanner(System.in);
    tipo = entrada.nextInt();
}while (tipo <1 || tipo > 3);

      switch(tipo){
          case 1: System.out.println(cantidad + " Kilometros, equivalesn a: "+cantidad*1000+" Metros");
              System.out.println(cantidad + " Kilometros, equivalesn a: "+cantidad/1.609+" Millas");
              break;
          case 2: System.out.println(cantidad + " Metros, equivalesn a: "+cantidad/1000+" Kilometros");
              System.out.println(cantidad + " Metros, equivalesn a: "+cantidad/1609+" Millas");
              break;
          case 3: System.out.println(cantidad + " Millas, equivalesn a: "+cantidad*1.609+" Kilometros");
              System.out.println(cantidad + " Millas, equivalesn a: "+cantidad*1609+" Metros");
              break;
          default: System.out.println("La unidad de longitud ingresada no es correcta");

      }


   }
}