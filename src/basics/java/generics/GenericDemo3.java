package basics.java.generics;

import java.util.ArrayList;

public class GenericDemo3 {
	
	public static void main(String[] args) {
		Gen1<Integer> g1 = new Gen1<Integer>();
		Gen1<String> g2 = new Gen1<String>();
		
		Gen2<Integer> g3 = new Gen2<Integer>();
		/*
		 * Compile time error : Type parameter is not within its bound
		 */
//		Gen2<String> g4 = new Gen2<String>();
		
		Gen3<Thread> g5 = new Gen3<Thread>();
		/*
		 * Compile time error : Type parameter is not within its bound
		 */
//		Gen3<Integer> g6 = new Gen3<Integer>();
		Gen3<Runnable> g7 = new Gen3<Runnable>();
	}
}
