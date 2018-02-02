
package ht2estructuras;

/**
 *
 * @author Mafer
 */
public class Operacion implements Calculadora {
    Stack<Double> x = new StackArrayList<Double>();
    double d2;
    double d3 = Double.NaN;
    
    @Override
    public double operar(String expresion) 
    {       
       if(expresion.length()<=3){
           x.push(Double.NaN);
       }else{
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
              
                       d2 =  x.pop()+x.pop();
                       x.push(d2);            
                       break;
                       
                   case '-':
                       
                       d2 =  x.pop()-x.pop();
                       x.push(d2);            
                       break;    
                       
                    case '*':
                        
                       d2 =  x.pop()*x.pop();
                       x.push(d2);            
                       break;   
                    
                       
                    case '/':
                        
                       d2 =  x.pop()/x.pop();
                       x.push(d2);            
                       break;    
                }
            }
            }
        
       }
        return x.pop();
       }
    }
    

