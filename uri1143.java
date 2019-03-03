import java.util.Scanner;

public class uri1143
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int qntvezes, i,quad,cub,num;
        
        i = 0;
        qntvezes = scan.nextInt();
        num = 0;
        quad = 0;
        cub = 0;
        
        while(i < qntvezes)
        
        {
             num = (i + 1);
             quad = (num * num);
             cub = (num * num * num);
             
            System.out.println(num + " " + quad + " " + cub);
            
            i++;
            
        }
    }
}