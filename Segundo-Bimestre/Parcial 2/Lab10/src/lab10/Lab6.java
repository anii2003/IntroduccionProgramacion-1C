/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;

/*import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;*/

import java.io.*;

/**
 *
 * @author DELL
 */
public class Lab6 {
    public static void main(String[] args) {
        // Ruta absoluta
        try{
            String ruta = "filename.txt";
            String contenido = "Archivo de prueba";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write(contenido);
            bw.close();
        }
        
        catch(Exception e){
            e.printStackTrace();
        }
        
        // Ruta relativa
        try{
            String ruta = "C:\\Users\\DELL\\OneDrive\\Escritorio\\Uni\\Fundamentos Computacionales\\Actividades\\Parcial 1_2B\\ArchivodePrueba\\filenames1.txt";
            String contenido = "Archivo de prueba 1";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write(contenido);
            bw.close();
        }
        
        catch(Exception b){
            b.printStackTrace();
        }        
        
    }
}
