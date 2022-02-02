/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea4do_while;

/**
 *
 * @author DELL
 */
public class Ejercicio22_literalA {
    public static void main(String[] args) {
        // Declarar e inicializar las variables
        int i,j;
        i = 1; j = 1;
        // Proceso
        while (i <= 5) {
            System.out.println(i);
            while (j < 1){
                System.out.println(j);
                j=j-2;
            }
            i = i + 1;
            
        }
    }
}
