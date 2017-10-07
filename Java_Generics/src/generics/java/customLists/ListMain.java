/**
 * 
 */
package generics.java.customLists;

import java.util.List;

/**
 * @author vishalverma
 *
 */
public class ListMain {
	public static void main(String[] args) {
		List<Integer> list = ListUtil.toList(1, 2, 3);
		ListUtil.printList(list);
		System.out.println("After adding some more elements");
		ListUtil.addAll(list, 1, 2, 3);
		ListUtil.printList(list);

		System.out.println("After adding some more elements");
		// Converts the data to returning type as long as there no compilation
		// errors
		List<Number> objectList = ListUtil.toList(1, 2.343);
		ListUtil.printList(objectList);
	}
}
