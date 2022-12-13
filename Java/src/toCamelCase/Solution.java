package toCamelCase;

class Solution {

	public static void main(String[] args) {
		Solution.toCamelCase("This_is_a_test");
	}
	
	static String toCamelCase(String s) {
		String fin = "";
		boolean nextUpper = false;
		for (char ch : s.toCharArray()) {
			if (ch == '-' || ch == '_') {
				nextUpper = true;
			} else {
				fin += ((nextUpper) ? Character.toUpperCase(ch):ch);
				nextUpper = false;
			}
		}
		return fin;
	}
}