package StringPrograms;

import java.util.LinkedHashSet;

public class PositionOfParticularChar {
	public static void main(String[] args) {
		String s="Tester";
		
		s=s.toLowerCase();
		LinkedHashSet<Character> hs= new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			hs.add(s.charAt(i));
		}
		for (Character ch : hs) {
			int count = 0;
			for (int i = s.length()-1; i>=0; i--) {
				if(ch.equals(s.charAt(i))) {
			
					System.out.println(ch +" position is "+ (i+1));
					break;
				}
			}
		}
}
}