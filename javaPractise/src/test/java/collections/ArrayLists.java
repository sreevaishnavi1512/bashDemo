package collections;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayLists {
public static void main(String[]args) {
	ArrayList set=new ArrayList<>();
	set.add(20110);
	set.add(30);
	set.add(63);
	set.add(2053);
	System.out.println(set);
	Collections.sort(set);
	
	Collections.reverse(set);
	System.out.println(set);
}
}
