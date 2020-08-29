package basics.java.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo12 {

	/*
	 * Externalization Example give runtime exception at deserialization
	 */
	public static void main(String[] args) throws Exception {
			ExternalDemo2 e = new ExternalDemo2("sahil", 10, 20);

			System.out.println(e.name + "		" + e.i + "		" + e.j);
			
			//Serialization Process
			FileOutputStream fos = new FileOutputStream("abc.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(e); 

			//Deserialization Process
			FileInputStream fis = new FileInputStream("abc.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ExternalDemo2 e1 = (ExternalDemo2)ois.readObject();

			System.out.println(e1.name + "		" + e1.i + "		" + e1.j);
	}
}
