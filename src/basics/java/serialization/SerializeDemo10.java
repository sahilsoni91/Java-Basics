package basics.java.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo10 {

	/*
	 * Serialization wrt Inheritance Example
	 * Parent not implements Serializable and not have default constructor
	 * Child implements Serializable cause runtime exception
	 */
	public static void main(String[] args) throws Exception {
			Child3 c = new Child3();
			c.i = 888;
			c.j = 999;

			System.out.println(c.i + "		" + c.j);
			
			//Serialization Process
			FileOutputStream fos = new FileOutputStream("abc.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(c); 

			//Deserialization Process
			FileInputStream fis = new FileInputStream("abc.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Child3 c1 = (Child3)ois.readObject();

			System.out.println(c1.i + "		" + c1.j);
	}
}
