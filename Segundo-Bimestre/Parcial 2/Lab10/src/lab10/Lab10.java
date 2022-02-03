/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab10;

/**
 *
 * @author DELL
 */
public class Lab10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Generar números randómicos aleatorios
        
        System.out.println("Generación de 10 números aleatorios entre 0 y 1\n");
        
        for (int i=1; i<=10; i++) {
            System.out.println(Math.random());
        }

        System.out.println("\nGeneración de 10 números aleatorios entre 0 y 10\n");
        
        for (int i=1; i<=10; i++) {
            System.out.println(Math.random()*10);
        }

        System.out.println("\nGeneración de 10 números aleatorios entre 0 y 10 ENTEROS\n");
        
        for (int i=1; i<=10; i++) {
            System.out.println((int)(Math.random()*10));
        }

        System.out.println("\nGeneración de 10 números aleatorios entre 0 y 50 ENTEROS\n");
        
        for (int i=1; i<=10; i++) {
            int numR = (int)(Math.random()*50+1); // Se coloca +1 para que se generen números mayores a 0, es decir desde 1 hasta 50.
            System.out.println(numR);
        }         
    }    
}
