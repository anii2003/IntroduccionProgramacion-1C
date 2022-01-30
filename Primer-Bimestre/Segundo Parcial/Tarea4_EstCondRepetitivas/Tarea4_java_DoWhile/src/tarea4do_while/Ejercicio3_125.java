/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea4do_while;

/**
 *
 * @author DELL
 */
public class Ejercicio3_125 {
    public static void main(String[] args) {
        // Declarar e inicializar las variables
        int suma, i;
        suma = 0; i = 1;
        
        // Proceso
        System.out.println("***Suma de los múltiplos de 3 o 5***");
        while (i <= 999) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                suma = suma + i;
            }
            i = i + 1;
        }
        System.out.println("Respuesta: "+suma);
    }      
}
