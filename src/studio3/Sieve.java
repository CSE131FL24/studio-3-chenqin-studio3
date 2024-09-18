package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("n: ");
		int n = in.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}

		for (int i = 1; i < n; i++) {
			if (arr[i] != 0) {
				for (int j = i + arr[i]; j < n; j = j + arr[i]) {
					arr[j] = 0;
					}
				}
			}

		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				System.out.print(arr[i] + " ");
			}
		}



		}

}
