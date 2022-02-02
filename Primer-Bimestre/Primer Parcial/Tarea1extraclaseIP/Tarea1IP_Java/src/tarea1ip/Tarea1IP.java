/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea1ip;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Tarea1IP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        double tiempo_llamada;
        double costomin_llamada;
        double costo_total;
        String nombre;
        
        //Ingrese los datos
        
        System.out.println("***Programa para calcular el costo total de una llamada según su duración***");
        System.out.println("Ingrese el nombre de usuario: ");
        nombre = leer.next();
        
        //Ingrese la información requerida
        
        System.out.println("Ingrese el tiempo de duración de la llamada: ");
        tiempo_llamada = leer.nextDouble();
        
        System.out.println("Ingrese el costo por minuto de una llamada: ");
        costomin_llamada = leer.nextDouble();
        
        //Proceso
        
        costo_total = tiempo_llamada * costomin_llamada;
        
        System.out.println("El costo total de la llamada es: \n" +costo_total + "\n");
        
                            
                
    }
    
}
