import java.util.Scanner;
public class uri1019
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int total, hr, min, seg;
        
        total = scan.nextInt();
        
        hr = total/3600;
        min = (total -(hr * 3600))/60;
        seg = total - (hr * 3600) - (min * 60);
        
        System.out.println (hr + ":" + min + ":" + seg);
    
    
    
    
    }
    
}