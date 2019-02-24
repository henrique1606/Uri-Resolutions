import java.util.Scanner;

public class uri1046
{
    public static void main (String[] args)
    {
      Scanner scan = new Scanner(System.in);
      int hr1, hr2, tim, timMod;
      
      hr1 = scan.nextInt();
      hr2 = scan.nextInt();
      tim = 0;
     
      if ((hr1 < hr2))
      {
          tim = hr1-hr2; 
          tim = Math.abs(tim);
          System.out.println("O JOGO DUROU " + tim + " HORA(S)");
          
      }
      else if ((hr1 > hr2))
      {
          tim = ((24 - hr1)+ hr2);
          System.out.println("O JOGO DUROU " + tim + " HORA(S)");
      }
      
      else if ((hr1 == hr2))
      {
         tim = 24;
         System.out.println("O JOGO DUROU " + tim + " HORA(S)");
      }
      
      
      
    }
        
}