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
public class Lab5 {
    public static void main(String[] args) {
        ArrayList<String> dias = new ArrayList<String>();
        
        dias.add("Lunes");
        dias.add("Martes");
        dias.add("Miércoles");
        dias.add("Jueves");
        dias.add("Viernes");
        dias.add("Sábado");
        dias.add("Domingo");
        
        System.out.println("Tamaño Lista Dias: "+dias.size());
        
        System.out.println("\nDias de la semana");
        
        for (String dia: dias) {
            System.out.println(dia);
        }
        
        System.out.println("\n");
        
        // Buscar y obtener un elemento de la lista
        
        if (dias.contains("Friday")) {
            System.out.println("Es el quinto día del mes");
        }
        
        else{
            System.out.println("No existe el elemento en la lista");
        }
        
        // Remover o eliminar un elemento de la lista
        
        dias.remove("Martes");
        
        System.out.println("\nLista días después de remover --Martes");
        
        for (String dia: dias) {
            System.out.println(dia);
        }
        
        // Determinar cuál es el tamaño de la lista
        System.out.println("Tamaño Lista Dias: "+dias.size()+" elementos");

        dias.remove(5);
        
        System.out.println("\nLista días después de remover el elemento en la posición 5--");
        
        for (String dia: dias) {
            System.out.println(dia);
        }
        
        // Determinar cuál es el tamaño de la lista
        System.out.println("Tamaño Lista Dias: "+dias.size()+" elementos");
        
        // Modificar la lista
        
        System.out.println("Modificar el elemento de la posición 3");
        dias.set(3, "Friday");
        
        for (String dia: dias) {
            System.out.println(dia);
        }

        // Agregar un elemento a la lista
        System.out.println("\n");
        System.out.println("Agregar un elemento en la posición 1");
        dias.add(1, "Martes");
        
        for (String dia: dias) {
            System.out.println(dia);
        }

        System.out.println("Tamaño Lista Dias: "+dias.size()+" elementos");        
    }
}
