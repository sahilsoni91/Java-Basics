package basics.java.generics;

import java.util.ArrayList;

public class GenericDemo5 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("sahil");
		list.add("sandeep");
		list.add("santosh");
		nonGenericMethod(list);
		System.out.println(list);
		/*
		 * Compile time error : incompatible type
		 */
//		list.add(10);
	}
	
	public static void nonGenericMethod(ArrayList list){
		list.add(10);
		list.add(true);
	}
}
