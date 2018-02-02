/*
 * Calculadora.java
 * 30/01/2018
 * Andrea Arguello 17801
 */
package ht2estructuras;

import ht2estructuras.StackArrayList;
import static java.lang.Double.NaN;
import java.util.ArrayList;


/**
 *
 * @author Andrea Arguello 17801
 */
public class CalculosA implements Calculadora{
    
    protected ArrayList data;
    StackArrayList<Double> stack;
    
    public CalculosA()
    {
        data=new ArrayList<String>();
        stack = new StackArrayList<Double>();
    }
    
    public double operar(String expresion){
        
        String[] nospace=expresion.split("\\s+");
        for(int i=0; i<nospace.length; i++){
            if((nospace[i].equals("+") || nospace[i].equals("-") || nospace[i].equals("/") || nospace[i].equals("*")) && (nospace[i+1].equals("-") || nospace[i].equals("+") || nospace[i].equals("/") || nospace[i].equals("*"))){
                return Double.NaN;
            }
            else{
                    data.add(nospace[i]);
                    }
        
        }
        for(int j=0; j<nospace.length; j++)//recorre la expresion y agrega los numeros al stack hasta encontrarse un simbolo
        {
            if(data.get(j).equals("+"))//Realiza la suma de los elementos del stack si encuentra un +
            {
                
                double sumando=stack.pop();
                sumando=sumando+stack.pop();
                
                stack.push(sumando);
            }
            else if(data.get(j).equals("*"))//Realiza la multiplicacion de los elementos del stack si encuentra un *
            {
                double multiplicando=stack.pop();
                multiplicando= multiplicando*stack.pop();
                stack.push(multiplicando);
            }
            else if(data.get(j).equals("-"))//Realiza la resta de los elementos del stack si encuentra un -
            {
                double restando=0;
                restando -= stack.peek();
                stack.pop();
                restando+= stack.peek();
                stack.pop();
                
                stack.push(restando);
            }
            else if(data.get(j).equals("/"))//Realiza la division de los elementos del stack si encuentra un *
            {
                if(stack.peek()==0)//si el denominador es 0, devuelve NaN
                    {
                        stack.pop();
                        stack.pop();
                        stack.push(NaN);
                        break;
                    }
                else{
                    //si el denominador no es 0, lo divide por el primer elemento del stack
                    
                        double denominador=stack.pop();
                        double numerador = stack.pop();
                        stack.push(numerador/denominador);
                    
                }
            }
            else //si el indice del array no retorna uno de los valores, agrega un numero al stack
                {
                stack.push(Double.parseDouble((String) data.get(j)));
                }
        }
        double respuesta=stack.peek();
        stack.empty();
        data.clear();
         return respuesta;   //devuelve la respuesta
    }
    
    

    
}
