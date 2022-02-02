/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] mat = {
            {4, 7, 10, -1},
            {9, 12, 24, 30},
            {10, 8, 6, 1}
        };
        
        for (int i=0;i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                
                System.out.print(mat[i][j]+"  ");
            }
            System.out.println("");
        }
    }       
}
