/**
 * 
 */
package generics.java.comparison.fruity;

/**
 * @author vishalverma
 *
 */
public class Apple extends Fruit {

	private static final String APPLE = "Apple";

	protected Apple(String name, int size) {
		super(name, size);
	}

	public Apple(int size) {
		this(APPLE, size);
	}

}
