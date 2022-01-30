/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evaparcial1b;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class EvaParcial1B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        // Declaración e inicialización de variables
        
        String nombre;
        int tipo_cli, cant_libros;
        double costo_libro, desc, descTotal, subtotal, total; 
        
        tipo_cli = 0; cant_libros = 0; costo_libro = 0; desc = 0; descTotal = 0; subtotal = 0; total = 0;
        
        // Datos de entrada
        
        System.out.println("Ingrese el nombre del cliente: ");
        nombre = leer.next();
        
        System.out.println("Ingrese el tipo de cliente: ");
        tipo_cli = leer.nextInt();
        
        System.out.println("Ingrese la cantidad de libros: ");
        cant_libros = leer.nextInt();
        
        System.out.println("Ingrese el costo del libro: ");
        costo_libro = leer.nextDouble();
        
        // Proceso
        
        // COndición para determinar el descuento por tipo de cliente
        if (tipo_cli == 1) {
            desc = 0.30;
        }
        else {
            if (tipo_cli == 2) {
                desc = 0.20;
            }
            else {
                if (tipo_cli == 3) {
                    desc = 0;
                }
            }
        }
        
        //Condición para determinar el descuento por cantidad de libros
        
        if ((cant_libros > 5) && (cant_libros <= 10)) {
            desc = desc + 0.04;
        }
        else {
            if (cant_libros > 10) {
                desc = desc + 0.08;
            }
        }
        
        // Obtener el subtotal y el valor neto a pagar
        subtotal = cant_libros * costo_libro;
        descTotal = (subtotal * desc);
        total = subtotal - descTotal;
        
        // Presentar los datos de salida 
        System.out.println("Nombre del cliente: " +nombre);
        System.out.println("Total a pagar: " +subtotal +" dólares");
        System.out.println("Descuento: " +descTotal +" dólares");
        System.out.println("Neto a pagar: " +total +" dólares");
    }
}
