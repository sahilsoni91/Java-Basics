package basics.java.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo3 {

	/*
	 * static keyword Example
	 */
	public static void main(String[] args) throws Exception {
			Demo3 d1 = new Demo3();

			//Serialization Process
			FileOutputStream fos = new FileOutputStream("abc.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(d1);

			//Deserialization Process
			FileInputStream fis = new FileInputStream("abc.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Demo3 d2 = (Demo3)ois.readObject();

			System.out.println(d2.i + "    " + d2.j);
	}
}
