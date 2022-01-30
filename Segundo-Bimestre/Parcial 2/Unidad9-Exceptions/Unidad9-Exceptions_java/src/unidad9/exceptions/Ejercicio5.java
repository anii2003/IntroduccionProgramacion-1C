/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad9.exceptions;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Ejercicio5 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        
        try{
            System.out.print("Ingrese el valor 1: ");
            int valor1 = leer.nextInt();
            System.out.print("Ingrese el valor 2: ");
            int valor2 = leer.nextInt();
            
            if ((valor1 < 0) || (valor2 < 0)) {
                throw new Exception("ERROR: no se permite ingresar números negativos");
            }
            
            if (valor1 > 20 ) {
                throw new Exception("ERROR: el primer valor no debe ser mayor a 20");
            }
            
            double result = valor1/valor2;
            
            System.out.println("El resultado es: "+result);
        }
        
        catch(Exception e){
            System.out.println("Ha ocurrido una excepción de tipo "+e);
        }
    }
}
