package StringPrograms;


public class VowelsStr {

	public static void main(String[] args) {
		String str[]= {"hi", "hello", "india"}; //o/p: hi=1, hello=2, india=3
		int count=0;
		for (int i = 0; i < str.length; i++) {
		for (int j = 0; j < str[i].length(); j++) {
			if (str[i].charAt(j)=='a'|| str[i].charAt(j)=='e'|| str[i].charAt(j)=='i'|| str[i].charAt(j)=='o'|| str[i].charAt(j)=='u') {
				count++;
			}
			}
		System.out.println(str[i]+"= "+count);
		}
		}
}


