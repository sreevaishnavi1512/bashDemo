package StringPrograms;

public class ReverseStringSen2 {
	public static void main(String[] args) {
		String s="khatham ta ta bye bye";
		String [] str = s.split(" ");
		for (int i=str.length-1;i>=0; i--) {
			System.out.print(str[i]+" ");
		}
	}
}
