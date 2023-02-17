package test;

import java.util.Random;

public class L3 {

	
public static void main(String[] vasanth ) {
	
	String Text ="canbancanfkjhifcan";
	String substring="ca";
	
	int count =0;
	int idx=0;
	while((idx=Text.indexOf(substring,idx))!=-1) {
		count++;
		idx++;
	}

	System.out.println(count);
}
	

}
