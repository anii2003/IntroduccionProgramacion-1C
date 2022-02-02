/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evabimestralip;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // TODO code application logic here
        
        int comb, i, n, comb1;
        comb = 2525; i = 1; n = 4; comb1 = 0;
        
        do{
            System.out.print("Por favor ingrese una combinación: ");
            comb1 = leer.nextInt();
            
            if (comb1 == 2525){
                System.out.println("La caja se ha abierto satisfactoriamente");
                
            }
            else {
                System.out.println("Lo siento, no es correcto");
            }
            i = i + 1;

            if ((i > n) && (comb != comb1)) {
                System.out.println("La caja se bloqueó");
            }
        
        }while((i <= n) && (comb != comb1));
       
    }    
}

