package basics.java.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericDemo1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		List<String> list1 = new ArrayList<String>();
		Collection<String> list2 = new ArrayList<String>();
		
		/*
		 * Compile time error : incompatible type
		 */
//		Collection<Object> list3 = new ArrayList<String>();
		
		/*
		 * Compile time error : unexpected type
		 */
//		ArrayList<int> list4 = new ArrayList<int>();
	}
}
