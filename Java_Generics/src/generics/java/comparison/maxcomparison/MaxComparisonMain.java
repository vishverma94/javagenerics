/**
 * 
 */
package generics.java.comparison.maxcomparison;

import java.util.List;

import generics.java.comparison.fruity.Apple;
import generics.java.comparison.fruity.Fruit;
import generics.java.comparison.fruity.Orange;
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

		List<Fruit> fruits = ListUtil.toList(new Apple(1), new Apple(2), new Apple(3), new Orange(4));
		ComparisonUtils.max(fruits);

		List<Apple> apples = ListUtil.toList(new Apple(1), new Apple(2), new Apple(3));
		// max can not be used because <T extends Comparable<T> , Here <T> is
		// Fruit. So Apple can not be used. moreGenericMax uses "? super T ,
		// which enable the comparison of the subclasses
		// ComparisonUtils.max(apples);
		ComparisonUtils.moreGenericMax(apples);
	}
}
