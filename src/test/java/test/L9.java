package test;

public class L9 {
	public static void main(String[] args) {

		// L1
//		int n=5;
//		int a=n;
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(j*j);
//			}
//			System.out.println();
//			a--;
//		}

		// L2
//		int r=5;
//		int a=r;
//		for (int i = 1; i <= r; i++) {
//			for (int j = 1; j <= a; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//			a--;
//		}

		// R1
//		int r1=5;
//		
//		for (int i = 1; i <= r1; i++) {
//			int a=1;
//			for (int j = 1; j <i; j++) {	
//				System.out.print(" ");
//			}
//			for (int j = i; j <=r1; j++) {
//				System.out.print(i);
//			}
//			System.out.println();
//
//		}

//		//R2
//		
//		int n = 5;
//
//		for (int i = 1; i <= n; i++) {
//			int a = 1;
//			for (int j = i; j < n; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 1; j < i; j++) {
//				System.out.print(a++);
//			}
////			for (int j = 1; j <= i; j++) {
////				System.out.print(a--);
////			}
//			System.out.println();
////			a--;
//		}

//		
//		 int n= 5,p=1;
//		 for(int i=1; i<n; i++, p++){
//		    for(int j=i; j<n; j++){
//		           System.out.print(" ");
//		    }for(int j=1; j<i; j++){
//		           System.out.print(p);
//		    } for(int j=1; j<=i; j++){
//		           System.out.print(p);
//		    }
//		    System.out.println();
//		 }
//		 
//		 for(int i=1; i<=n; i++, p++){
//		    for(int j=1; j<i; j++){
//		          System.out.print(" ");
//		    } for(int j=i; j<n; j++){
//		         System.out.print(p);
//		    } for(int j=i; j<=n; j++){
//		          System.out.print(p);
//		    }
//		    System.out.println();
//		 }			
////
//	int	n1=1,n2=3,n3=0;
//	int count=10;
//	 if(count>0){  
//         n3 = n1 + n2;  
//         n1 = n2;  
//         n2 = n3;  
//         System.out.print(" "+n3); 
////         count=count-1;  
//     }

//		int n = 5;
//
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j < i; j++) {
//				System.out.print(" ");
//			}
//
//			for (int k = i; k <= n; k++) {
//				System.out.print(k + " ");
//			}
//			System.out.println();
//		}
//		for (int i = n - 1; i >= 1; i--) {
//			for (int j = 1; j < i; j++) {
//				System.out.print(" ");
//			}
//			for (int k = i; k <= n; k++) {
//				System.out.print(k + " ");
//			}
//
//			System.out.println();
//		}
//		
//		
//		System.out.println();
//		
//		for (int i = 1; i <= n; i++) {
//		System.out.println();	
//		}
	
	
		int a=5;
		for (int i = 1; i <=a; i++) {
			for (int j = i; j <= a; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	

	}
}
