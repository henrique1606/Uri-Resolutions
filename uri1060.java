import java.util.Scanner;

public class uri1060
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double numero = 0;
        int c = 0;
        
        for (int i = 0;  i < 6; i++)
        {
             numero = scan.nextDouble();
             
             if (numero > 0)
            {
              c++;
            }
            
            
        }
        
        System.out.println(c + " valores positivos");
           
            
        
        
    }
}
