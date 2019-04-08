package uri1175;
import java.util.Scanner;

public class uri1175 {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int vet[] = new int[20], aux, i, j;
		
		for(i = 0; i < 20; i++)
		{
			vet[i] = scan.nextInt();
		}
		
		
		for(i = 0, j = 1; i < 10; i++, j++) {
			
			aux = vet[i];
			vet[i] = vet[20 - j];
			vet[20 - j] = aux;
		}
		
		for(i = 0; i < 20; i++)
		{
			System.out.println("N["+i+"] = "+ vet[i]);
		}	
		scan.close();
	}
}
