/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadenclase;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Calificación {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        // Declarar e inicializar variables
        int i, n;
        double nota;
        
        i = 1; n = 100; nota = 0;
        
        
        // Proceso
        
        System.out.println("Programa que ingresa calificaciones hasta que se ingrese una nota mayor a 100 o menor a 0");
        
        do{
            System.out.print("Ingrese una calificación: ");
            nota = leer.nextDouble();
            
            
            if((nota <= n) && (nota>=0)) {
                System.out.println(nota);
                i = i + 1;
            }
            
            else {
                System.out.println("Calificación inválida, por favor vuelva a ingresar");
                
            }
            
        }while ((nota <= n) && (nota >= 0));
    }
}
