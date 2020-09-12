package basics.java.generics;

public class GenericDemo2 {

	public static void main(String[] args) {
		Gen<String> g1 = new Gen<String>("Sahil");
		g1.show();
		System.out.println("Value : " + g1.get());
		
		Gen<Integer> g2 = new Gen<Integer>(10);
		g2.show();
		System.out.println("Value : " + g2.get());
		
		Gen<Double> g3 = new Gen<Double>(10.0);
		g3.show();
		System.out.println("Value : " + g3.get());
	}
}
