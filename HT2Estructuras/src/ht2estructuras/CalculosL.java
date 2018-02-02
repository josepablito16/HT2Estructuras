
/**
 *
 * @author Ana Lucía Hernández 17138. Luis Delgado 17187.
 */


package ht2estructuras;

public class CalculosL implements Calculadora{
    private StackArrayList<Double> sv;
    
    public CalculosL()
    {
        sv = new StackArrayList<>();
    }
    @Override
    public double operar(String expresion)
    {
        String[] expresionSeparada=expresion.split(" ");
        int longitud=expresionSeparada.length;
        for (int i=0; i<longitud;i++)
        {
            try
            {
                sv.push(Double.parseDouble(expresionSeparada[i]));
            }
            catch(Exception e)
            {
                if(expresionSeparada[i].equals("+"))
                {
                    if (sv.size()>1)
                    {
                        double num2=sv.pop();
                        double num1=sv.pop();
                        double resultante = num1+num2;
                        sv.push(resultante);
                    }
                    else
                    {
                        return Double.NaN;
                    }
                }
                else if(expresionSeparada[i].equals("*"))
                {
                    if (sv.size()>1)
                    {
                        double num2=sv.pop();
                        double num1=sv.pop();
                        double resultante = num1*num2;
                        sv.push(resultante);
                    }
                    else
                    {
                        return Double.NaN;
                    }
                }
                else if(expresionSeparada[i].equals("-"))
                {
                    if (sv.size()>1)
                    {
                        double num2=sv.pop();
                        double num1=sv.pop();
                        double resultante = num1-num2;
                        sv.push(resultante);
                    }
                    else
                    {
                        return Double.NaN;
                    }
                }
                else if(expresionSeparada[i].equals("/"))
                {
                    if (sv.size()>1)
                    {
                        double num2=sv.pop();
                        double num1=sv.pop();
                        double resultante = num1/num2;
                        sv.push(resultante);
                    }
                    else
                    {
                        return Double.NaN;
                    }
                }
            }
        }
        if (sv.size()>1)
        {
            return Double.NaN;
        }
        else
        {
            return sv.pop();
        }
    }
}

