package e01;

import java.util.Scanner;

public class Nove {

	/*
	 * REQUIRES: num > 0
	 * EFFECTS: Stampa su stdout tutte e sole le possibili terne di interi positivi A, B e C 
	 * 			ciascuno minore di num per cui A x B è diverso da C, ma la prova del nove funziona
	 */
	private static void provaDelNove(int num) {
		for(int i=1; i<num; i++) 
			for(int j=1; j<num; j++)
				for(int k=1; k<num; k++) 
					if( (((i%9)*(j%9))%9 == k%9) && (i*j != k) ) System.out.println(i +" "+ j +" "+ k);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		provaDelNove(scanner.nextInt());
		scanner.close();
	}

}
