package basics.java.generics;

public class Gen<T> {

	T ob;
	
	Gen(T ob){
		this.ob = ob;
	}
	
	public void show() {
		System.out.println("Parameter Type : " + ob.getClass().getName());
	}
	
	public T get() {
		return ob;
	}
}
