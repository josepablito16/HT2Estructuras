
package ht2estructuras;

/**
 *
 * @author Mafer
 */
public class Operacion implements Calculadora {
    Stack<Double> x = new StackArrayList<Double>();
    
    @Override
    public double operar(String expresion) {
        

        for(int i=0;i<expresion.length()-2;i++){
            try{
               double d1 = (char) expresion.charAt(i);    
               x.push(d1);
           }catch(Exception e){
               switch (expresion.charAt(i)) {
                    case '+':
                       double d2 =  x.pop()+x.pop();
                       x.push(d2);
            
                       break;
                    case '-':
                         
                         break;
                    case '*':
                         
                         break;
                    case '/':
                         
                         break;
                    default:
                         System.out.println("error" );
                         break;
                    }
            }
            }
        return x.pop();
       }
    }
    

