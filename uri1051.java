import java.util.Scanner;
import java.text.DecimalFormat;

public class uri1051
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        float salario,salariotaxa,salariotaxa1,salariotaxa2,taxamin,taxamed,taxamax,taxatotal;
        
        salario = scan.nextFloat();
        
        taxamin = 0;
        taxamed = 0;
        taxamax = 0;
        taxatotal = 0;
        salariotaxa = 0;
        salariotaxa1 = 0;
        salariotaxa2 = 0;
        
        if (salario <= 2000.00)
        {
            System.out.println("Isento");
            
        }
        
        else{  
            
            if ((salario > 2000) && (salario <= 3000))
            {
        
            
            salariotaxa = salario - 2000;
            taxamin = ((8 * salariotaxa)/100);
            taxatotal = taxamin;
            
            }
        else if ((salario > 3000) && (salario <= 4500))
        {
            salariotaxa = salario - 2000;
            salariotaxa1 = salariotaxa - 1000;
            
            salariotaxa -= salariotaxa1;
            
            taxamin = ((8 * salariotaxa)/100);
            taxamed = ((18 * salariotaxa1)/100);
            
            taxatotal = taxamin + taxamed;
            
            
        }
        else 
        {
            salariotaxa = salario - 2000;
            salariotaxa1 = salariotaxa - 1000;
            salariotaxa2 = salariotaxa1 - 1500;
            
            salariotaxa -= salariotaxa1;
            salariotaxa1 -= salariotaxa2;
            
            taxamin = ((8 * salariotaxa)/100);
            taxamed = ((18 * salariotaxa1)/100);
            taxamax = ((28 * salariotaxa2)/100);
            
            taxatotal = taxamed + taxamin + taxamax;
           
        }
        
        System.out.println("R$ " + df.format(taxatotal));
        
        }
       
        
    }

}