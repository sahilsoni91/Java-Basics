package basics.java.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo11 {

	/*
	 * Externalization Example
	 */
	public static void main(String[] args) throws Exception {
			ExternalDemo1 e = new ExternalDemo1("sahil", 10, 20);

			System.out.println(e.name + "		" + e.i + "		" + e.j);
			
			//Serialization Process
			FileOutputStream fos = new FileOutputStream("abc.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(e); 

			//Deserialization Process
			FileInputStream fis = new FileInputStream("abc.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ExternalDemo1 e1 = (ExternalDemo1)ois.readObject();

			System.out.println(e1.name + "		" + e1.i + "		" + e1.j);
	}
}
