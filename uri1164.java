import java.util.Scanner;

public class uri1164
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int casos,num,i,soma;
        i = 0;
        casos = scan.nextInt();
        
        while(i < casos)
        {
            num = scan.nextInt();
            soma = 0;
            
            for(int j = 1; j <= num/2; j++)
            {
                
                if ((num % j) == 0)
                {
                    soma = (soma + j);
                }
            }
            
            if (soma == num)
            {
                System.out.println(num + " eh perfeito");
            } else {
                System.out.println(num + " nao eh perfeito");
            }
            
            i++;
        }
    }
}