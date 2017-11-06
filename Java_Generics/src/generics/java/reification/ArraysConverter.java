/**
 * 
 */
package generics.java.reification;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author vishalverma
 *
 */
public class ArraysConverter {
	/**
	 * Very specific method to create arrays of Integers only.
	 * 
	 * @param c
	 * @return Array of integers
	 */
	public static Integer[] toArray(Collection<? extends Integer> c) {
		@SuppressWarnings("unchecked")
		Integer[] integerArray = new Integer[c.size()];
		int i = 0;
		for (Integer object : c) {
			integerArray[i++] = object;
		}
		return integerArray;
	}

	/**
	 * Generic way to implement toArray. Uses reflection for array creation
	 * 
	 * @param c
	 * @param classType
	 * @return Array of T
	 */
	public static <T> T[] toArray(Collection<? extends T> c, Class<T> classType) {
		T[] array = (T[]) Array.newInstance(classType, c.size());
		int i = 0;
		for (T object : c) {
			array[i++] = object;
		}
		return array;
	}

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 2, 3);
		List<String> strings = Arrays.asList("Vishal");
		Integer[] dummyIntegerArray = toArray(integers);

		Integer[] integerArray = ArraysConverter.toArray(integers, Integer.class);

		String[] stringArray = ArraysConverter.toArray(strings, String.class);

	}
}
