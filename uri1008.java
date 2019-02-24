import java.text.DecimalFormat;
import java.util.Scanner;

public class uri1008
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        int func, qnthr;
        
        func = scan.nextInt();
        qnthr = scan.nextInt();
        
        double hrtrab = scan.nextDouble(), salary;
        
        salary = (qnthr * hrtrab);
        
        System.out.println("NUMBER = " + func);
        System.out.println("SALARY = U$ " + df.format(salary));
    }
}