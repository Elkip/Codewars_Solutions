package maximunSubarrraySum;
//Use of Kadane's Algorithm

public class Solution {
	public static int sequence(int[] arr) {
		int current_max = 0;
		int max_here = 0;
		for (int i = 0; i < arr.length; i++) {
			max_here += arr[i];
			if (current_max < max_here)
				current_max = max_here;
			if (max_here < 0)
				max_here = 0;
		}
		return current_max;
	}
	
	public static void main(String[] args) {
		int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
		System.out.println(sequence(a));
	}
}
