package e01;

import java.util.Scanner;

public class Kaprekar {

	/*
	 * REQUIRES: n deve avere essattamente 4 cifre
	 * EFFECTS:	Restituisce un array di interi tale che ogni sua posizione contenga,
	 * 			in ordine inverso, le cifre di n. es 1423 -> [3,2,4,1]
	 */
	public static int[] toArray(int n) {
		int[] res = new int[4];
		for(int i=0; i<4; i++) {
			res[i] = n%10;
			n/=10;
		}
		return res;
	}
	
	/*
	 * REQUIRES: arr.length() == 4 and arr != null
	 * EFFECTS:	restituisce un intero avente per cifre, le cifre, in ordine inverso, contenute nell'array.
	 * 			es: [3,2,4,1] -> 1423
	 */
	public static int toInt(int[] arr) {
		int res=1;
		for(int i=0; i<4; i++) {
			res = res*(10* ((i>0)?1:0) ) +arr[i];
		}
		return res;
	}
	
	/*
	 * REQUIRES: i>0 && i<arr.length() && j>0 && j<arr.length() && arr != null
	 * MODIFIES: modifica arr, scambiando i valori nelle posizioni i e j
	 */
	public static void scambia(int[] arr, int i, int j) {
		int comodo = arr[i];
		arr[i]=arr[j];
		arr[j]=comodo;
	}
	
	/*
	 * REQUIRES: n deve avere essattamente 4 cifre
	 * EFFECTS:	Restituisce un numero formato dalle cifre di n ordinate in ordine decrescente.
	 * 			es 1423 -> 4321
	 */
	public static int sortDesc(int n) {
		int[] arr = toArray(n);
		if(arr[0]<arr[1]) scambia(arr, 0, 1);
		if(arr[2]<arr[3]) scambia(arr, 2, 3);
		if(arr[0]<arr[2]) scambia(arr, 0, 2);
		if(arr[1]<arr[3]) scambia(arr, 1, 3);
		if(arr[1]<arr[2]) scambia(arr, 1, 2);
		return toInt(arr);
	}
	
	/*
	 * REQUIRES: n deve avere essattamente 4 cifre
	 * EFFECTS:	Restituisce un numero formato dalle cifre di n ordinate in ordine crescente.
	 * 			es 1423 -> 1234
	 */
	public static int sortAsc(int n) {
		return reverse(sortDesc(n));
	}
	
	/*
	 * REQUIRES: num > 0
	 * EFFECTS: restituisce il numero ribaltato. 1234 -> 4321
	 */
	private static int reverse(int num) {
		int reverse=0;
		int i = 0;
		do{
			reverse = reverse*(i*10)+num%10;
			num/=10;
			i = 1;
		}while(((int)num) > 0);
		return reverse;
	}
	
	/*
	 * REQUIRES: num deve avere esattamente 4 cifre
	 * EFFECTS: Emette in stdout  la sequenza di numeri che si ottengono 
	 * 			a partire da num (compreso) con la trasformazione qui descritta 
	 * 			fino alla costante di Kaprekar (inclusa), uno per linea.
	 */
	private static void kaprekar(int num) {
		while(sortDesc(num)-sortAsc(num) != num) {
			System.out.println(num);
			num = sortDesc(num)-sortAsc(num);
		}
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		kaprekar(scanner.nextInt());
		scanner.close();
	}

}
