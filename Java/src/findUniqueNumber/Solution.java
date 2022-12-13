package findUniqueNumber;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {
    public static double findUniq(double arr[]) {
    	Map<Double, Integer> mp = new HashMap<>();
    	for (int i = 0; i < arr.length; i++) {
    		if (mp.containsKey(arr[i])) {
    			mp.put(arr[i], mp.get(arr[i]) + 1);
    		}
    		else {
    			mp.put(arr[i], 1);
    		}
    	}
    	for (Entry<Double, Integer> entry: mp.entrySet()) {
    		if (entry.getValue() == 1) {
    			System.out.println(entry.getKey());
    			return entry.getKey();
    		}
    	}
    	return 0;
    }
}
