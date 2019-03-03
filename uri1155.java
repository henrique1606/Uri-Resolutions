import java.util.Scanner;

public class uri1155
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        float S = 0;
        
        for(float j = 1; j <= 100; j++)
        {
          S = S + (1/j);
        }
        
        System.out.printf("%.2f\n", S);
        
    }
}