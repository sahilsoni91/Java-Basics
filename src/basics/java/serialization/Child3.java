package basics.java.serialization;

import java.io.Serializable;

public class Child3 extends Parent3 implements Serializable {

	public Child3() {
		super(10);		//To make program compile and run fine
		System.out.println("Child class default constructor.");
	}

	int j = 20;
}
