package test;

public class L8 {
	
	

	
	public static void main(String[] args) {
//		{
//	        int m = 4;
//	        int n = 4;
//	        int a[][] = { { 1, 2, 3, 4 },
//	                      { 5, 6, 7, 8 },
//	                      { 9, 10, 11, 12 },
//	                      { 13, 14, 15, 16 } };
//	 
//	        // Function Call
//	      
//	        int [][] ar =new int[4][4];
//	        
//	        int i, k = 0, l = 0;
//	        
//	        /*  k - starting row index
//	        m - ending row index
//	        l - starting column index
//	        n - ending column index
//	        i - iterator
//	        */
//	 
//	        while (k < m && l < n) {
//	            // Print the first row from the remaining rows
//	            for (i = l; i < n; ++i) {
////	                System.out.print(a[k][i] + " ");
//	               ar[k][i]=n;
//	               System.out.println(ar[k][i]+"******");
//	            }
//	            
//	            k++;
//	            System.out.println();
//	            // Print the last column from the remaining
//	            // columns
//	            for (i = k; i < m; ++i) {
//	                System.out.print(a[i][n - 1] + " ");
//	                ar[i][k]=n;
//	                System.out.println(ar[i][k]+"******");
//	            }
//	            n--;
//	 
//	            // Print the last row from the remaining rows */
//	            if (k < m) {
//	                for (i = n - 1; i >= l; --i) {
//	                    System.out.print(a[m - 1][i] + " ");
//	                    ar[i][k]=n;
//	                }
//	                m--;
//	            }
//	 
//	            // Print the first column from the remaining
//	            // columns */
//	            if (l < n) {
//	                for (i = m - 1; i >= k; --i) {
//	                    System.out.print(a[i][l] + " ");
//	                    ar[i][k]=n;
//	                }
//	                l++;
//	            }
//	        }
//	        for ( i = 0; i < m; i++) {
//
//	        	  for (int j =0; j <m; j++) {
//
//	        	   System.out.print(ar[i][j]+" ");
//	        	  }
//	        	  System.out.println();
//	        	}
//
//	}
		System.out.println("asd");
		String s="name";
		String rev="";
		for (int i = s.length()-1; i >=0; i--) {
			rev=rev+s.charAt(i);
			
			
		}
System.out.println(rev);
}
}
