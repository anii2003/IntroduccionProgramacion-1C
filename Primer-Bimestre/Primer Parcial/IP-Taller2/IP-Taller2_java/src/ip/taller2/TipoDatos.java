/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ip.taller2;

/**
 *
 * @author DELL
 */
public class TipoDatos {
    public static void main(String[] args) {
        
        //Deraclarando variables tipo entero
        int num1;
        num1 = 10;
        int num2;
        num2 = 13;
        
        //Declarar variables de tipo decimal
        double num3;
        num3 = 45.789;
        double num4 = 23.9;
        
        //Declarar variables de tipo char
        char encender ='S';
        encender = 'N';
        
        //Declarar variables de tipo cadena
        String cadena;
        cadena = "Ana Carolina";
        
        String apellido = "Churo Briceño";
        
        //Operadores aritméticos
        
        int suma;
        suma = 10 + 15;
        suma = num1 + num2;
        System.out.println(suma);
        
        System.out.println("La suma es:" +suma + " puntos");
    
        int suma1 = 14 + 34;
        
        System.out.println(suma1);
        
        double mult = 13 * 23;
        double mult1 = num1 * num2;
        
        System.out.println(mult1);
        
        double div = 34.5 / 12.4;
        double div1=num1/num2;
      
        System.out.println(div1);
        
        System.out.println("--Funciones Matemáticas--");
        System.out.println(Math.pow(2,4));
        System.out.println(Math.max(12,10));
        System.out.println(Math.min(45,1));
        
         //operadores condicionales
         System.out.println("-- Operadores condicionales --");
         int a = 34;
         int b = 7;
         
         System.out.println(a > b); //true
         System.out.println(a >= b); //true
         System.out.println(a < b); //false
         System.out.println(a <= b); //false
         System.out.println(a == b); //false
         System.out.println(a !=b); //true
         
         //operadores lógicos
         System.out.println("-- Operadores Lógicos --");
         System.out.println("--Conjunción -- AND --");
         System.out.println(true && true);//true
         System.out.println(true && false); //false
         System.out.println(false && false); //false
         
         System.out.println("--------------------------");
         System.out.println((a > b) && (a >= b)); // true
         System.out.println((a == b) && (b > a)); // false
         
         System.out.println("-- Disyunción -- OR --");
         System.out.println(true||true);//true
         System.out.println(true || false); //true
         System.out.println(false || false); // flase
         
         System.out.println("-- Negación --");
         System.out.println(!true); //false
         System.out.println(!false); //true           
    }
}
