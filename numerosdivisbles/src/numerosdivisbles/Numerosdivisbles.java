/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerosdivisbles;

/**
 *
 * @author javie
 */
public class Numerosdivisbles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         for (int i = 1; i <= 100; i++) {
         if (i % 3 == 0 && i % 5 == 0) {
         System.out.println(i);
         }
         }
    }
    
}
