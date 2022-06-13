package javaPrograms;

public class AdditionOfNum {
	public static void main(String[]args) {
		int n= 569;
		while(n>9) {
		int sum=0;
		
		while (n>0) {
		int m= n%10;
		sum=sum+m;
		n= n/10;
		}
		n=sum;
		}
		System.out.println("sum= "+n);
		}
}
	