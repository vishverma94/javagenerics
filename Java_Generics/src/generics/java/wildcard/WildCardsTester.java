/**
 * 
 */
package generics.java.wildcard;

import java.util.ArrayList;
import java.util.List;

import generics.java.customLists.ListUtil;

/**
 * {@link WildCardsTester} is used to test the use of wild card
 * 
 * @author vishalverma
 *
 */
public class WildCardsTester {
	public static void main(String[] args) {
		List<Integer> integerList = ListUtil.toList(1, 2, 3);
		List<Number> numberList = new ArrayList<Number>();
		// Can copy list of integers to list of numbers since integer is number

		// Integer is the parametric type , since Integer is subtype of Integer
		CollectionUtils.copy(numberList, integerList);
		// Number is the parametric type
		CollectionUtils.<Number>copy(numberList, integerList);
		// Specifically telling compiler to add casts Number as the parametric
		// type
		CollectionUtils.<Integer>copy(numberList, integerList);

	}

}
