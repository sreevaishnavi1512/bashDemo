package javaPrograms;

public class printMinNum {
	public static void main(String[]args) {
		int [] a = {5,6,2,8,9};//2 5 6 8 9
		for (int i = 0; i < a.length; i++) 
		{
			// System.out.println(a[i]);//o/p-2 5 6 8 9
			for (int j=i+1; j<a.length;j++)
			{
				if (a[i]>a[j])
				{
					int temp = a[i];
					a[i]=a[j];
					a[j]= temp;
				}
			}
		}
		
System.out.println(a[0]); // 1st min num
System.out.println(a[1]); // 2st min num
}
}

