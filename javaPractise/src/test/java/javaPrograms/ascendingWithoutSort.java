package javaPrograms;

public class ascendingWithoutSort {
public static void main(String[]args) {
	int[] a= {4,5,2,3}; //5
	int fmax= a[0];
	for (int i=0; i< a.length;i++)
		if(a[i]>fmax)
		{
			fmax=a[i];
		}
	System.out.println(fmax);
}
}

