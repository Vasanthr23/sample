package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class L7 {
	
	public static void main(String[] args) {

		
	String s="abad sdaf 4tgaath";
	
	
	
	String s1 = s.replace(" ", "");
	char[] a = s1.toCharArray();
	
	
//	int count=0;
	
	
	Map<Character,Integer>map= new HashMap<Character,Integer>();
	
	for (int i = 0; i < a.length; i++) {
		int count=0;
		for (int j = 0; j < a.length; j++) {
			if(a[i]==a[j]) {
				count++;
			
			}
			
		}
		map.put(a[i], count);
	}
	
		System.out.println(map);
	
		
		
		
		
	}
}
