import java.util.Scanner;

public class uri1041
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        float x,y;
        
        x = scan.nextFloat();
        y = scan.nextFloat();
        
        if ((x == y) && (x == 0))
        {
            System.out.println("Origem");
        }
        else if ((y > 0) && (x == 0) || (y < 0) && (x == 0))
        {
            System.out.println("Eixo Y");
        }
        else if ((x > 0) && (y == 0) || (x < 0) && (y == 0))
        {
            System.out.println("Eixo X");
        }
        else if ((x > 0) && (y > 0))
        {
            System.out.println("Q1");
        }
        else if ((x > 0) && (y < 0))
        {
            System.out.println("Q4");
        }
        else if ((x < 0) && (y > 0))
        {
            System.out.println("Q2");
        }
        else if ((x < 0) && (y < 0))
        {
            System.out.println("Q3");
        }
    }
}