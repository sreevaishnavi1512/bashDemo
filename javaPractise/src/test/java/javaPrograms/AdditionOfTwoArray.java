package javaPrograms;

public class AdditionOfTwoArray {
	public static void main(String[]args) {
		int [] a= {2,4,1,6,8};
		int [] b= {1,5,7,3};
		int [] c ; //expected o/p= 3 9 8 9 8
		
		if (a.length>b.length) 
		{
			c = new int[a.length];
		}
		else
		{
			c= new int[b.length];
		}
		for (int i = 0; i < c.length; i++) 
		{
			try { 
				c[i]= a[i] + b[i];
			}
		catch(Exception e) {
		c[i]=a[i];
		}
}
for (int j = 0; j < c.length; j++) {
			System.out.println(c[j]);
		}
		}}


