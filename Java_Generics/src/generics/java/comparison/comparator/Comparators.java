/**
 * 
 */
package generics.java.comparison.comparator;

import java.util.Collection;
import java.util.Comparator;

/**
 * {@link Comparators} contains multiple platform level comparators
 * 
 * @author vishalverma
 *
 */
public class Comparators {
	/**
	 * @param <T>
	 *            That extends {@link Comparable} interface
	 * @return {@link Comparator} that maintains the natural ordering
	 */
	public static <T extends Comparable<? super T>> Comparator<T> naturalOrder() {
		return new Comparator<T>() {

			@Override
			public int compare(T o1, T o2) {
				return o1.compareTo(o2);
			}
		};
	}

	/**
	 * @param <T>
	 *            That extends {@link Comparable} interface
	 * @return {@link Comparator} that reverses the natural ordering
	 */
	public static <T extends Comparable<? super T>> Comparator<T> reverseOrder() {
		return new Comparator<T>() {

			@Override
			public int compare(T o1, T o2) {
				return o2.compareTo(o1);
			}
		};
	}

	/**
	 * It gives the maximum present in the given collection
	 * 
	 * @param T
	 * @param coll
	 * @param cmp
	 * @return
	 * @throws NullPointerException
	 *             When either collection or the comparator is null or its
	 *             values are null
	 * 
	 */
	public static <T extends Comparable<? super T>> T max(Collection<? extends T> coll, Comparator<? super T> cmp) {
		T max = coll.iterator().next();
		for (T current : coll) {
			if (cmp.compare(current, max) > 0)
				max = current;
		}
		return max;
	}

	/**
	 * It gives the maximum present in the given collection. Uses the
	 * {@link #naturalOrder()} Comparator
	 * 
	 * @param T
	 *            Which extends the {@link Comparable} Interface
	 * @param coll
	 * @return Maximum Element present in the collection
	 * @throws NullPointerException
	 *             If collection or the values in collection are {@code null}
	 */
	public static <T extends Comparable<? super T>> T max(Collection<? extends T> coll) {
		return max(coll, naturalOrder());
	}

	/**
	 * It gives the minimum present in the given collection. Uses the
	 * {@link #reverseOrder()} Comparator
	 * 
	 * @param T
	 *            Which extends the {@link Comparable} Interface
	 * @param coll
	 * @return Minimum Element present in the collection
	 * @throws NullPointerException
	 *             If collection or the values in collection are {@code null}
	 */
	public static <T extends Comparable<? super T>> T min(Collection<? extends T> coll) {
		return max(coll, Comparators.<T>reverseOrder());
	}
}
