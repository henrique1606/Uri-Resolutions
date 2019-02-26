import java.util.Scanner;

public class uri1080
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int num1,num,pos,maior;
        
        num1 = scan.nextInt();
        maior = num1;
        pos = 1;
               
      if (num1 > 0)
        {
          for (int i = 0; i < 99; i++)
           {  
              num = scan.nextInt();
            
               if (maior < num)
               {
                 maior = num;
                 pos = i + 2;
               }
            }
         
        }
         
         System.out.println(maior);
         System.out.println(pos);
        
    }
}