import java.util.Scanner;

public class uri1114
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int tent = scan.nextInt();
        
        while (tent != 2002)
        {
             System.out.println("Senha Invalida");
             tent = scan.nextInt();
            
        }
        System.out.println("Acesso Permitido");
        
    }
}