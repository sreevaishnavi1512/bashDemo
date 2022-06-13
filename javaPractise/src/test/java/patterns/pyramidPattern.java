package patterns;

public class pyramidPattern {
	public static void main(String[]args) {
		int m=5;
		for(int i=0;i<=m;i++) {
			for(int j=i;j<=m;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<i;j++) {
				System.out.print("* ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
