
package ht2estructuras;

/**
 *
 * @author Mafer
 */
public class Operacion implements Calculadora {
    Stack<Double> x = new StackArrayList<Double>();
    double d2;
    
    @Override
    public double operar(String expresion) 
    {       
       
        for(int i=0;i<expresion.length();i++)
        {
            
            try
            {
               
               double d1 =  Double.parseDouble(Character.toString(expresion.charAt(i)));    
               x.push(d1);
                
           }catch(Exception e)
           {
               switch (expresion.charAt(i)) 
               {
                    case '+':
                        System.out.println("si entre");
                       d2 =  x.pop()+x.pop();
                       x.push(d2);            
                       break;
                       
                   case '-':
                        System.out.println("si entre");
                       d2 =  x.pop()-x.pop();
                       x.push(d2);            
                       break;    
                       
                    case '*':
                        System.out.println("si entre");
                       d2 =  x.pop()*x.pop();
                       x.push(d2);            
                       break;   
                    
                       
                    case '/':
                        System.out.println("si entre");
                       d2 =  x.pop()/x.pop();
                       x.push(d2);            
                       break;    
                }
            }
            }
        return x.pop();
       }
    }
    

