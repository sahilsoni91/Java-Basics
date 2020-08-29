package basics.java.serialization;

import java.io.Serializable;

public class Demo2 implements Serializable {
	int i = 10;
	transient int j = 20;
}
