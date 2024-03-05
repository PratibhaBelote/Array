package array;

public class negPositive {

	public static void main(String[] args) {
		
		int[] a={-2,56,-18,-55,30,13,07};
		
		for(int i=0;i<a.length;i++)
		{
			int min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]>a[min])
				{
					min=j;
				}
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i]+" ");
		}

	}

}
