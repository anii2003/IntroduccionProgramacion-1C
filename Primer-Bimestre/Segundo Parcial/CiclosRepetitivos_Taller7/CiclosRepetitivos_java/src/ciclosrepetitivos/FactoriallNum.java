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
public class FactoriallNum {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        // Declarar e inicializar las variables        
        int num, fact, i;
        num = 0; fact = 1; i = 1;
        
        // Ingrese los datos
        System.out.println("***Obtener el factorial de un número***");
        System.out.print("Ingrese el número para obtener su factorial: ");
        num = leer.nextInt();
        
        while (i <= num) {
            if (num > 0) {
                fact = fact * i;
                i = i + 1;
            }
            else {
                System.out.println("El factorial no aplica a números negativos");
            }
        }
        System.out.println("El factorial de "+num+" es: "+fact);
    }   
    
    
}
