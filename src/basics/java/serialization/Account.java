package basics.java.serialization;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account implements Serializable {

	String username = "sahil";
	transient String password = "soni";
	
	private void writeObject(ObjectOutputStream oos) throws Exception {
		oos.defaultWriteObject();	//Perform default serialization
		String encryptPwd = "123" + password;
		oos.writeObject(encryptPwd);
	}
	
	private void readObject(ObjectInputStream ois) throws Exception {
		ois.defaultReadObject();	//Perform default deserialization
		String encryptPwd = (String)ois.readObject();
		password = encryptPwd.substring(3);
	}
}
