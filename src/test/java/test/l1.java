package test;

import java.util.Iterator;
import java.util.Scanner;

public class l1 {
	static int[] q = new int[4];
	static int s;

	static int w = 0;

	static private int[] input1(String input) {
		String split[] = input.split("[\\Q+-\\Ei]");
		char[] ch = input.toCharArray();

		for (int i = 1; i < input.length(); i++) {

			if (ch[i] == '+') {

				if (ch[0] == '-') { // (- +)

					s = Integer.parseInt(split[1]);
					q[0] = s * -1;
					q[1] = Integer.parseInt(split[2]);

				} else { // (+ +)
					q[0] = Integer.parseInt(split[0]);

					q[1] = Integer.parseInt(split[1]);

				}

			}

			if (ch[i] == '-') {

				if (ch[0] == '-') {
					s = Integer.parseInt(split[1]);
					q[0] = s * -1;
					s = Integer.parseInt(split[2]);
					q[1] = s * -1;

				} else {
					q[0] = Integer.parseInt(split[0]);

					s = Integer.parseInt(split[1]);
					q[1] = s * -1;

				}
				break;
			} 
			
		}
		return q;
	}

	static private void complux(int a, int b, int c, int d) {
		if (((a > 0) && (c > 0))||((a < 0) && (c < 0))) {

			int real = ((a * c) - (b * d));
			int img = ((b * c) + (a * d));

			System.out.println(real);
			System.out.println(img);
			if (img > 0) {
				System.out.println(real + "+" + img + "i");
			} else {
				System.out.println(real + (img + "i"));
			}

//		} else if ((a < 0) && (c < 0)) {
//
//			int real = ((a * c) - (b * d));
//			int img = ((a * d) + (a * d));
//
//			System.out.println(real);
//			System.out.println(img);
//			if (img > 0) {
//				System.out.println(real + "+" + img + "i");
//			} else {
//				System.out.println(real + (img + "i"));
//			}

		} else {
			int real = ((a * c) - (b * d));
			int img = ((b * c) + (a * d));

			System.out.println(real);
			System.out.println(img);
			if (img > 0) {
				System.out.println(real + "+" + img + "i");
			} else {
				System.out.println(real + (img + "i"));
			}
		}

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter Input");
//		String input1 = s.next();
		String input1 = "2+3i";
		input1(input1);
		int a = q[0];
		int b = q[1];

		System.out.println("Enter Input");
//		String input2 = s.next();

		String input2 = "2+5i";
		input1(input2);
		int c = q[0];
		int d = q[1];
		System.out.println("a= " + a);
		System.out.println("b= " + b);
		System.out.println("c= " + c);
		System.out.println("d= " + d);
		System.out.println();
		complux(a, b, c, d);
	}
	
	
	
	
	
	
//	else if (input.contains("i")) {
//		if (ch[0] == '-') {
//			s = Integer.parseInt(split[2]);
//			q[1] = s * -1;
//
//		} else {
//			q[0] = Integer.parseInt(split[2]);
//
//		}
//
//	} else {
//		if (ch[0] == '-') {
//			s = Integer.parseInt(split[2]);
//			q[1] = s * -1;
//
//		} else {
//			q[0] = Integer.parseInt(split[1]);
//
//		}
//	}
	
}