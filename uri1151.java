import java.util.Scanner;

public class uri1151
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int seq = scan.nextInt();
        int num = 0, num2 = 1, num3;
        
        System.out.print(num + " " + num2 );
        
        for(int i = 2; i < seq; i++)
        {
           num3 = (num + num2);
           
           System.out.print(" " + num3);
           
           
           num = num2;
           num2 = num3;
        }   
        
        System.out.print("\n");
           
    }   
}