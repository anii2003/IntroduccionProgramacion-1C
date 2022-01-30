/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad9.exceptions;

/**
 *
 * @author DELL
 */
public class Unidad9Exceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            int nota1 = 9;
            int nota2 = 0;
            int notaFinal = nota1/nota2;
            System.out.println("La nota final es: "+notaFinal);
    
        }
        
        catch(ArithmeticException ExpresionAritmetica) {
            System.out.println("Lo sentimos hay un error");
            System.out.println("de tipo "+ExpresionAritmetica);
        }
    }    
}
