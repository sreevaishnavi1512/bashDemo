package StringPrograms;

public class ReverseWithoutLength {
	public static void main(String[] args) {
	String s= "TestYantra";
	//System.out.println(s.length());
	char[] conChar=s.toCharArray();
	int count=0;
	for (char c : conChar) {
		count++;
	}
	System.out.println(count);
	//to print count
	for(int i =count-1; i>=0; i--) {
		System.out.print(s.charAt(i));
	}
}
}