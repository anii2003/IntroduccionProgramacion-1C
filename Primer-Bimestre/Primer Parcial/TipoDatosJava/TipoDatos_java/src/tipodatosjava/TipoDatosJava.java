/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tipodatosjava;

/**
 *
 * @author DELL
 */
public class TipoDatosJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
        //TODO code application logic here
        
        System.out.println("***Programa de datos, operadores y expresiones Java ***");
        System.out.println("Introducción a la Programación");
        System.out.println("Ana Carolina Churo Briceño");
        System.out.println("----");
        
        // Tipos, operadores y expresiones - Int
        
        int num1 = 8;
        int num2 = 4; 
        int num3 = num1 + num2;
        System.out.println("El valor de la variable entera num3 es: " +num3);
        
        //Tipos, operadores y expresiones - Double
        
        System.out.println("-----");
        double dec1 = 1.5;
        double dec2 = 8.63;
        double dec3 = dec1 * dec2;
        System.out.println("El valor de la variable decimal dec3 es = " +dec3);
        
        //Tipos, operadores y expresiones - Char
        
        System.out.println("-----");
        char letra1 = 'A';
        char letra2 = 'C';
        System.out.println("Los carácteres son: " +letra1 +letra2);
        
        String nombre, apellido, domicilio, teléfono;
        
        //Inicializar los String
        nombre = "Ana Carolina";
        apellido = " Churo Briceño";
        domicilio = "Loja";
        teléfono = "072111304";
        
        System.out.println("**Presentar variables string**");
        System.out.println("Mi nombre es: " +nombre);
        System.out.println("Mi apellido es: " +apellido);
        System.out.println("Vivo en: " +domicilio);
        System.out.println("y mi teléfono de casa es: " +teléfono);
        System.out.println("\n");
        System.out.println("Me llamo " +nombre+"" +apellido+ 
                ", vivo en " +domicilio+ ", y mi teléfono de casa es " +teléfono+"\n");
        
        System.out.println("**Presentar en una sola línea *** \n");
        
        System.out.print("Me llamo " +nombre+"" +apellido+ 
                ", vivo en " +domicilio+ ", y mi teléfono de casa es "+teléfono+"\n");
        
        System.out.println("**Presentar concatenar variables de tipo string*** \n");
        
        System.out.println("Me llamo ".concat(nombre).concat(apellido)
                .concat(" y vivo en ").concat(domicilio)
                .concat(" y mi teléfono es ")
                .concat (teléfono));
        
                      
                
       
        
        
        
        
        
            
        
            
        
        
        //
        
                
        
        
    }
    
}
