/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclosrepetitivos;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Pow {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        // Declaración e inicialización
        
        int base, pot, result;
        int i;
        
        base = 0; pot = 0; result = 1; i = 1;
        
        // Ingrese los datos
        
        System.out.print("Ingrese la base: ");
        base = leer.nextInt();
        
        System.out.print("Ingrese la potencia: ");
        pot = leer.nextInt();
        
        // Proceso
        
        while (i <= pot){
            result = result * base;
            i = i + 1;
        } 
        System.out.println("La potencia de " +base +" es "+result);
        
    }  
}
