
package test;

public class day03 {
	
	
	private void datatypes() {
		byte b= 127;
		Short s=32767;
		int i =1548545784;
		long l=2100000000;
		float f=1357.546453f;
		double d=54356.45686945d;
		int ii=(int)d;
		String string = Integer.toString(ii);
		String s1="4654";
		int parseInt = Integer.parseInt(s1);
		char c='s';
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(ii);
		System.out.println(string);
		System.out.println(s1);
		System.out.println(parseInt);
	}
	
	public static void main(String[] args) {
		day03 d= new day03();
		d.datatypes();
	}
	

}
