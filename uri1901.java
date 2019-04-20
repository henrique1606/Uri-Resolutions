import java.util.Scanner;

public class uri1901{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int tamanho = scan.nextInt(), i, j, aux = 0, linha, coluna, especie[] = new int[tamanho*2];
        int floresta[][] = new int[tamanho][tamanho], quant = 0, esp = 0;
        
        for(i = 0; i < tamanho; i++){
            for(j = 0; j < tamanho; j++){
                
                floresta[i][j] = scan.nextInt();
            }
        }
        
        for(i = 0; i < (tamanho*2); i++){
            linha = scan.nextInt();
            coluna = scan.nextInt();
            especie[i] = floresta[linha - 1][coluna - 1];
        }
        
        for(i = 0; i < (tamanho*2); i++){
            
            for(j = 0;j < (tamanho*2);j++){
                
                if(especie[i] < especie[j]){
                    aux = especie[i];
                    especie[i] = especie[j];
                    especie[j] = aux;
                }
            }
        }
        for(i = 0; i < (tamanho*2); i++){
            if(i < ((tamanho*2) - 2))
            { if(especie[i] != especie[i + 1]){
                esp++;
            }
            } else if (i == ((tamanho*2) - 2)){
                if(especie[i] != especie[i + 1]){
                    esp = esp + 2;
                    
                } else if (especie[i] == especie[i + 1]){
                    
                    esp++;
                }   
            }  
        }
        System.out.println(esp);
    }
}    
    