/**
 * 
 */
package generics.java.comparison.maxcomparison;

import java.util.List;

import generics.java.customLists.ListUtil;

/**
 * @author vishalverma
 *
 */
public class MaxComparisonMain {
	public static void main(String[] args) {
		List<Integer> integerList = ListUtil.toList(1, 2, 3, 4, 5, 6);
		System.out.println("Max Integer " + ComparisonUtils.max(integerList));

		List<String> stringList = ListUtil.toList("hero", "zero");
		System.out.println("Max String " + ComparisonUtils.max(stringList));

		List<String> stringList2 = ListUtil.toList("hero", "Zero");
		System.out.println("Max String " + ComparisonUtils.max(stringList2));
	}
}
