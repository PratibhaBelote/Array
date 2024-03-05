package array;

public class miniAvg {

	public static void main(String[] args) {
		
		int[] a= {3,7,90,20,5,50,40};
		int k=3;
		int minIndex=-1;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<=a.length-k;i++)
		{
			int sum=0;
			for(int j=i;j<i+k;j++)
			{
				sum=sum+a[j];
			}
			int avg=sum/k;
			if(avg<min)
			{
				min=avg;
				minIndex=i;
			}
		}
		System.out.println(min+" "+minIndex);

	}

}
