/**
 * 
 */
package generics.java.customLists;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link ListUtil} containing the generics methods for list
 * 
 * @author vishalverma
 *
 */
public class ListUtil {

	/**
	 * Converts an array of elements to a list corresponding to parametric type
	 * 
	 * @param args
	 * @return
	 */
	public static <T> List<T> toList(T... args) {
		List<T> list = new ArrayList<T>();
		addAll(list, args);
		return list;
	}

	/**
	 * Add All elements to the given list, a generic method to add
	 * 
	 * @param list
	 * @param args
	 */
	public static <T> void addAll(List<T> list, T... args) {
		for (T argument : args) {
			list.add(argument);
		}
	}

	public static <T> void printList(List<T> list) {
		for (T listElement : list) {

			System.out.println(listElement);
		}
	}

}
