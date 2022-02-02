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
public class SerieIndeterminada {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        // Declarar e inicializar las variables
        double num, suma, media;
        int i, n;
        
        num = 0; suma = 0; i = 1; n = 1000; media = 0;
        
        // Ingreso de datos
        
        System.out.println("Programa cuya suma de números no supere a mil");
        System.out.print("Ingrese un número: ");
        num = leer.nextInt();
        
        suma = num;
        
        while (suma < n) {
            System.out.print("Ingrese otro número: ");
            num = leer.nextInt();
            suma = suma + num;
            i = i + 1;
        }
               
        if(suma <= 1000) {
            System.out.println("La suma es: "+suma); 
            media = suma/i;
            System.out.println("Usted ingresó "+i+" números ");
            System.out.println("La media de "+suma+" es: "+media);        
        }
        
        else { 
            suma = suma - num;
            System.out.println("El resultado supera a 1000, la suma queda en: "+suma);
            if (suma <= n) {
                media = suma/(i-1);
                System.out.println("Usted ingresó "+i+" números ");
                System.out.println("La media de "+suma+" es: "+media);
            }               
        }
    }
}
