/**
 * 
 */
package generics.java.erasure;

import java.util.List;

/**
 * 
 * Checking erasure overloading
 * 
 * @author vishalverma
 *
 */
public class OverloadedClass {
	public static int dummy(List<Integer> dummyList) {
		return 0;
	}
	/*
	 * Can't Do this , since erasure is same
	 * 
	 * public static String dummy(List<String> dummyList) { return null; }
	 */
}
