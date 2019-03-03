import java.util.Scanner;

public class uri1157
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        
        for (int j = 1; j <= num; j++)
        {
            if ((num % j) == 0)
            {
                System.out.println(j);
            }
        }
    }
}