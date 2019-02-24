import java.util.Scanner;
public class uri1035
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
         int a, b, c, d, som1, som2 ;
         
         a = scan.nextInt();
         b = scan.nextInt();
         c = scan.nextInt();
         d = scan.nextInt();
         
         som1 = a + b;
         som2 = c + d;
    
       if ((b > c) && (d > a) && (som2 > som1) && (c > 0) && (d > 0)&& (a > 0))
        {
             System.out.println ("Valores aceitos");
         }
         else
         {
             System.out.println ("Valores nao aceitos");
         }
            
        
        
    }
}