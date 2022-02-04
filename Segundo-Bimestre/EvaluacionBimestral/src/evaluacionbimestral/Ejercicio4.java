/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacionbimestral;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();
        
        nombres.add("Edgar");
        nombres.add("Kevin");
        nombres.add("Justin");
        nombres.add("Bryan");
        nombres.add("Diego");
        nombres.add("David");
               
        System.out.println("\n***LA LISTA DE ALUMNOS ES:***");
        
        for (String names: nombres) {
            System.out.println(names);
        }
        
        System.out.println("\n");
        System.out.println("Tamaño Lista Nombres: "+nombres.size());        
        
        System.out.println("");
        System.out.println("-----------------------------------------------------"); 
        
        // Agregar 4 nombres más a la lista
        System.out.println("\n");
        System.out.println("***Agregar cuatro elementos en la posición 6, 7, 8 y 9***\n");
        nombres.add(6, "Deybi");
        nombres.add(7, "Carolina");
        nombres.add(8, "Alex");
        nombres.add(9, "Sofía");
        
        for (String names: nombres) {
            System.out.println(names);
        }

        System.out.println("\n");
        System.out.println("Tamaño Lista Nombres: "+nombres.size()+" elementos");         
        
        // Eliminar el primer y último elemento de la lista

        nombres.remove(0);
        nombres.remove(nombres.size()-1);
        
        System.out.println("");
        System.out.println("----------------------------------------");           
        
        System.out.println("\n***Lista nombres después de remover el primer y último elemento***\n");
        
        for (String names: nombres) {
            System.out.println(names);
        }
        
        System.out.println("\n");
        // Determinar cuál es el tamaño de la lista
        System.out.println("Tamaño Lista Nombres: "+nombres.size()+" elementos");
        
        System.out.println("");
        
        // Modificar la lista
        
        System.out.println("");
        System.out.println("----------------------------------------");         
        
        System.out.println("***Modificar el elemento de la posición 5***");
        nombres.set(5, "Ana");
        
        for (String names: nombres) {
            System.out.println(names);
        }
        
        System.out.println("\n");       
        System.out.println("Tamaño Lista Nombres: "+nombres.size()+" elementos");
        System.out.println("");
        System.out.println("----------------------------------------");        
    }        
}
