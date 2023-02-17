package test;

import java.util.Scanner;

public class L10 {
		
		
		static private void input1(String input) {
			char[] ch = input.toCharArray();

			for (int i = 1; i < input.length(); i++) {

				if (ch[i] == '+') {

					String split[] = input.split("[\\Q+-\\Ei]");

					if (ch[0] == '-') {
						int a = Integer.parseInt(split[1]);
						int b = Integer.parseInt(split[2]);
						System.out.println(a);
						System.out.println(b);
					} else {
						int a = Integer.parseInt(split[0]);
						int b = Integer.parseInt(split[1]);
						System.out.println(a);
						System.out.println(b);

					}
					break;
				}

				if (ch[i] == '-') {
					String split[] = input.split("[\\Q+-\\Ei]");

					if (ch[0] == '-') {
						int a = Integer.parseInt(split[1]);
						int b = Integer.parseInt(split[2]);
						System.out.println(a);
						System.out.println(b);
						System.out.println("2222");
					} else {
						int a = Integer.parseInt(split[0]);
						int b = Integer.parseInt(split[1]);
						System.out.println(a);
						System.out.println(b);

					}
					break;
				}
			}

		}
		static private void input2(String input1) {

			char[] c1 = input1.toCharArray();

			for (int i = 1; i < input1.length(); i++) {

				if (c1[i] == '+') {

					String split[] = input1.split("[\\Q+-\\Ei]");

					if (c1[0] == '-') {
						int c = Integer.parseInt(split[1]);
						int d = Integer.parseInt(split[2]);
						System.out.println(c);
						System.out.println(d);
					} else {
						int c = Integer.parseInt(split[0]);
						int d = Integer.parseInt(split[1]);
						System.out.println(c);
						System.out.println(d);

					}
					break;
				}

				if (c1[i] == '-') {
					String split[] = input1.split("[\\Q+-\\Ei]");

					if (c1[0] == '-') {
						int c = Integer.parseInt(split[0]);
						int d = Integer.parseInt(split[1]);
						System.out.println(c);
						System.out.println(d);
					} else {
						int c = Integer.parseInt(split[0]);
						int d = Integer.parseInt(split[1]);
						System.out.println(c);
						System.out.println(d);

					}
					break;
				}
			}

		}



		static private void complexnumber(String input, String input1) {

			
		}
		public static void main(String[] args) {
//			Scanner a = new Scanner(System.in);
//			System.out.println("Enter Input");
//			String input = a.next();
//			String s = input;
//			
//			
//			if (s.contains("+")) {
//				
//				
//				
//				String x[] = s.split("\\+|i");
//				int real = Integer.parseInt(x[0]);
//				System.out.println(x[0]);
//				int img = Integer.parseInt(x[1]);
//				System.out.println(x[1]);
//				System.out.println((real * real - img * img) + "+" + (real * img + img * real) + "i");
//			}
//			if (s.contains("-")) {
//				String x[] = s.split("\\-|i");
//				int real = Integer.parseInt(x[0]);
//				System.out.println(x[0]);
//				int img = Integer.parseInt(x[1]);
//				System.out.println(x[1]);
//				System.out.println((real * real - img * img) + "-" + (real * img + img * real) + "i");
//			} else if (!(s.contains("i") || s.contains("-"))) {
//				System.out.println("wrong complex input");
//			}

//			String s1="22-1i";
//			String x[] = s1.split("-");
//			int real = Integer.parseInt(x[0]);
//			System.out.println(x[0]);
//			int img = Integer.parseInt(x[1]);
//			System.out.println(x[1]);

//			String c="1i";
////			String[] l = c.split(" ");
//			String l[] = c.split("[+-\\Ei]");
//			System.out.println(l[0]);
//			for (String x : l) {
//				System.out.println(x);
//			}
//			for (int i = 0; i < l.length; i++) {
//				char charAt = c.charAt(i);
//				System.out.println(charAt);
//				
//			}
//			String s1=c;
//			System.out.println(s1);
//			try {
//				String s[] = c.split("[\\Q+-\\Ei]");
//				System.out.println(s[0]+" "+s[1]);
//			} catch (Exception e) {
//				String s[] = c.split("\\Ei]");
//				System.out.println(s[0]+" "+s[1]);
//			}

//	        System.out.println(s[0]+" "+s[1]);
//	        
//			System.out.println(s[0]);
//			System.out.println(s[1]);
//	        int postion_plus=c.indexOf('+');
//	        int position_i=c.indexOf('i');
//	        System.out.println(c.substring(0, postion_plus));
//	        Float.parseFloat(c.substring(0,postion_plus));

			Scanner s = new Scanner(System.in);
			System.out.println("Enter Input");
			String input1 = s.next();
			String input2 = s.next();
			input1(input1);
			input2(input2);
			
		}
	}

