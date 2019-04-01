import java.util.Scanner;

public class uri1173
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);
        
        int vet[] = new int[10];
        int i = 0;
        
        vet[0] = scan.nextInt();
        System.out.println("N[0] = "+ vet[0]);
        
        for(i = 1; i < 10; i++)
        {
            vet[i] = (vet[i - 1] * 2);
            
            System.out.println("N["+i+"] = "+ vet[i]);
        }
    }
}