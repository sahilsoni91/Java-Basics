package basics.java.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ExternalDemo2 implements Externalizable {

	String name;
	int i;
	int j;
	
	public ExternalDemo2(String name, int i, int j) {
		super();
		this.name = name;
		this.i = i;
		this.j = j;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeInt(j);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String)in.readObject();
		j = in.readInt();
	}
	
	
}
