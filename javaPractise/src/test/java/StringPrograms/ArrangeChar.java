package StringPrograms;

import java.util.LinkedHashSet;

public class ArrangeChar {
	public static void main(String[] args) {
		String s="abcdabcdabcdabcd";
		LinkedHashSet<Character> hs= new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			hs.add(s.charAt(i));
		}
		for (Character ch : hs) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if(ch.equals(s.charAt(i))) {
					System.out.print(ch);
				}
			}
			System.out.print(" ");
		}
		}
	}

//output: aaaa bbbb cccc dddd 

