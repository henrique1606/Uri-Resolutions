import java.util.Scanner;
 public class uri1044
 
 {
     public static void main (String[] args)
     {
         Scanner scan = new Scanner(System.in);
         
         int num1, num2;
         
         num1 = scan.nextInt();
         num2 = scan.nextInt();
         
        if ((num2%num1 == 0)||(num1%num2 == 0))
        {
            System.out.println ("Sao Multiplos");
        } 
        else
        {
            System.out.println ("Nao sao Multiplos" );
            
        }
        
         
     }
 }