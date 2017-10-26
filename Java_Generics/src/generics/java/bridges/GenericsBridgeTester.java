/**
 * 
 */
package generics.java.bridges;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

/**
 * {@link GenericsBridgeTester} is used to show the bridge method using
 * compilation
 * 
 * @author vishalverma
 *
 */
public class GenericsBridgeTester {
	public static void main(String[] args) {
		for (Method m : Integer.class.getMethods()) {
			if (m.getName().equals("compareTo")) {
				System.out.println(m.toGenericString());
				for (Type type : m.getGenericParameterTypes()) {
					System.out.println("Type :" + type.toString());
				}
				
				/*
				 * Output
				 * 
				 * public int java.lang.Integer.compareTo(java.lang.Integer)
				 * public int java.lang.Integer.compareTo(java.lang.Object) ,
				 * Here Object is inserted by java
				 */
			}
		}
	}
}
