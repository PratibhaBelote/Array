package array;

public class rev {

	public static void main(String[] args) {
		
		int[] a= {20,30,40,50,60};
		//for(int i=0;i<a.length;i++)
		//System.out.print(a[i]+" ");
		 int start=0;
		 int end=a.length-1;
		 
		 while(start<end)
		 {
			 int temp=a[start];
			 a[start]=a[end];
			 a[end]=temp;
			 
			 start++;
			 end--;
		 }
		// System.out.println();
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.print(a[i]+" ");
		 }
		 

	}

}
