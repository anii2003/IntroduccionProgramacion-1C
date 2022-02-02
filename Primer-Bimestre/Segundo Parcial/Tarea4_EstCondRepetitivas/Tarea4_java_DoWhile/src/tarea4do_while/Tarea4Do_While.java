/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea4do_while;

/**
 *
 * @author DELL
 */
public class Tarea4Do_While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        // Declarar e inicializar las variables
        int i, n;
        i = 2; n = 100;
        
        // Proceso
        System.out.println("Programa que da salida números pares del 2 al 100");
        while (i <= n) {
            System.out.println(i +" es número par");
            i = i + 2;
        }
    }
    
}
