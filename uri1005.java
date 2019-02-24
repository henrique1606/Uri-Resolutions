import java.util.Scanner;
import java.text.DecimalFormat;

public class uri1005
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00000");
        
        double grad1, grad2, media;
        
        grad1 = scan.nextDouble();
        grad2 = scan.nextDouble();
        
        media = ((3.5 *grad1) + (7.5*grad2))/11;
        
        if ((grad1 <= 10) && (grad2 <= 10))
        {
            System.out.println( "MEDIA = " + df.format(media));
        }
        
    }
}