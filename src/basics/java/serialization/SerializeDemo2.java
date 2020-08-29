package basics.java.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo2 {

	/*
	 * transient keyword Example
	 */
	public static void main(String[] args) throws Exception {
			Demo2 d1 = new Demo2();

			//Serialization Process
			FileOutputStream fos = new FileOutputStream("abc.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(d1);

			//Deserialization Process
			FileInputStream fis = new FileInputStream("abc.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Demo2 d2 = (Demo2)ois.readObject();

			System.out.println(d2.i + "    " + d2.j);
	}
}
