package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class L4 {
	
	public static void main(String[] args) {
		
//		
//		int a=9;
//
//		int even=0;
//		int odd=0;
//		
//		for (int i = 1; i <=a; i++) {
//			
//			if (i%2==0) {
//				even=even+i;
//				System.out.println(i);
//			}
//			else {
//				odd++;
////				System.out.println(i);
//			}
//			
//		}
//		System.out.println(even +"even");
//		System.out.println(odd);
//		
		
		 //rev
//		 int a=123;
//		 int rev=0;
//		 while (a>0) {
//			 int n =a%10;
//			 rev=n+(rev*10);
//			 a/=10;
//			
//		}
//			System.out.println(rev);
		 
		
		
		
		//digit
		
//		int a=92521;
//			
//		int count=0;
//		 while(a>0) {
//			 count++;
//			 a/=10;
//		 }
//		System.out.println(count);
//		
		
		
		
//		int a=153;
//		int ams=0;
//		
//		while(a>0) {
//			int t =a%10;
//			ams =ams+(t*t*t);
//			a/=10;
//			
//		}
//
//		System.out.println(ams);
		
		
		
		//fact
		
//		int a=5;
//		int b=1;
//		while(a>0) {
//			b=b*a;
//			a--;
//		}
//		System.out.println(b);
//		
		
//		String s ="how are you";
//		String rev="";
//		for (int i = s.length()-1; i >=0; i--) {
//			char charAt = s.charAt(i);
//		rev+=charAt;
//			
//		}
//		System.out.println(rev);
		
		
		
		
		int  a[]=new int [6];		
		
		a[0]=50;
		a[1]=20;
		a[2]=70;
		a[3]=10;
		a[4]=10;
		a[5]=45;
		
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				
				if (a[i]<a[j]) {
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
				
			}
//			
//			
		}
//		System.out.println(a[2]);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
//		Set<Integer> s=new LinkedHashSet<Integer>();
//		
//	
//		for (int i = 0; i < a.length; i++) {
//			s.add(a[i]);
//			
//		}
//		for (Integer integer : s) {
//			System.out.println(integer);
//			
//		}
		
		
//		String s="asdjnjiunasdjnouasdljkoiasd";
//		String s1="asd";
//		int a=0;
//		int answer=0;
//		while((a=s.indexOf(s1,a))!=-1) {
//			a++;
//			answer++;
//			
//		}
//		System.out.println(answer);
		
		
		
//		String s="asd ngj dged kjd";
		
		
		
//		s=s.replaceAll(" ","");
//		System.out.println(s);
//		
//		char[] a = s.toCharArray();
//		int count =0;
//		
//		Map<Character,Integer>  map = new HashMap();
//		for (int i = 0; i < a.length; i++) {
//			count=0;
//			for (int j = 0; j < a.length; j++) {
//				if (a[i]==a[j]) {
//					count++;
//					
//				}
//			}map.put(a[i], count);
//		}System.out.println(map);
		
		
		
		
		
		
		

		
		
	}
}
