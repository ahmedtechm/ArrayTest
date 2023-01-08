package ArratTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;



public class HashMap {

	public static void main(String[] args) {
	      String[] names = {"Atyab", "Fatima", "Saeed", "Abdullah", "Malak", "Fatima", "Daniyal", "Atyab", "Abdullah", "Abdullah"};
	        String[] result = findDuplicateNames(names);
	        for (String s : result) {
	            System.out.println(s);
	        }
	    }

	    public static String[] findDuplicateNames(String[] names) {
	        // Create a map to store the count of each name
	       // Map<String, Integer> nameCounts = new HashMap<String, Integer>();
	    	Map<String, Integer> nameCounts = new java.util.HashMap<String, Integer>();
	        for (String name : names) {
	            // Increment the count of the name in the map
	            int count = nameCounts.getOrDefault(name, 0);
	            nameCounts.put(name, count + 1);
	        }

	        // Create a list to store the result
	        List<String> result = new ArrayList<>();
	        for (Map.Entry<String, Integer> entry : nameCounts.entrySet()) {
	            String name = entry.getKey();
	            int count = entry.getValue();
	            if (count > 1) {
	                result.add(name + " is repeated " + (count - 1) + " times");
	            } else {
	                result.add(name + " is repeated 0 times");
	            }
	        }

	        // Convert the list to an array and return it
	        return result.toArray(new String[0]);
	    }
	}





