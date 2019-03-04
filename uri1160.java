import java.util.Scanner;

public class uri1160
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int numTeste, popA, popB,anos;
        double cresA,cresB;
    
        numTeste = scan.nextInt();
        
        
        for (int i = 0; i < numTeste; i++)
        {
            popA = scan.nextInt();
            popB = scan.nextInt();
            cresA = scan.nextDouble();
            cresB = scan.nextDouble();
            anos = 101;
            
            for (int j = 0; j < 100; j++)
            {
                 
                    popA = (int)((popA*((cresA/100.00) + 1)));
                    popB = (int)((popB*((cresB/100.00) + 1)));
                
                
                if (popA > popB) // tentativa de popA > popB até 100, acima disso anos = 101
                {
                    anos = (j + 1); // o máximo que pode chegar é 100
                    
                    break; 
                }
                
            }
            
            if(anos <= 100)
                {
                  System.out.println(anos + " anos.");
                }else{
                  System.out.println("Mais de 1 seculo.");
                }
         
            
        }
        
        
    }
}