import java.util.Scanner;

public class uri1071
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int x,y,impar,proxy,proxx;
        
        x = scan.nextInt();
        y = scan.nextInt();
        
        impar = 0;
        
        if  (x > y)
        {
            for (proxy = y + 1; proxy < x; proxy++)
            {
                if (proxy%2 != 0)
                {
                    impar = impar + proxy;
                }
            }
            
             System.out.println(impar);
        }
         
         
         else if (y > x)
        {
            for (proxx = x + 1 ; proxx < y; proxx++)
            {
                if (proxx%2 != 0)
                {
                    impar = impar + proxx;
                }
            }
             System.out.println(impar);
        }  
        
        else {
                
                System.out.println("0");
            }
    
        
    }
}
