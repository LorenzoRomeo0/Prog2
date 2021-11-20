package t04;

import java.util.ArrayList;

public class Main {
	private static ArrayList<Integer> primes = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		if(args.length!=2) return;
		int num = Integer.parseInt(args[1]);
		ArrayList<ArrayList<Integer>> scomposizioni = new ArrayList<ArrayList<Integer>>();
		
		for(int i=2; i<=num; i++) 
			scomposizioni.add(scomposizione(i));
		
		printList(scomposizioni);
	}
	
	private static void printList(ArrayList<ArrayList<Integer>> list) {
		int index = 2;
		for(ArrayList<Integer> scomp_num : list) {
			System.out.println(index++ + " => "+ scomp_num.toString());
		}
	}
	
	private static ArrayList<Integer> scomposizione(int num){
		ArrayList<Integer> scomposizione = new ArrayList<Integer>();
		int i = 2;
		while(i<=num) {
			if(isPrime(i) && num%i == 0) {
				scomposizione.add(i);
				num/=i;
			}else i++;
		}
		return scomposizione;
	}
	
	private static boolean isPrime(int number) {
		if(primes.size()==0) primes.add(2);
		if(primes.contains(number)) return true;
		for(int i : primes) 
			if(number%i == 0) return false;
		primes.add(number);
		return true;
	}

}
