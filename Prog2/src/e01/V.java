package e01;

import java.util.Scanner;

public class V {

	/*
	 * REQUIRES: n > 0
	 * EFFECTS: Stampa in stdout una V che occupi N righe, ossia composta da 2 * N - 1 asterischi.
	 */
	private static void printV(int n) {
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n*2-1 ; j++)
				System.out.print((i==j || j==(n*2-2)-i)?'*':' ');
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		printV(scanner.nextInt());
		scanner.close();
	}

}
