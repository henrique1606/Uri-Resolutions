import java.util.Scanner;

public class uri1165
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int numcasos,num,k;
        
        numcasos = scan.nextInt();
        num = 0;
        k = 0;
        
        while (k < numcasos)
        {
            num = scan.nextInt();
            boolean numprim = true;
            
                for (int j = 2; j < num; j++)
                {
                    if (num % j == 0)
                    {
                         numprim = false;
                    }    
                
                }
                
            
            if (numprim){
                System.out.println(num + " eh primo");
            }else {
                System.out.println(num + " nao eh primo");
            }
            
            k++;
            
        }
    }
}