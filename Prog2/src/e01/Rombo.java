package e01;

import java.util.Scanner;

public class Rombo {

	private static void printFilledV(int n) {
		for(int i = 1; i<n; i++) {
			for(int j = 0; j<n*2-1 ; j++)
				System.out.print((j>=i && j<=(n*2-2)-i)?'*':' ');
			System.out.println();
		}
		
	}
	
	private static void printInvertedFilledV(int n) {
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n*2-1 ; j++)
				System.out.print((j>=n-i-1 && j<=n+i-1)?'*':' ');
			System.out.println();
		}
	}
	
	private static void printRombo(int n) {
		printInvertedFilledV(n);
		printFilledV(n);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		printRombo(scanner.nextInt());
		scanner.close();
	}

}
