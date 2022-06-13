package StringPrograms;

import java.util.LinkedHashSet;

public class ArrangeStringsentence {
	public static void main(String[] args) {
		String s="khatham ta ta bye bye";
		String [] str = s.split(" ");
		LinkedHashSet<String> hs= new LinkedHashSet<String>();
		for (int i = 0; i < str.length; i++) {
			hs.add(str[i]);
		}
		for (String ch : hs) {
			int count = 0;
			for (int i = 0; i < str.length; i++) {
				if (ch.equals(str[i])) {
					count++;
				}
			}
			System.out.println(ch+" = "+count);
		}
		}
}
//output: 
//khatham = 1
//ta = 2
//bye = 2