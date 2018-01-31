
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
         Operacion opera = new Operacion();
         
        File archivo = new File ("C:\\Users\\jose\\Desktop\\DISEÑO\\TRABAJOS\\UVG\\3er Semestre\\Estructura de Datos\\HT2\\HT2Estructuras\\HT2Estructuras\\src\\ht2estructuras\\Fuente.txt");
        
        /**File archivo = new File ("C:\\Users\\Mafer\\Documents\\GitHub\\HT2Estructuras\\HT2Estructuras\\src\\ht2estructuras\\Fuente.txt");
        
        */
        FileReader fr = new FileReader (archivo);
        BufferedReader br = new BufferedReader(fr);
        
        while ( (linea = br.readLine()) != null)
        {      
            opera.operar(linea);
            System.out.println(opera.operar(linea));
        }
        
        
        
    }
    
}
