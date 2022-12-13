package formatDuration;

import java.util.ArrayList;

public class Solution {
    
    public static String formatDuration(int seconds) {
        if (seconds == 0)
        	return "now";
        
    	int minutes = (seconds / 60) % 60;
        int hours = (seconds / (60 * 60)) % 24;
        int days = (seconds / (60*60*24)) % 365;
        int years = seconds / (60*60*24*365);
        seconds = seconds % 60;
        
        System.out.println("Output: " + seconds + " seconds, " + minutes + " minutes, " + hours + " hours, " + days + " days, " + years + " years");
       
        ArrayList <String> arrayli = new ArrayList<String>();
        
        String temp;
        if (years != 0) {
        	temp = years + " year";
        	if (years > 1)
        		temp += "s";
        	arrayli.add(temp);
        }
        if (days != 0) {
        	temp = days + " day";
        	if (days > 1)
        		temp += "s";
        	arrayli.add(temp);
        }
        if (hours != 0) {
        	temp = hours + " hour";
        	if (hours > 1)
        		temp += "s";
        	arrayli.add(temp);
        }
        if (minutes != 0) {
        	temp = minutes + " minute";
        	if (minutes > 1)
        		temp += "s";
        	arrayli.add(temp);
        }
        if (seconds != 0) {
        	temp = seconds + " second";
        	if (seconds > 1)
        		temp += "s";
        	arrayli.add(temp);
        }
        
        String fin = "";
        if (arrayli.size() == 1)
        	return arrayli.get(0);
        else {
	        for (int i = 0; i < arrayli.size(); i++) {
	        	if (i == arrayli.size() - 1) {
	        		fin = fin.substring(0, fin.length()-2) + " and ";
	        	}
	        	fin += arrayli.get(i);
	        	if (i != arrayli.size() - 1)
	        		fin += ", ";
	        }
        }

        return fin;
    }
    
    public static void main(String[] args) {
    	System.out.println(formatDuration(0));
    	System.out.println(formatDuration(30));
    	System.out.println(formatDuration(7200));
    	System.out.println(formatDuration(172801));
    	System.out.println(formatDuration(453459745));
    }
}
