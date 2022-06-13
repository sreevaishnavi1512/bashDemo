package StringPrograms;

public class ReverseString3 {
	public static void main(String[] args) {
		String s="khathamtatabyebye";
		String [] str = s.split(" ");
		System.out.println(s.length());
		for (int i = 0; i < str.length; i++) {
			if(i==str.length-3) {
				System.out.print(" ");
			}
			System.out.print(str[i]);
		}
	}
		}

