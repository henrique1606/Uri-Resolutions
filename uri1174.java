import java.util.Scanner;

public class uri1174
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);
        
        double vet[] = new double[100];
        
        for(int i = 0; i < 100; i++)
        {
            vet[i] = scan.nextDouble();
            
            if(vet[i] <= 10)
            {
                System.out.printf("A["+i+"] = %.1f\n", vet[i]);
            }
        }
        
    }
}