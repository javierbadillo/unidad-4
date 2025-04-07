/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package monedas;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Monedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double pesos, resultado;
    int opcion;
    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingresa la cantidad en pesos mexicanos: ");
    pesos = teclado.nextDouble();
    System.out.println("Elige la moneda a convertir:");
    System.out.println("1. Dolar (USD)");
    System.out.println("2. Euro (EUR)");
    System.out.println("3. Bath (THB)");
    System.out.println("4. Yen (JPY)");
    System.out.println("5. Won (KRW)");
    System.out.println("6. Dolar Australiano (AUD)");
    System.out.println("7. Sol Peruano (PEN)");
    System.out.println("8. Dolar Canadiense (CAD)");
    System.out.println("9. Bolivar (VES)");
    System.out.println("10. Peso Argentino (ARS)");
    opcion = teclado.nextInt();
    switch (opcion) {
    case 1:
    resultado = pesos / 17.0; 
    System.out.println("Son " + resultado + " dolares (USD).");
    break;    
    case 2:
    resultado = pesos / 18.5;
    System.out.println("Son " + resultado + " euros (EUR).");
    break;
    case 3:
    resultado = pesos * 2.1;
    System.out.println("Son " + resultado + " baths (THB).");
    break;
    case 4:
    resultado = pesos * 8.7;
    System.out.println("Son " + resultado + " yenes (JPY).");
    break;
    case 5:
    resultado = pesos * 78.2;
    System.out.println("Son " + resultado + " wons (KRW).");
    break;
    case 6:
    resultado = pesos / 11.3;
    System.out.println("Son " + resultado + " dolares australianos (AUD).");
    break;
    case 7:
    resultado = pesos / 4.5;
    System.out.println("Son " + resultado + " soles (PEN).");
    break;
    case 8:
    resultado = pesos / 12.6;
    System.out.println("Son " + resultado + " dolares canadienses (CAD).");
    break;
    case 9:
    resultado = pesos * 2.35;
    System.out.println("Son " + resultado + " bolivares (VES).");
    break;
    case 10:
    resultado = pesos * 47.3;
    System.out.println("Son " + resultado + " pesos argentinos (ARS).");
    break;
    default:
    System.out.println("Opcion no válida. Elige un numero del 1 al 10.");
    break;
    }

    }
    
}
