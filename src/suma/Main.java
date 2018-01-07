package suma;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int suma =0;
		int liczba[] = new int[10];
		
		Random losowa = new Random();
/*		Scanner skaner = new Scanner(System.in);
		
		int losowanie = losowa.nextInt(100+100+1)-100;
		*/
		
		
		
		for (int i = 0; i < 10; i++) {
			int losowanie = losowa.nextInt(100+100+1)-100;
			liczba[i] = losowanie;
			suma +=liczba[i];
			
			System.out.println(liczba[i]);
			System.out.println("Suma liczb "+suma);
		}
		
		
	
	}

}
