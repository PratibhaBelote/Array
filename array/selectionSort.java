package array;

public class selectionSort {

	public static void main(String[] args) {
	
		int[] a= {23,11,56,89,22};
		
		for(int i=0;i<a.length;i++)
		{	
		  int min=i;
		  for(int j=i+1;j<a.length;j++)
		  {
			if(a[j]<a[min])
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
