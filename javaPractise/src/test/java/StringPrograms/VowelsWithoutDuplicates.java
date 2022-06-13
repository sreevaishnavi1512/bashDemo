package StringPrograms;

import java.util.LinkedHashSet;

public class VowelsWithoutDuplicates {
	public static void main(String[] args) {
		String s= "india";
		int count=0;
		LinkedHashSet<Character> hs= new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
		hs.add(s.charAt(i));
		}
		for (Character ch : hs) {
		
		if (ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
				count++;
			}	
		}
		System.out.println("number of vowels without duplicates= " + count);
	}
}


