/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evaluacionconletras;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Evaluacionconletras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int calificacion;
        // 90-100 A, 80-89 B, 70-79 C, 60-69 C, -60 f
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa tu calificacion: ");
        calificacion = teclado.nextInt();
        if(calificacion >=90 && calificacion <=100){
         System.out.println("A: ");
        }else if(calificacion >=80 && calificacion <=89){
        System.out.println("B; ");
        }else if (calificacion >=70 && calificacion <=79){
        System.out.println("C ");
        }else if(calificacion <=60){
                System.out.print("F: ");
    }
        
               
    }
    
}
