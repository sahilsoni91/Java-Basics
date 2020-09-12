package basics.java.generics;

import java.util.ArrayList;

public class GenericDemo4 {

	public static void main(String[] args) {
		ArrayList<?> list1 = new ArrayList<String>();
		/*
		 * Compile time error : incompatible types
		 */
//		ArrayList<? extends Number> list2 = new ArrayList<String>();
		ArrayList<? extends Number> list3 = new ArrayList<Integer>();
		/*
		 * Compile time error : unexpected type
		 */
//		ArrayList<?> list4 = new ArrayList<?>();
	}
}
