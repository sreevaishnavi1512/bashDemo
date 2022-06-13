
public class Assignment {
	
		int x = 10;
		static int z = 20;
		
		public void test() {
			System.out.println(x);
			System.out.println(z);
		}
		public static void testOne() {
			System.out.println(z);
		}
		public static void main(String[]args) {
			Assignment s = new Assignment();
			s.test();
			s.testOne();
			
			
		//	test();
			testOne();
			
	}
}
