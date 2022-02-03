/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;

import java.io.*;
import java.io.FileNotFoundException;
/**
 *
 * @author DELL
 */
public class Lab7 {
    public static void main(String[] args) throws IOException {
        
        // Leer un archivo creado, a partir de su ruta (ruta relativa)
        
        try{
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\DELL\\OneDrive\\Escritorio\\Uni"
                    + "\\Fundamentos Computacionales\\Actividades\\Parcial 1_2B\\ArchivodePrueba\\texto.txt"));
            
            String linea = "";
            
            while(linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
            
            br.close();
        }
        catch(FileNotFoundException fnfe){ //no se encuentra el archivo
            System.out.println("No se encuentra el archivo");
        }
        
        catch(IOException ioe) { // error en la lectura del archivo
            System.out.println("No se puede leer el archivo");
        }
    }
}
