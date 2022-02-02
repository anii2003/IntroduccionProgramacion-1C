/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ip.taller2;

/**
 *
 * @author DELL
 */
public class InOut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nombre = "Ana";
        int edad = 18;
        double estatura = 1.57;
        String empresa = "UTPL";
        
        System.out.println("Mi nombre es: " +nombre);
        System.out.println("La edad es: " +edad);
        System.out.println("La estatura es: " +estatura);
        System.out.println("Estudia en: " +empresa);
        
        System.out.println("-- System.out.print --");
        
        System.out.print("Mi nombre es: " +nombre);
        System.out.print(" La edad es: " +edad);
        System.out.print(" La estatura es: " +estatura);
        System.out.print(" Estudia en: " +empresa);
        System.out.println("");
                
        System.out.println("--System.out.printf --");
        
        System.out.printf("Mi nombre es: %s, tengo %d, mido %f"
                + " y estudio en la %s", 
                nombre, 
                edad, 
                estatura,
                empresa);
        System.out.println("");      
    }
}
