import java.util.Scanner;

public class uri1132
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int vlr1,vlr2,soma;
        
        vlr1 = scan.nextInt();
        vlr2 = scan.nextInt();
        soma = 0;
        
        if (vlr1 > vlr2)
        {
          for (int i = vlr2; i <= vlr1; i++)
          {
              if (i%13 != 0)
              {
                  soma = soma + i;
              }
          }
          
          System.out.println(soma);
        }
        
        
        
        else if (vlr2 > vlr1)
        {
          for (int i = vlr1; i <= vlr2; i++)
          {
               if (i%13 != 0)
              {
                  soma = soma + i;
              }
            
          }
          
          System.out.println(soma);
        }
        
    }
}