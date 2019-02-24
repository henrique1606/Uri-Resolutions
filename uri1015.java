import java.util.Scanner;
import java.text.DecimalFormat;

public class uri1015
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0000");
        
        double x1,y1,x2,y2,distancia,suby, subx;
        
        x1 = scan.nextDouble();
        y1 = scan.nextDouble();
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();
        
        suby = y2-y1;
        subx = x2-x1;
        
        distancia = Math.sqrt((Math.pow(subx,2)) + (Math.pow(suby,2)));
        
        System.out.println(df.format(distancia));
        
        
        
    }
}