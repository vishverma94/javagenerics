/**
 * 
 */
package generics.java.customIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * {@link CustomIterator} is made that iterates over the integer
 * 
 * @author vishalverma
 */
public class CustomIterator implements Iterable<Integer> {
	List<Integer> integerList;

	public CustomIterator() {
		integerList = new ArrayList<Integer>();
	}

	@Override
	public Iterator<Integer> iterator() {
		return integerList.iterator();
	}

	public void addInteger(int integer) {
		integerList.add(integer);
	}

}
