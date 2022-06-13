package StringPrograms;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ReverseStringSen {
	public static void main(String[] args) {
		String s="khatham ta ta bye bye";
		String [] str = s.split(" ");
		 for (int i = 0; i < str.length; i++) {
			String r= str[i];
		
		for (int j=r.length()-1;j>=0; j--) {
			System.out.print(r.charAt(j));
		}
		System.out.print(" ");
	}
}}
