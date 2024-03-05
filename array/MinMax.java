package array;

public class MinMax {

	public static void main(String[] args) {
		
		int[] a= {40,50,30,20,80};
		
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(min);
		
        int max=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
		
		
		System.out.println(max-min);

	}

}
