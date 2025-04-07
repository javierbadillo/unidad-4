/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package informacion;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Informacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
    int opcion;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Elige una opcion para obtener informacion:");
        System.out.println("1. Taylor Swift");
        System.out.println("2. Avengers: Endgame");
        System.out.println("3. Stranger Things");
        System.out.println("4. Bad Bunny");
        System.out.println("5. El Chavo del 8");

        opcion = teclado.nextInt();

        switch(opcion){
            case 1:
                System.out.println("Taylor Swift es una cantante, compositora y actriz estadounidense ganadora de multiples premios Grammy.");
                break;
            case 2:
                System.out.println("Avengers: Endgame es una pelicula de Marvel Studios estrenada en 2019 y es una de las mas taquilleras de la historia.");
                break;
            case 3:
                System.out.println("Stranger Things es una serie de ciencia ficcion producida por Netflix ambientada en los anos 80.");
                break;
            case 4:
                System.out.println("Bad Bunny es un cantante puertorriqueno de musica urbana conocido por su estilo unico y colaboraciones internacionales.");
                break;
            case 5:
                System.out.println("El Chavo del 8 es una famosa serie de comedia mexicana creada por Roberto Gomez Bolanos.");
                break;
            default:
                System.out.println("Opcion no valida. Elige un numero del 1 al 5.");
                break;
    }
        
    }
}
