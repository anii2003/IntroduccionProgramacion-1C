/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;
import java.util.ArrayList;
/**
 *
 * @author DELL
 */
public class Lab4 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();
        
        // Número de elementos de la lista
        System.out.println("La lista tiene: "+nombres.size()+" elementos");
        
        // Agregar elementos a la lista
        nombres.add("Anita");
        nombres.add("Kevin");
        nombres.add("Edgar");
        nombres.add("Diego");
        nombres.add("David");
        nombres.add("Bryan");
        nombres.add("Justin");
        
        System.out.println("La lista tiene: "+nombres.size()+" elementos");
        
        // Retorno el elemento dentro de la lista
        
        System.out.println("Elemento en la posición 0 "+nombres.get(0));
        
        System.out.println("Elemento en la posición 4 "+nombres.get(4));
        
        System.out.println("\nLos elementos de la lista son: ");
        
        for(int i=0; i<nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }
        
        System.out.println("\n");
        
        System.out.println("Lo elementos de la lista sin: (for simplificado)");
        
        for(String name: nombres) {
            System.out.println(name);
        }        
    }
}
