import java.util.Scanner;

public class uri1154
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        double idade,qntidade,somaidade,mediaidade;
        
        idade = scan.nextDouble();
        qntidade = 0;
        somaidade = 0;
        
        while (idade > 0)
        {
            qntidade++;
            somaidade = (somaidade + idade);
            idade = scan.nextDouble();
        }
        
        mediaidade = somaidade/qntidade;
        
        System.out.printf("%.2f%n",mediaidade);
    }
}