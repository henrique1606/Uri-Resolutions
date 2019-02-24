import java.util.Scanner;
import java.text.DecimalFormat;

 public class uri1009
 {
     public static void main(String[] args)
     {
         Scanner scan = new Scanner(System.in);
         
         DecimalFormat df = new DecimalFormat("0.00");  
         
         double sala, sale, finSala;
         String name; 
         
         name = scan.next();
         sala = scan.nextDouble();
         sale = scan.nextDouble();
         
         finSala = sala + (0.15*sale);
         
         System.out.println("TOTAL = R$ " + df.format(finSala));
         
     }
 }