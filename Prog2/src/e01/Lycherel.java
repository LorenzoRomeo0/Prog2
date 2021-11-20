package e01;

import java.util.Scanner;

public class Lycherel {

	/*
	 * REQUIRES: num > 0
	 * EFFECTS: restituisce il numero ribaltato. reverse(1234) -> return = 4321
	 */
	private static long reverse(long num) {
		long reverse=0;
		int i = 0;
		do{
			reverse = reverse*(i*10)+num%10;
			num/=10;
			i = 1;
		}while(((int)num) > 0);
		return reverse;
	}
	
	/*
	 * REQUIRES: num > 0
	 * EFFECTS: restituisce true se il numero è palindromo, false altrimenti.
	 */
	private static boolean isPalindrome(long num) {
		return num == reverse(num);
	}
	
	/*
	 * REQUIRES: num deve essere un numero di Lycherel
	 * EFFECTS: restituisce la sequenza di numeri che si ottiene sommando il numero con il suo inverso.
	 * 			La procedura termina quando si raggiunge un numero palindormo.
	 */
	private static void lycherel(long num) {
		System.out.println(num);
		while(!isPalindrome(num)) {
			num += reverse(num);
			System.out.println(num);
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		lycherel(scanner.nextLong());
		scanner.close();
	}
}
