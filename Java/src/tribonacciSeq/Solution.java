package tribonacciSeq;

public class Solution {
	  public static double[] tribonacci(double[] s, int n) {
	      double[] seq = new double[n];
	      for (int i = 0; i < n; i++) {
	    	  System.out.println(i);
	    	  if (i > 2) {
	    		  seq[i] = seq[i-1] + seq[i-2] + seq[i-3];
	    	  } else {
	    		  seq[i] = s[i];  
	    	  }
	      }
		  return seq;
	  }
	  
	  public static void main(String[] args) {
		  Solution.tribonacci(new double []{1,1,1}, 10);
	  }
}
