package StringPrograms;

import java.util.LinkedHashSet;

public class Vowels {

	public static void main(String[] args) {
		String s= "india";
		int count=0;
		for (int i = 0; i < s.length(); i++) {
		if (s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u') {
				count++;
			}	
		}
		System.out.println("number of vowel count= "+ count);
	}
}
