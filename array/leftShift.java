package array;

public class leftShift {

	public static void main(String[] args) {
		
		int[] a= {2,3,5,6,8};
		
		int temp=a[0];
		
		for(int i=0;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		a[a.length-1]=temp;
		
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");

	}

}
