import java.util.Scanner;

public class uri1134
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int num,alc,gaso,dies;
        
        num = 0;
        alc = 0;
        gaso = 0;
        dies = 0;
        
        while (num != 4)
        {
            num = scan.nextInt();
            
            if (num == 1)
            {
                alc++;
            }
            else if (num == 2)
            {
                gaso++;
            }
            else if (num == 3)
            {
                dies++;
            }
        }
        
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alc);
        System.out.println("Gasolina: " + gaso);
        System.out.println("Diesel: " + dies);
    }
}