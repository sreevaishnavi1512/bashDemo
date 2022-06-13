package StringPrograms;

import java.util.HashSet;
import java.util.Iterator;

public class OccurenceOfChar {
	public static void main(String[] args) {
		String s="Tester";
		
		HashSet<Character> hs= new HashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			hs.add(s.charAt(i));
			}
		for (Character ch : hs) {
			int count=0;
			for (int i = 0; i < s.length(); i++) {
				if(ch.equals(s.charAt(i))) {
					count++;
				}
			}
			System.out.println( ch +" = " +count);
		}
		}
	}
//output:
//a = 2 r = 1 s = 1 t = 3 e = 1 y = 1 n = 1
