package test;

public class day15encap {

//	private String name;
//	private String  age;
//	private String year;
//	
//	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getAge() {
//		return age;
//	}
//	public void setAge(String age) {
//		this.age = age;
//	}
//	public String getYear() {
//		return year;
//	}
//	public void setYear(String year) {
//		this.year = year;
//	}
	public static void main(String[] args) {
		// Mutable String
		String s = "softsuave";
		String s1 = "softsuave";

		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));

		System.out.println("AFTER");
		s = s.concat(s1);
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
		
		System.out.println("****************");
		
		// imMutable String
		StringBuffer s2 = new StringBuffer("softsuave");
		StringBuffer s3 = new StringBuffer("softsuave");

		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));

		System.out.println("AFTER");
		s2 = s2.append(s3);
		System.out.println(s2);
		System.out.println(System.identityHashCode(s2));
	}

}
