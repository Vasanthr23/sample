package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class L6 {
	
	public static void main(String[] args) {
		
		
//		ArrayList<Integer> l = new ArrayList<Integer>();
//		l.add(10);
//		l.add(200);
//		l.add(30);
//		l.add(7);
//		l.add(400);
//		l.add(50);
//		
////		l.clear();
//		Object object = l.get(3);
//		System.out.println(object);
//		 Collections.sort(l);
//		
////		l.set(3,100);
//		System.out.println(l);
		String input = "hello";
		Set<Character> set = new LinkedHashSet<Character>();
		char[] ch = input.toCharArray();
		for (char c : ch) {
			set.add(c);
			System.out.println(c);
			}
		// Convert the set back to a string
		StringBuilder sb = new StringBuilder();
		for (char c : set) {
			System.out.println(c+"    sjoiudhfu");
			sb.append(c);
		}
				System.out.println(sb);
	}
	
}
