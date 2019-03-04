import java.util.Scanner;

public class uri1087
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);
        
        int x1,y1,x2,y2; // x (linhas) e y (colunas)
        
        // y são numerados da esquerda para a direita de 1 a 8
        // x de cima para baixo de 1 a 8
        
        x1 = scan.nextInt();
        y1 = scan.nextInt();
        x2 = scan.nextInt();
        y2 = scan.nextInt();
        
        while ((x1 != 0) && (y1 != 0) && (x2 != 0) && (y2 != 0))
        {
            if ((x1 == x2) && (y1 == y2))
            {
                System.out.println("0");
            
            } else if ((x1 == x2) && (y1 != y2)){
            
                System.out.println("1");
            
            } else if ((y1 == y2) && (x1 != x2)){
            
                System.out.println("1");
            
            } else if ((Math.abs(x2 - x1)) == (Math.abs(y2 - y1))){
            
                System.out.println("1");
            
            } else {
            
                System.out.println("2");
            }
            
             x1 = scan.nextInt();
             y1 = scan.nextInt();
             x2 = scan.nextInt();
             y2 = scan.nextInt();
        }
        
    }
}