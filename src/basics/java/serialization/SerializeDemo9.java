package basics.java.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo9 {

	/*
	 * Serialization wrt Inheritance Example
	 * Parent not implements Serializable but Child implements Serializable
	 */
	public static void main(String[] args) throws Exception {
			Child2 c = new Child2();
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
			Child2 c1 = (Child2)ois.readObject();

			System.out.println(c1.i + "		" + c1.j);
	}
}
