package javaPrograms;

public class Max1And2Max {
	public static void main(String[]args) {
		int[] a = {2,4,1,6,8 };
		int fmax= a[0]; //first max num
		int smax= a[0]; //second max num
		for (int i = 0; i<a.length; i++)
		{
			if (a[i]>fmax)
{
	smax= fmax;
	fmax= a[i];
}else if (a[i]>smax) 
{
	smax= a[i];
}
}
	System.out.println(fmax+ " " + smax);	
	}

}
