import java.util.*;
public class Consecutive_sequences {

	/**
	 * @param args
	 */
	 public static void main(String[] args)  {
	        Scanner sc=new Scanner(System.in);
	        int T = sc.nextInt();
	        for (int i = 0; i < T; ++i) {
	            int n=sc.nextInt();
	            int k=sc.nextInt();
	            int[] a=new int[n];
	            for (int j = 0; j < n; ++j) { a[j] = sc.nextInt(); }
	            System.out.println(findresult(a, k));
	        }                        
	    }
	    
	    private static long findresult(int[] a, int k) {
	        long b = 0;
	        int[] p = new int[k];
	        int Sum = 0;
	        for (int i = 0; i < a.length; ++i) {
	            Sum += a[i];
	            Sum %= k;
	            b += (long) p[Sum];
	            if (Sum == 0) { ++b; }
	            ++p[Sum];            
	        }        
	        return b;
	    }

}
