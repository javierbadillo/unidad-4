/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadorabasica;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Calculadorabasica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int opcion;
        double num1, num2, resultado;
        String continuar = "si";  
        Scanner teclado = new Scanner(System.in);        
        do {
            System.out.println("Selecciona una operacion:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Ingresa tu opcion: ");
            opcion = teclado.nextInt();           
            if (opcion == 5) {
                System.out.println("Gracias por usar la calculadora. ¡Hasta luego!");
                break;
            }          
            System.out.print("Ingresa el primer numero: ");
            num1 = teclado.nextDouble();
            System.out.print("Ingresa el segundo numero: ");
            num2 = teclado.nextDouble();         
            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Error: No se puede dividir entre cero.");
                    }
                    break;
                default:
                    System.out.println("Opcion invalida. Intenta de nuevo.");
                    continue;
            }         
            System.out.print("¿Deseas realizar otra operacion? (si/no): ");
            continuar = teclado.next();          
        } while (continuar.equalsIgnoreCase("si"));       
        teclado.close();
    }
    
}
