package uri1332;
import java.util.Scanner;

public class uri1132 {
       
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numPalavra = scan.nextInt(), i;
		String palavra;
		
		for(i = 0; i < numPalavra;i++) {
			
			palavra = scan.next();
			
			if(palavra.length() == 5) {
				
				System.out.println("3");
				
			}else if ((palavra.charAt(0) == 't' && palavra.charAt(1) == 'w')) {
				
				System.out.println("2");
				
			} else if ((palavra.charAt(0) == 't' && palavra.charAt(2) == 'o')){
				
				System.out.println("2");
				
			} else if ((palavra.charAt(1) == 'w' && palavra.charAt(2) == 'o')) {
				
				System.out.println("2");
				
			} else {
				
				System.out.println("1");
				
			}
		}
		
		scan.close();
	}
}
