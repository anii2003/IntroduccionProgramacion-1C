/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclosrepetitivos;
/**
 *
 * @author DELL
 */
public class Mult5 {
    public static void main(String[] args) {        
        // Declarar  e inicializar las variables
        int i, n, mult, num, num1;
        i = 1; n = 100; mult = 0; num = 0; num1 = 0;
        
        System.out.println("***Programa para conocer los múltiplos de 5***");
        
        for (i=1; i <= n; i++){
            num = num + 1;
            if (num % 5 == 0) {
                System.out.println("El número "+num+" es múltiplo de 5");
            }
        }
        System.out.println(n);
        System.out.println("***Usando do-while***");
        i = 1; num1 = 0; 
        
        do {
            num1 = num1 +1;
            if (num1%5==0) {
                System.out.println("El número "+num1+" es múltiplo de 5");
                
            }
            i = i +1;
        } while ( i <= n);
        System.out.println(n);
    }
}
   
