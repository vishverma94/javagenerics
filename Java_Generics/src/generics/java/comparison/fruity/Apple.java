/**
 * 
 */
package generics.java.comparison.fruity;

/**
 * 
 * {@link Apple} is class that represents Apple in the real life
 * @author vishalverma
 *
 */
public class Apple extends Fruit {
	/**
	 * The name of the apple fruit
	 * @see #getName()
	 * */
	private static final String APPLE = "Apple";
	
	protected Apple(String name, int size) {
		super(name, size);
	}
	
	public Apple(int size) {
		this(APPLE, size);
	}

}
