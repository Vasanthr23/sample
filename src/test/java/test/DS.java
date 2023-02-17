package test;

import java.util.Iterator;

public class DS {

	public static void main(String[] args) {

		int a=5;
		
		for (int i = 1; i <=a; i++) {
			
			for (int j = 1; j <i; j++) {
				System.out.print(" ");
				
			}
			for (int j = i; j <=a; j++) {
				System.out.print(i);
			}
		
			for (int j = i; j <a; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		//fin
//		int a =5;
//		int b=1;
//		for (int i = 1; i <= a; i++) {
//			 b =b*i;
//			
//			 System.out.println(b);
//		}
//		System.out.println(b);

//		int a =370;
//		int temp=a;
//		int arm = 0;
//		while (a>0) {
//			int n= a%10;
//			arm=arm+(n*n*n);
//			a=a/10;
//		}
//		System.out.println(arm);

		
		
//		String s1 = "ROM asd dfgf";
//
//		String s2 = "";
//
//		String[] s3 = s1.split(" ");
//
//		for (String s4 : s3) {
//			String s5 = "";
//			for (int j = s4.length() - 1; j >= 0; j--) {
//				s5 = s4.charAt(j) + s5;
//			}
//			s2 = s2 + s5 + " ";
//		}
//
//		System.out.println(s2);
		
//		String s1 ="asdfgasdfbhasd";
//		String s2="asd";
//		
//		String s3="";
//			int count=0;	
//			int indexOf = s1.indexOf(1);
//			System.out.println(indexOf);		
//			char charAt = s1.charAt(1);		
//			System.out.println(charAt);
			
//		for (int i =  s1.length(); i >=0; i--) {
//			
//			String c1 =""+ s1.charAt(i);
//			String c2 =""+ s1.charAt(i+1);
//			String c3 =""+ s1.charAt(i-1);
//			 s3=c1+c2+c3;
//			
//			if (s3==s2 ) {
//				count++;
//				
//			}
//			
//		}System.out.println(count);
			
			
//			for (int i = 0; i < args.length; i++) {
//				
//			}
			
	}

}
