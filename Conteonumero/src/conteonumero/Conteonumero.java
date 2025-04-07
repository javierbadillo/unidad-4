/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conteonumero;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Conteonumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int cantidad, numero;
    int mayores = 0, menores = 0, iguales = 0;
    Scanner teclado = new Scanner(System.in);
    System.out.println("Cuantos numeros vas a ingresar: ");
    cantidad = teclado.nextInt();
    for (int i = 0; i < cantidad; i++) {
    System.out.println("Ingresa un numero: ");
    numero = teclado.nextInt();
    if (numero > 0) {
    mayores++;
    } else if (numero < 0) {
    menores++;
    } else {
    iguales++;
    }
    }
    System.out.println("Numeros mayores que 0: " + mayores);
    System.out.println("Numeros menores que 0: " + menores);
    System.out.println("Numeros iguales a 0: " + iguales);
    }
    
}
