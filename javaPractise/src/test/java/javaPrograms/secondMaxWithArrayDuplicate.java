package javaPrograms;

public class secondMaxWithArrayDuplicate {
	public static void main(String[]args) {
		int[]a= {1,3,1,7,7};
		int fmax = a[0]; 
		int smax = a[0];
		for (int i = 0; i < a.length; i++) //0<4, 1<4,2<4,3<4
		if(a[i]>fmax) {
			smax=fmax;
			fmax=a[i];
		}else if (smax==fmax) {
			smax=a[i];
		}
		System.out.println(fmax);
		System.out.println(smax);
}
}