import java.util.Scanner;

public class uri1146
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int quant;
        
        quant = scan.nextInt();
        
        while (quant != 0)
        {
                for (int i = 1; i <= quant; i++)
            
                {
                    if (i < quant)
                    {    System.out.print(i + " ");
                    
                    }else{
                        System.out.println(i);  
                    }
                    
                
                 }
            
             quant = scan.nextInt();
        }    
    }
}