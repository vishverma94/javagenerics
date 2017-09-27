/**
 * 
 */
package generics.java.customIterator;

/**
 * Main Class to test the custom iterator and for each loop
 * 
 * @author vishalverma
 * 
 */
public class CustomerIteratorMain {
	public static void main(String[] args) {
		// Use of array for primitive is efficient as compared to the List
		// (Since it involves boxing and unboxing)
		int[] integerArray = { 1, 2, 3, 4, 5, 6 };

		CustomIterator iterator = new CustomIterator();
		for (int temp : integerArray) {
			iterator.addInteger(temp);
		}
		// Return Integer as specified by its iterator
		for (Integer integer : iterator) {
			System.out.println(integer);
		}
	}

}
