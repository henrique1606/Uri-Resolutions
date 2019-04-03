package uri1177;
import java.util.Scanner;

public class uri1177 {

	public static void main(String[] args) {
		
	  Scanner s = new Scanner(System.in);
	  
	  int vet[] = new int[1000];
	  int T = s.nextInt(), j = 0;
	  
	  for(int i = 0;i < 1000; i++) {
		  
		  vet[i] = j;
		  j++;
		  System.out.println("N["+i+"] = " + vet[i]);
		  
		  if(j == (T)) {
			  
			  j = 0;
		  }
		  
		  s.close();
		  
	  }
		  

	}

}
