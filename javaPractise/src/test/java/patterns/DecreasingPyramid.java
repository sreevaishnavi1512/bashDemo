package patterns;

public class DecreasingPyramid {
	public static void main(String[]args) {
		int m=5; 
		for (int i=1; i<=m; i++) {
		for (int j=i; j<=m; j++) {
			System.out.print("* ");
		}
			System.out.println();
		}
	}


}
