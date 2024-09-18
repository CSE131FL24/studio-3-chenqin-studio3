package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("n: ");
		int n = in.nextInt();
		int[] arr = new int[n];
		for (i = 0; i < n; i++) {
			arr[i] = i + 1;
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 2 * i; j < n; j = j + i) {
				arr[j] = 0;
			}
		}
		
		
	}

}
