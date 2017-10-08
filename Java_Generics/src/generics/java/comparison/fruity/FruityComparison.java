/**
 * 
 */
package generics.java.comparison.fruity;

/**
 * @author vishalverma
 *
 */
public class FruityComparison {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Apple apple = new Apple(1);
		Orange orange = new Orange(2);

		// Comparing the fruits. Can stop the comparison of the fruits, if Fruit
		// does not implement the Comparable interface, instead its subclasses
		// implements
		System.out.println("Comparison of fruits " + apple.compareTo(orange));
	}

}
