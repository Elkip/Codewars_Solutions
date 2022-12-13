package pigLatin;

public class Solution {
    public static String pigIt_og(String str) {
        String sol = "";
        String[] arr = str.split(" ");
        for (String s: arr) {
        	if (s.matches("[a-zA-Z]+")) {
        		sol += s.substring(1, s.length()) + s.substring(0, 1) + "ay ";	
        	} else {
        		sol += s;
        	}
        	
        }
        System.out.println(sol);
        
    	return sol.trim();
    }
    
    public static String pigIt(String str) {
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }
	
    public static void main(String[] args) {
    	pigIt("Pig latin is cool");
	}
    
}
