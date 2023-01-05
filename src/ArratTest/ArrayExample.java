package ArratTest;

public class ArrayExample {

	public static void main(String[] args) {
		
		String[] names = {"Atyab", "Fatima", "Saeed", "Malak", "Fatima", "Daniyal", "Abdullah", "Abdullah" };


		int[] counts = new int[names.length];

		for (int i = 0; i < names.length; i++) {
		    String name = names[i];
		    for (int j = 0; j < names.length; j++) {
		        if (name.equals(names[j])) {
		            counts[i]++;
		        }
		    }
		}

		for (int i = 0; i < names.length; i++) {
		    String name = names[i];
		    int count = counts[i];
		    System.out.println(name + " is repeated " + count + " times");
		}


	}
}