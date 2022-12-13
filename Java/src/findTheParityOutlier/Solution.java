package findTheParityOutlier;

import java.util.Arrays;

public class Solution {
	static int find_og(int[] integers){
		int sum = Math.abs(integers[0] % 2) + Math.abs(integers[1] % 2) + Math.abs(integers[2] % 2);
		int n = 0;
		if (sum <= 1) {
			n = 1;
		}
		for (int i = 0; i<integers.length; i++) {
			if (Math.abs(integers[i] % 2) == n) {
				return integers[i];
			}
		}
		return 0;
	}
	
	static int find(int[] integers) {
		int[] odd = Arrays.stream(integers).filter(n -> n % 2 != 0).toArray();
		int[] even = Arrays.stream(integers).filter(n -> n % 2 == 0).toArray();
		return odd.length == 1 ? odd[0] : even[0];
	}
}
