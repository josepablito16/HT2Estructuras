
package ht2estructuras;

import java.io.*;
import static java.lang.Double.NaN;
import static java.lang.Double.isNaN;


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
         CalculosL opera = new CalculosL();
         
        /**File archivo = new File ("C:\\Users\\jose\\Desktop\\DISEÑO\\TRABAJOS\\UVG\\3er Semestre\\Estructura de Datos\\HT2\\HT2Estructuras\\HT2Estructuras\\src\\ht2estructuras\\Fuente.txt");
        */
        
        File archivo = new File ("C:\\Users\\Mafer\\Documents\\GitHub\\HT2Estructuras\\HT2Estructuras\\src\\ht2estructuras\\Fuente.txt");
        
        
        FileReader fr = new FileReader (archivo);
        BufferedReader br = new BufferedReader(fr);
        
        while ( (linea = br.readLine()) != null)
        {      
            opera.operar(linea);
            if(Double.isNaN(opera.operar(linea))){
                System.out.println("No se pudo realizar la operación");
                
            } else {
                System.out.println(opera.operar(linea));
            }
            
         
        }
        
        
        
    }
    
}
