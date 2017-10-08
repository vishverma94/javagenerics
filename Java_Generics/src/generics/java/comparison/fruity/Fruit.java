/**
 * 
 */
package generics.java.comparison.fruity;

/**
 * @author vishalverma
 *
 */
public class Fruit implements Comparable<Fruit> {
	protected String name;
	protected int size;

	protected Fruit() {
	}

	protected Fruit(String name, int size) {
		this.name = name;
		this.size = size;
	}

	@Override
	public int hashCode() {
		return name.hashCode() * 29 + size;
	}

	/**
	 * Returns -1 if size of this object is smaller. 0 If size of this object is
	 * equals to the size of the comparing object 1 if size of this object is
	 * greater than the compared object
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Fruit that) {

		return this.size < that.size ? -1 : this.size == that.size ? 0 : 1;
	}
}
