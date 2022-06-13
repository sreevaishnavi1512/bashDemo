package patterns;

public class pyramidAlpha {
	public static void main(String[]args) {
		int m=5;
		char ch='A';
		for(int i=1;i<=m;i++) {
		for(int j=i;j<=m;j++) {
			System.out.print("  ");
		}
		for(int j=1;j<i;j++) {
			System.out.print(ch++ +" ");	
		}for(int j=i;j>0;j--) {
			System.out.print(ch-- +" ");	
		}
		ch++;
		System.out.println();
		}
		}
	}