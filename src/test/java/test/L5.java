package test;

public class L5 {
	
	public static void main(String[] args) {
		
//		String s= "New technology";
//		//         01234567891123
//		int length = s.length();
//		System.out.println(length);
//		
//		String lowerCase = s.toLowerCase();
//		System.out.println(lowerCase);
//		
//		String upperCase = s.toUpperCase();
//		System.out.println(upperCase);
//		
//		int indexOf = s.indexOf('c');
//		System.out.println(indexOf);
//		
//		char charAt = s.charAt(5);
//		System.out.println(charAt);
//		
//		boolean contains = s.contains("tec");
//		System.out.println(contains);
//		
//		String substring = s.substring(8);
//		System.out.println(substring);
//		
//		String substring1 = s.substring(9,10);
//		System.out.println(substring1);
		
		
		
//		String s="123456";
//		int i=Integer.parseInt(s);
//		System.out.println(i);
//		
//		int b=25;
//		String s1=Integer.toString(b);  
//		System.out.println(s1);
		
		
		
		
//		String s= "New technology mvburkfheir eeiufh ef";
//		String[] split = s.split(" ");	
//		for(String w:split){  
//			System.out.println(w);  
//			}  
//		
		
		
		String s="laptop hp 16";
		//        012345

		String output ="";
		String[] split = s.split(" ");
		
		for (String x : split) {
		
			for (int i = x.length()-1; i >=0 ; i--) {
				
				char charAt = x.charAt(i);
				output=output+charAt;
						
				
			}
			output=output+" ";
			 
		}
		
		System.out.println(output);
		
		
	}

}
