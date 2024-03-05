package array;

public class max { //Max and SecMax 

	public static void main(String[] args) {
		int[] a= {10,60,82,23,56};
		 
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
			
			max=a[i];
			}
				
		}
		System.out.println(max); // aadhi max kadhala aani mg second max kadhala
		
		
		
		int secMax=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>secMax && a[i]!=max)
			{
				secMax=a[i];
			}
		}
		System.out.println(secMax);

	}

}
