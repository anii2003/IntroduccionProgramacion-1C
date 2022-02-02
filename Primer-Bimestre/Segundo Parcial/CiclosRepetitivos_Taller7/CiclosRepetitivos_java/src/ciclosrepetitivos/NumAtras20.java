/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclosrepetitivos;
/**
 *
 * @author DELL
 */
public class NumAtras20 {
    public static void main(String[] args) {
        // Declaración e inicialización de las variables
        
        int i = 320;
        int n = 160;
        
        // Proceso
        
        System.out.println("**Serie del 320 al 160 (descendente) de 20 en 20***");
        while (i >= n) {
            System.out.println(i);
            i = i - 20;
        }
    }    
}
