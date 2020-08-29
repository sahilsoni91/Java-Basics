package basics.java.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo1 {

	/*
	 * Serialization Example
	 */
	public static void main(String[] args) throws Exception {
			Demo1 d1 = new Demo1();

			//Serialization Process
			FileOutputStream fos = new FileOutputStream("abc.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(d1);

			//Deserialization Process
			FileInputStream fis = new FileInputStream("abc.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Demo1 d2 = (Demo1)ois.readObject();

			System.out.println(d2.i + "    " + d2.j);
	}
}
