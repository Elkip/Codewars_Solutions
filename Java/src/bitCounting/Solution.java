package bitCounting;

public class Solution {
	public static int countBits_og(int n){
		String bin = Integer.toBinaryString(n);
		int count = 0;
		for (int i = 0; i < bin.length(); i++) {
			if (bin.charAt(i) == '1') {
				count++;
			}
		}
		return count;
	}
	
	public static int countBits(int n) {
		return Integer.bitCount(n);
	}
	
	public static void main(String[] args) {
		countBits(1234);
	}
}
