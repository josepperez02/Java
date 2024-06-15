import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Jose P.
 */

public class Main {
    public static void main(String[] args) {
    String placa, horaE, horaS;
    int tipoVehiculo, hora, min, tIngreso, tSalida = 0, tiempo, opc;
    double cobro = 0, pago, cambio;

    double b50, b20, b10, b5, b2, m1, m500, m200, m100, resto;

        Scanner entrada = new Scanner(System.in);

        do {


        System.out.println("Tipo de vehiculo: ");
        System.out.println("1. Carro");
        System.out.println("2. Moto");
        tipoVehiculo = entrada.nextInt();


        //placa="AAA-000-A"; //Caso 1
        //placa="AAA-00-00"; //Caso 2


        }while (tipoVehiculo != 1 && tipoVehiculo != 2);
            switch (tipoVehiculo){
                case 1:
                do {
                    System.out.println("Ingresa la placa del automovil: ");
                    placa = entrada.next().toUpperCase();
                    Pattern p = Pattern.compile("([A-Z]{3}[0-9]{3})");
                    Matcher mt = p.matcher(placa);
                    if(mt.find() == true){
                        System.out.println("Las placas son validas");
                        opc = 1;
                    }else{
                        System.out.println("Las placas no son validas");
                        opc = 0;
                    }
                }while (placa.length()!= 6 || opc == 0);
                break;

            case 2:
                do {
                    System.out.println("Ingresa la placa de la moto: ");
                    placa = entrada.next().toUpperCase();
                    Pattern p = Pattern.compile("([A-Z]{3}[0-9]{2}[A-Z]{1})");
                    Matcher mt = p.matcher(placa);
                    if(mt.find() == true){
                System.out.println("Las placas son validas");
                opc = 1;
            }else{
                System.out.println("Las placas no son validas");
                opc = 0;
            }
                }while (placa.length()!= 6 || opc == 0);
                break;

        }

        do {
            System.out.println("Hora de ingreso en formato 24h [hh:mm]");
            horaE = entrada.next();
            hora = Integer.parseInt(horaE.substring(0,2));
            min = Integer.parseInt(horaE.substring(3,5));
        } while (hora < 6 || hora >23 || min < 0 || min >59);
        tIngreso = (hora * 60 + min);

        do {
            System.out.println("Hora de salida en formato 24h [hh:mm]");
            horaS = entrada.next();
            hora = Integer.parseInt(horaS.substring(0, 2));
            min = Integer.parseInt(horaS.substring(3, 5));

            tSalida = (hora * 60 + min);

            tiempo = tSalida - tIngreso;

            if (tSalida > tIngreso){
                opc = 1;
            }else {opc = 0;}
            
            
        }while (hora < 6 || hora > 23 || min < 0 || min > 59 || opc == 0);

        System.out.println("tiempo transcurrido: " + (tiempo/60)+" horas, " + (tiempo%60)+ " minutos" );

        if (tipoVehiculo == 1){
            cobro = tiempo * 100;
        } else if (tipoVehiculo == 2) {
            cobro = tiempo * 60;
            if (cobro%100 >= 50){
                cobro = cobro + (100-(cobro%100));
            }else {
                cobro = cobro - (cobro%100);
            }
        }
        System.out.println("Total a pagar: " + cobro);

        do {
            System.out.println("Ingrese el pago");
            pago = entrada.nextDouble();
        } while (pago < cobro);
        cambio = pago - cobro;
        System.out.println("Valor a devolver es: $" + cambio);
        b50 = cambio / 50000;
        resto = cambio % 50000;
        b20 = resto / 20000;
        resto = resto % 20000;
        b10 = resto / 10000;
        resto = resto % 10000;
        b5 = resto / 5000;
        resto = resto % 5000;
        b2 = resto / 2000;
        resto = resto % 2000;
        m1 = resto / 1000;
        resto = resto % 1000;
        m500 = resto / 500;
        resto = resto % 500;
        m200 = resto / 200;
        resto = resto % 200;
        m100 = resto / 100;
        resto = resto % 100;
        System.out.println("Su cambio es: ");
        System.out.println(b50 + " billetes de $50.000");
        System.out.println(b20 + " billetes de $20.000");
        System.out.println(b10 + " billetes de $10.000");
        System.out.println(b5 + " billetes de $5.000");
        System.out.println(b2 + " billetes de $2.000");
        System.out.println(m1 + " monedas de $1.000");
        System.out.println(m500 + " monedas de $500");
        System.out.println(m200 + " monedas de $200");
        System.out.println(m100 + " monedas de $100");

    }
}