import java.util.Scanner;

public class uri1153
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        
        int num = scan.nextInt();
        int numfib = 1;
        
        while (num >= 1)
        
        {
            numfib = (num * numfib);
            num--;
        }
        
        System.out.println(numfib);
        
    }
}
