/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoradecalificacion;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Calculadoradecalificacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double parciales, proyecto, examenfinal, promediofinal;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa la calificacion del parcial (0-100): ");
        parciales = teclado.nextDouble();

        System.out.println("Ingresa la calificacion del proyecto: ");
        proyecto = teclado.nextDouble();

        System.out.println("Ingresa la calificacion de examen final: ");
        examenfinal = teclado.nextDouble();

        if (parciales >= 0 && parciales <= 100 && 
            proyecto >= 0 && proyecto <= 100 && 
            examenfinal >= 0 && examenfinal <= 100) {
            
            promediofinal = (parciales * 0.40) + (proyecto * 0.30) + (examenfinal * 0.30);
            System.out.println("Tu calificacion final es: " + promediofinal);
        }

        
    }
    
}
