import java.util.Scanner;

 public class uri1045
 {
     public static void main(String[] args)
     {
         Scanner scan = new Scanner(System.in);
         
         
         double a,b,c;
         
         a = scan.nextDouble();
         b = scan.nextDouble();
         c = scan.nextDouble();
         
         double ladmaior = Math.max(a, Math.max(b,c));
         double ladmedio, ladmenor;
         
         ladmenor=0;
         ladmedio=0;
         
         if (ladmaior == a)
         {
             ladmenor = Math.min(b,c);
             ladmedio = Math.max(b,c);
         }
         if (ladmaior == b)
         {
             ladmenor = Math.min(a,c);
             ladmedio = Math.max(a,c);
         }
         if (ladmaior == c)
         {
             ladmenor = Math.min(b,a);
             ladmedio = Math.max(b,a);
         }
         
        
        if ((a>0)&&(b>0)&&(c>0)) 
        {
         if (ladmaior >= ladmenor + ladmedio){
         
             System.out.println("NAO FORMA TRIANGULO");
         
         }else if (Math.pow(ladmaior,2) > (Math.pow(ladmedio,2) + Math.pow(ladmenor,2)))
         {
             System.out.println("TRIANGULO OBTUSANGULO");
         }
         
         
         if (Math.pow(ladmaior,2) == (Math.pow(ladmedio,2) + Math.pow(ladmenor,2)))
         {
             System.out.println("TRIANGULO RETANGULO");
         }

         
         
         if (Math.pow(ladmaior,2) < (Math.pow(ladmedio,2) + Math.pow(ladmenor,2)))
         {
             System.out.println("TRIANGULO ACUTANGULO");
         }
         
         
         if ((ladmaior == ladmedio) && (ladmaior == ladmenor))
         {
             System.out.println("TRIANGULO EQUILATERO");
         }
         
         if (((ladmaior == ladmedio) && (ladmedio != ladmenor)) || ((ladmaior == ladmenor) && (ladmedio != ladmenor)) || ((ladmedio == ladmenor) && (ladmaior != ladmenor)))
         {
             System.out.println("TRIANGULO ISOSCELES");
         }
        
        }
        
     }
 }