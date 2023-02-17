package test;

public class day0602 extends day06{
	@Override
	public void test1() {
		super.test1();
		System.out.println("sssl3");
		
	}
	@Override
	public void test2(int a) {
		super.test1();
		System.out.println("lsfewfewfefr3");
	}
	private void test3(int n) {
		System.out.println("l3");
	}
	public void test3(String s){
		System.out.println("l4");
	}
	
	public static void main(String[] args) {
		day0602 d =new day0602();
		d.test1();
		d.test2(4);
		d.test3(4);
	}

}
