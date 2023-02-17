package test;

import java.util.Scanner;

public class L2 {

	public static void main(String[] args) {

		int n = 3;
		int size = n * 2 - 1;

		int f = 0;
		int b = size - 1;
		int a[][] = new int[size][size];

		while (n != 0) {

			for (int i = f; i <= b; i++) {

				for (int j = f; j <= b; j++) {
					a[i][j] = n;
				}

			}
			f++;
			n--;
			b--;

		}
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}
}
