package basics.java.serialization;

import java.io.Serializable;

public class Child2 extends Parent2 implements Serializable {

	public Child2() {
		super();
		System.out.println("Child class default constructor.");
	}

	int j = 20;
}
