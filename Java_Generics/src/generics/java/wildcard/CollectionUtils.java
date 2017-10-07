/**
 * 
 */
package generics.java.wildcard;

import java.util.List;

/**
 * @author vishalverma
 *
 */
public class CollectionUtils {

	/**
	 * Copy a list to another list .
	 * 
	 * ? extends T can only be used to get the elements since we only know what
	 * kind of object it can return
	 * 
	 * ? super T can only be used to put the elements since we only know what
	 * kind of objects it can add
	 * 
	 * @param destinationList
	 * @param sourceList
	 */
	public static <T> void copy(List<? super T> destinationList, List<? extends T> sourceList) {
		for (T element : sourceList) {
			destinationList.add(element);
		}
	}

}
