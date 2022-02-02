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
public class CiclosRepetitivos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        
        // Declarar e inicializar las variables
        int i, n, suma;
        i = 1; n = 1; suma = 0;
        
        // Ingresar el límite del ciclo
        System.out.print("Ingrese el límite del ciclo: ");
        n = leer.nextInt();
        
        // Proceso
        while (i <= n){
            suma = suma  + i;
            System.out.println(i);
            i = i + 1;
            
        }
        System.out.println("i es: " +i);
        System.out.println("La suma es: "+suma+"\n");
        
        i = n; suma = 0;
        
        while (i >= 1) {
            System.out.println("suma: " +suma);            
            suma = suma + i;
            System.out.println(i);
            i = i - 1;           
        }
        System.out.println("i es: " +i);
        System.out.println("La suma es: "+suma);         
    }
}
