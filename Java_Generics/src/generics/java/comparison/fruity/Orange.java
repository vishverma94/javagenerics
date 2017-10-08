/**
 * 
 */
package generics.java.comparison.fruity;

/**
 * @author vishalverma
 *
 */
public class Orange extends Fruit {

	private static final String ORANGE = "Orange";

	protected Orange(String name, int size) {
		super(name, size);
	}

	public Orange(int size) {
		this(ORANGE, size);
	}

}
