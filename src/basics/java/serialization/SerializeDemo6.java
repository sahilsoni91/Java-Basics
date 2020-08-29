package basics.java.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo6 {

	/*
	 * Customized Serialization Example - 1
	 */
	public static void main(String[] args) throws Exception {
			Account a = new Account();

			System.out.println(a.username + "		" + a.password);
			
			//Serialization Process
			FileOutputStream fos = new FileOutputStream("abc.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			/*
			 * oos.writeObject checks that object(a) class implemented writeObject method or not.
			 * If yes, ecxecute that method for serialization
			 * Else perform default serailization provided by JVM.
			 */
			oos.writeObject(a); 

			//Deserialization Process
			FileInputStream fis = new FileInputStream("abc.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			/*
			 * ois.readObject checks that object read from file class implemented readObject method or not.
			 * If yes, execute that method for deserialization
			 * Else perform default deserailization provided by JVM.
			 */
			Account a1 = (Account)ois.readObject();

			System.out.println(a1.username + "		" + a1.password);
	}
}
