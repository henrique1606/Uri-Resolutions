import java.util.Scanner;

public class uri1743
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);
        
        int entrada1,entrada2,entrada3,entrada4,entrada5;
        
        entrada1 = scan.nextInt();
        entrada2 = scan.nextInt();
        entrada3 = scan.nextInt();
        entrada4 = scan.nextInt();
        entrada5 = scan.nextInt();
        
       int entrada_1,entrada_2,entrada_3,entrada_4,entrada_5;
       
        entrada_1 = scan.nextInt();
        entrada_2 = scan.nextInt();
        entrada_3 = scan.nextInt();
        entrada_4 = scan.nextInt();
        entrada_5 = scan.nextInt();
        
        if ((entrada1 != entrada_1) && (entrada2 != entrada_2) && (entrada3 != entrada_3) && (entrada4 != entrada_4) && (entrada5 != entrada_5))
        {
            System.out.println ("Y");
        } else {
            
            System.out.println ("N");
         
        } 
        
        
    }
}