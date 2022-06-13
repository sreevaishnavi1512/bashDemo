package StringPrograms;

public class Reverse2ndVariableWithoutLength {
	public static void main(String[] args) {
		String s= "TestYantra";
		String r="";
		//System.out.println(s.length());
		char[] conChar=s.toCharArray();
		int count=0;
		for (char c : conChar) {
			count++;
		}
		System.out.println(count);
		for (int i = s.length()-1; i>=0; i--) {
			r= r+s.charAt(i);
		}
		System.out.println(r);
	}
}	