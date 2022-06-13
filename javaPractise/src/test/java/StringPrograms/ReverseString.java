package StringPrograms;

public class ReverseString {

	public static void main(String[] args) {
		String s= "Vaishnavi";
		for (int i=s.length()-1;i>=0; i--) {
			System.out.println(s.charAt(i));
		}
		System.out.println();
	}
}
