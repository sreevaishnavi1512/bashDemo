package patterns;

public class pyramidAlphaIncreasing {
	public static void main(String[]args) {
		int m=5;
		char ch='A';
		for(int i=1;i<=m;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}
		}
	}
