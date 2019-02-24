import java.util.Scanner;
public class uri1036
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double a,b,c,delta,x1,x2;
        
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        
        
        delta = (Math.pow(b,2) - (4*a*c));
        x1 = (-b + Math.sqrt(delta))/(2*a);
        x2 = (-b - Math.sqrt(delta))/(2*a);
        
        if ((a != 0) && (delta > 0))
        {
            System.out.printf("R1 = " + "%.5f%n", x1);
            System.out.printf("R2 = " + "%.5f%n", x2);
        }
        else{
            
           System.out.println("Impossivel calcular");
        }
        
        
    }
}