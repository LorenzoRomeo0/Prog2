package e01;

import java.util.Scanner;

public class Scacchiera {

	public static void stampaRiga(int n, char ch) {
		for(int i=0; i<8; i++) {
			for(int j=0; j<n;j++) 
				System.out.print(ch);
			ch = (ch=='#')?'-':'#';
		}
		System.out.println();
	}
	
	public static void scacchiera(int n) {
		char ch = '-';
		for(int i=0; i<8; i++) {
			for(int j=0; j<n; j++) 
				stampaRiga(n, ch);
			ch = (ch=='#')?'-':'#';
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scacchiera(scanner.nextInt());
		scanner.close();
	}

}
