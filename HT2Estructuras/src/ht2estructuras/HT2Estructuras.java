/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ht2estructuras;

import java.io.*;


/**
 *
 * @author jose
 */
public class HT2Estructuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException 
    {
         String linea;
        File archivo = new File ("C:\\Users\\jose\\Desktop\\DISEÑO\\TRABAJOS\\UVG"
                + "\\3er Semestre\\Estructura de Datos\\HT\\HT2Estructuras\\"
                + "HT2Estructuras\\src\\ht2estructuras\\Fuente.txt");
        FileReader fr = new FileReader (archivo);
        BufferedReader br = new BufferedReader(fr);
        while ( (linea = br.readLine()) != null){
        
        
        System.out.println(linea);
        }
        
        /**
        for (int x=0;x<linea.length();x++)
        System.out.println(linea.charAt(x));
        */
        
        
    }
    
}
