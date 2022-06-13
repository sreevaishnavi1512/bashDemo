package methodOverriding;

public class RunOverRiding {
	public static void main (String [] args) {
		C obj = new C();
		obj.test();
		
		B obj1 = obj;
		obj1.test();
		obj1.demo2();
		
		A obj2 = obj1;
		obj2.test();
		
		
	}
}
