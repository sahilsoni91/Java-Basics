package basics.java.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo8 {

	/*
	 * Serialization wrt Inheritance Example
	 * Parent implements Serializable but Child not implements Serializable
	 */
	public static void main(String[] args) throws Exception {
			Child1 c = new Child1();

			System.out.println(c.i + "		" + c.j);
			
			//Serialization Process
			FileOutputStream fos = new FileOutputStream("abc.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(c); 

			//Deserialization Process
			FileInputStream fis = new FileInputStream("abc.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Child1 c1 = (Child1)ois.readObject();

			System.out.println(c1.i + "		" + c1.j);
	}
}
