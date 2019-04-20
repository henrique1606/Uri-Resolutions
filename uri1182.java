import java.util.Scanner;

public class uri1182{
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double matriz[][] = new double [12][12], soma = 0, media = 0;
        int c = scan.nextInt(), i, j;
        String operacao = scan.next();
        char op = operacao.charAt(0);
        
        for(i = 0; i < 12; i++){
            
            for(j = 0; j < 12; j++){
                
                matriz[i][j] = scan.nextInt();
            }
        }
        
        for(i = 0; i < 12; i++){
            
            soma = soma + matriz[i][c];
        }
        
        if(op == 'S'){
            
            System.out.printf( "%.2f", soma);
            
        } else if(op == 'M'){
            
            media =(soma / 12.0);
            System.out.printf( "%.2f", media);
        }
        
    }
}