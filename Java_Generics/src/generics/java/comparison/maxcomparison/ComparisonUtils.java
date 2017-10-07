/**
 * 
 */
package generics.java.comparison.maxcomparison;

import java.util.Collection;

/**
 * {@link ComparisonUtils}, a generic utility class
 * 
 * @author vishalverma
 *
 */
public class ComparisonUtils {

	/**
	 * Returns the max element in the collection.
	 * 
	 * @param collection
	 * @return
	 */
	public static <T extends Comparable<T>> T max(Collection<T> collection) {
		T maxElement = collection.iterator().next();
		for (T element : collection) {
			if (maxElement.compareTo(element) < 0)
				maxElement = element;
		}
		return maxElement;
	}

	public static <T extends Comparable<? super T>> T moreGenericMax(Collection<? extends T> collection) {
		T maxElement = collection.iterator().next();
		for (T element : collection) {
			if (maxElement.compareTo(element) < 0)
				maxElement = element;
		}
		return maxElement;
	}
}
