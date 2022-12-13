package isIsogram;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static boolean isIsogram_og(String str) {
        char[] ch = str.toCharArray();
        List<Character> l1 = new ArrayList<Character>(); 
        for (char c : ch) {
        	if (!l1.contains(Character.toLowerCase(c))) {
        		l1.add(Character.toLowerCase(c));
        	}
        	else {
        		return false;
        	}
        }
        return true;
    } 
    
    public static boolean  isIsogram(String str) {
        return str.length() == str.toLowerCase().chars().distinct().count();
     } 
}
