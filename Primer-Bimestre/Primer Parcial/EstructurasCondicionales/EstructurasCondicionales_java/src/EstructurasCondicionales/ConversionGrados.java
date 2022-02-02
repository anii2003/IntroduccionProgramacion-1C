/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EstructurasCondicionales;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class ConversionGrados {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        //declaración e inicialización de las variables
        double gC, gF, gK;
        gC = 0; gF = 0; gK = 0;
        
        //Entrada de los datos
        System.out.println("Estructuras lógicas condicionales simples");
        System.out.println("Programa para conversión de grados\n");
        
        System.out.print("Ingrese los grados centígrados: ");
        gC = leer.nextDouble();
        
        if (gC > 0){
            
            gF = (9/5)*(gC + 32);
            gK = gC + 273.15;  
            System.out.println("La equivalencia en grados F es: " +gF);
            System.out.println("La equivalencia en grados K es: " +gK);       
        }
        else{
            System.out.println("Los grados ingresados son negativos"
                    + " no se puede realizar la conversión");
        }

    }
}
