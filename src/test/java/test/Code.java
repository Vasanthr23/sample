package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Code {

	public static void main(String[] args) {
		
		
// check odd number or even number
		
//		int a=15;
//		if (a%2==0) {
//			System.out.println("even");
//		}else {
//			System.out.println("odd");
//		}
		
		
		
		
// print odd number 1 to 10
		
//		for (int i = 0; i <10; i++) {
//			if (i%2!=0) {
//				System.out.println(i);
//			}
//		}
		
		
		
		
		
// count odd number 1 to 10
//		int count=0;
//		int sum=0;
//		for (int i = 0; i <10; i++) {
//			if (i%2==0) {
//				count++;
//				sum+=i;
//				System.out.print(i+" + ");
//			}
//			
//		}
//		System.out.println("="+sum);
//		System.out.println(count);
		
		
		
	
// reverse the number 123
//		int a=123,rev=0;
//		
//		while (a>0) {
//			int n=a%10;
//			rev=(rev*10)+n;
//			a/=10;
//		}
//		System.out.println(rev);
		
		
		
		
// check polindrome number		
//		int num=12321,a=num,rev=0;
//		
//		while (a>0) {
//			int n=a%10;
//			rev=(rev*10)+n;
//			a/=10;
//		}
//		
//		if (num==rev) {
//			System.out.println("polindrome");
//		} else {
//			System.out.println("not a polindrome");
//		}
		

		
		
// check Armstrong number
		
//		int num=153,a=num,ams=0;
//
//		while (a>0) {
//			int n=a%10;
//			ams=ams+(n*n*n);
//			a/=10;
//		}
//
//		if (num==ams) {
//			System.out.println("Amstrong Number");
//		} else {
//			System.out.println("not a Amstrong Number");
//		}
		
		
		
		
		
// Swap two number 3rd variable		
//		int a=10,b=20,c=0;
//		c=a;
//		a=b;
//		b=c;
//		System.out.println("a="+a);
//		System.out.println("b="+b);
		
		
		
		
// Swap two number without 3rd variable	
//		int a=10,b=20;
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println("a="+a);
//		System.out.println("b="+b);
//		
		
		
		

// Factorial of the number 5
//		int a=5;
//		int fact=1;
//		while (a>0) {
//			fact=fact*a;
//			a--;
//		}
//		System.out.println(fact);
	
		
		
		
// Prime Number			
//		int a=13,count=0;
//		for (int i = 2; i < a/2; i++) {
//			if (a%i==0) {
//				count++;
//			}
//		}
//		if (count==0) {
//			System.out.println("prime");
//		} else {
//			System.out.println("not a prime");
//		}
		
		
		
		
// Reverse String		
//		String s="hello",rev="";
//		for (int i = s.length()-1; i >=0; i--) {
//			rev=rev+s.charAt(i);
//		}
//		System.out.println(rev);
//		
//		StringBuffer sb= new StringBuffer();
//		sb.append(s);
//		sb.reverse();
//		System.out.println(sb);
		
		
		
// Polindrome	
		
//		String s="tanat",s1=s,rev="";
//		for (int i = s.length()-1; i >=0; i--) {
//			rev=rev+s.charAt(i);
//		}
//		
//		if (s.equals(rev)) {
//			System.out.println("Polindrome");
//		} else {
//			System.out.println("not Polindrome");
//		}
	
		


// assending order in array
		
//		int[] a= new int[6];
//		a[0]=4;
//		a[1]=14;
//		a[2]=45;
//		a[3]=07;
//		a[4]=2;
//		a[5]=2;
//
//		for (int i = 0; i < a.length; i++) {
//			for (int j = i+1; j < a.length; j++) {
//				if (a[i]>a[j]) {
//					int temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//		}
//		
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
		

		

// desending order in array
				
//		int[] a= new int[6];
//		a[0]=4;
//		a[1]=14;
//		a[2]=45;
//		a[3]=07;
//		a[4]=2;
//		a[5]=2;
//
//		for (int i = 0; i < a.length; i++) {
//			for (int j = i+1; j < a.length; j++) {
//				if (a[i]<a[j]) {
//					int temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//		}
//				
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
				
				
		
			
// Maxmium number in array

//			int  a[]=new int [6];		
//				
//				a[0]=50;
//				a[1]=20;
//				a[2]=70;
//				a[3]=10;
//				a[4]=10;
//				a[5]=45;
//						
//				for (int i = 0; i < a.length; i++) {
//					for (int j = i+1; j < a.length; j++) {
//						
//						if (a[i]<a[j]) {
//							int temp=a[j];
//							a[j]=a[i];
//							a[i]=temp;
//						}
//					}}
//			
//					System.out.println(a[0]);
//				

		
		
// remove duplicate in array
//		int a[] = new int[6];
//
//		a[0] = 50;
//		a[1] = 20;
//		a[2] = 70;
//		a[3] = 10;
//		a[4] = 10;
//		a[5] = 45;
//
//		Set<Integer> s = new LinkedHashSet<Integer>();
//
//		for (int i = 0; i < a.length; i++) {
//			s.add(a[i]);
//
//		}
//		for (Integer integer : s) {
//			System.out.println(integer);
//
//		}
		
		
// remove duplicate in string
//		String input="abcddef";
//		Set <Character> set= new HashSet<Character>();
//	
//		for(char c : input.toCharArray()) {
//			set.add(c);
//		}
//		StringBuilder sb = new StringBuilder();
//	
//		for(char c :set) {
//			sb.append(c);
//		}
//		System.out.println(sb);
	
		
		
		


		// print the number character
//		String s ="welcome";
//		char[] ch = s.toCharArray();
//		int length = ch.length;
//		System.out.println("number of character in string :"+length);

		// print the number of words
//		String s ="welcome to java";
//		String[] ch = s.split(" ");
//		int length = ch.length;
//		System.out.println("number of word in string : "+length);

		// print the consonant value in the string
//		String s = "asd ngj dged kjd";
//
//		s = s.replaceAll(" ", "");
//		System.out.println(s);
//  
//		char[] a = s.toCharArray();
//		int count = 0;
//
//		Map<Character, Integer> map = new HashMap();
//		for (int i = 0; i < a.length; i++) {
//			count = 0;
//			for (int j = 0; j < a.length; j++) {
//				if (a[i] == a[j]) {
//					count++;
//
//				}
//			}
//			map.put(a[i], count);
//		}
//		System.out.println(map);

		// convert first of the each word should be captial

//		String s1 = "welcome to java";
//		String s2="";
//		String[] s3 = s1.split(" ");
//		for (String s4 : s3) {
//			char ch = s4.charAt(0);
//			char a = Character.toUpperCase(ch);
//			String b = s4.substring(1);
//			s2=s2+a+b+" ";
//			
//		}
//		System.out.println(s2);
//
//		

		// revese each word in the string
//		String s1 = "welcome to java";
//		String s2="";
//		String[] s3 = s1.split(" ");
//		for (String s4 : s3) {
//			String s5="";
//			for (int i = s4.length()-1; i >=0; i--) {
//				char c = s4.charAt(i);
//				s5=s5+c;
//			}
//		
//			s2=s2+s5+" ";
//			
//		}
//		System.out.println(s2);

//		int n=5;
//		
//		for (int i = 1; i < n; i++) {
//			for (int j = 1; j <=n-i; j++) {
//				System.out.print(" ");
//			}
//			for (int j =n-i; j < n; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}

//		for (int i = 1; i <= 6; i++) {
//		      for (int j = 1; j <= i; j++) {
//		        System.out.print(i * j + " ");
//		      }
//		      System.out.println();
//		    }

		// print the number square matrix

//		int n = 3;
//		int size = n * 2 - 1;
//
//		int f = 0;
//		int b = size - 1;
//		int a[][] = new int[size][size];
//
//		while (n != 0) {
//
//			for (int i = f; i <= b; i++) {
//
//				for (int j = f; j <= b; j++) {
//					a[i][j] = n;
//				}
//
//			}
//			f++;
//			n--;
//			b--;
//
//		}
//		for (int i = 0; i < size; i++) {
//			for (int j = 0; j < size; j++) {
//				System.out.print(a[i][j] + " ");
//			}
//			System.out.println();
//		}

//		
//		int n=5;
//		for (int i = 0; i <5; i++) {
//			int a=n;
//			for (int j = 0; j < 5; j++) {
//				System.out.print(a);
//				a--;
//			}
//			
//			System.out.println();
//		}
//		
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		
		
		
		
		
		
		
		
		
//		String input="hello";
//		
//		 Set<Character> set = new LinkedHashSet<Character>();
//	        for (char c : input.toCharArray()) {
//	            set.add(c);
//	        }
//	        
//	        // Convert the set back to a string
//	        StringBuilder sb = new StringBuilder();
//	        for (char c : set) {
//	            sb.append(c);
//	        }
//	        
//	        System.out.println(sb);
//	    
//		int count=0;
//		for (int i = 1; i < 100; i++) {
//			if (i%2==0) {
//				count++;
//				}
//			}
//		System.out.println(count);

//		int[] a = {1, 2, 4, 3, 5,5,5, 6, 4};
//		
//		
//				Set<Integer> s = new LinkedHashSet<Integer>();
//		
//				for (int i = 0; i < a.length; i++) {
//					for (int j = i+1; j < a.length; j++) {
//						if (a[i]==a[j]) {
//							System.out.println(a[i]);
//							
//						}
//					}
//					
//		
//				}
//		int sum=0;
//		for (int i = 1; i <=50; i++) {
//			if (i%2==0) {
//			sum+=i;
//			}
//			}	System.out.println(sum);

//				for (Integer integer : s) {
//					System.out.println(integer);
//		
//				}

//		int a=0,b=1,c;
//		System.out.print(a+" "+b+" ");
//		for (int i = 0; i <10; i++) {
//			c=a+b;
//			a=b;
//			b=c;
//			System.out.print(c+" ");
//		}

//		
//		  String str1 = "Saket Saurav        is an Autom ation Engi ne      er";
//		  
//	        char[] chars = str1.toCharArray();
//	  
//	        StringBuffer sb = new StringBuffer();
//	  
//	        for (int i = 0; i <=chars.length; i++)
//	        {
//	            if( chars[i] != ' ') 
//	            {
//	                sb.append(chars[i]);
//	            }
//	        } 
//	        System.out.println(sb);    

//	    String s = "Hello    world!  How   are you?";
//		
//		
		
		
		
		
		
		
		
		
		

	
	}

}
