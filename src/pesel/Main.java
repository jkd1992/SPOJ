package pesel;

import java.io.Console;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		short sumacal = 0;
		short suma = 0;
		
		int[] tablicapesel = new int[11];
		int[] wskaznik = {1,3,7,9,1,3,7,9,1,3,1};
		Scanner inS = new Scanner(System.in);
		
		System.out.println("Podaj liczbê pakietów");
		
		String liczbaPakietow = inS.nextLine();
		int liczba = Integer.parseInt(liczbaPakietow);
		while(liczba<100 && liczba>0) {

		
		System.out.println("Wpisz PESEL: ");
		
			for (byte z = 0; z < liczba; z++) 
				
			{
				
		String dane = inS.nextLine();
		
		
		
		String tmpDataArray[] = dane.split("");
		
		
		
		
			for (byte i = 0; i < tablicapesel.length; i++) {
			
				tablicapesel[i]= Integer.parseInt(tmpDataArray[i]);
			}	
			
			
			for (byte i = 0; i < wskaznik.length; i++) {
				
				 suma =(short)(tablicapesel[i]*wskaznik[i]);
				 sumacal +=suma;
				
			}
			System.out.println(sumacal);
			
			if(sumacal%10==0) {
				System.out.println("D");
			}else {
				System.out.println("N");
			}
			
			}
		}
		System.out.println("B³¹d");
		
	}
		
		

		
		
		
		
		
		
	}


