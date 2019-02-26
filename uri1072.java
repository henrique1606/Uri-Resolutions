import java.util.Scanner;

public class uri1072
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int valor,qnt,in, out;
        
        qnt = scan.nextInt();
        valor = 0; 
        in = 0;
        out = 0;
        
        if (qnt < 10000)
        {
             for (int i = 0; i < qnt; i++)
             {
                 valor = scan.nextInt();
                
                 if ((valor >= 10) && (valor <= 20))
                 {
                     in++;
                 }
                 else {
                     out++;
                 }
             }
        }
         
         System.out.println(in + " in");
         System.out.println(out + " out");
    }
}