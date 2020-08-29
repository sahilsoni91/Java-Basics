package basics.java.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo7 {

	/*
	 * Customized Serialization Example - 2
	 */
	public static void main(String[] args) throws Exception {
			Employee e = new Employee();

			System.out.println(e.username + "		" + e.password + "		" + e.pin);
			
			//Serialization Process
			FileOutputStream fos = new FileOutputStream("abc.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			/*
			 * oos.writeObject checks that object(a) class implemented writeObject method or not.
			 * If yes, ecxecute that method for serialization
			 * Else perform default serailization provided by JVM.
			 */
			oos.writeObject(e); 

			//Deserialization Process
			FileInputStream fis = new FileInputStream("abc.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			/*
			 * ois.readObject checks that object read from file class implemented readObject method or not.
			 * If yes, execute that method for deserialization
			 * Else perform default deserailization provided by JVM.
			 */
			Employee e1 = (Employee)ois.readObject();

			System.out.println(e1.username + "		" + e1.password + "		" + e1.pin);
	}
}
