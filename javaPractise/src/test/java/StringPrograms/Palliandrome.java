package StringPrograms;

public class Palliandrome {
	public static void main(String[] args) {
		String s= "racecar";
		String r="";
		char[] conChar=s.toCharArray();
		int count=0;
		for (char c : conChar) {
			count++;
		}
		System.out.println(count);

	for (int i = count-1; i>=0; i--) {
		r= r+s.charAt(i);
	}
	System.out.println(r);
	if (r.equals(s)) {
		System.out.println("it is palliandrome");
	} else {
		System.out.println("it is not palliandrome");
	}
}
}