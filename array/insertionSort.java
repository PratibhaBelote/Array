package array;

public class insertionSort {

	public static void main(String[] args) {
		
		int[] a= {22,55,33,11,20,52,60};
		
		for(int i=1;i<a.length;i++)
		{
			int temp=a[i];        //element shift karaycha mhtlyas jo shift krta to override hoto mhnun store kaarun tevala 
			int j=i-1;            //j loop cha baher print karaycha ahe mhanun j loop cha baher kadhala
			for(;j>=0;j--)
			{
				if(a[j]>temp)
				{
					a[j+1]=a[j];  //jr a[j] motha asel tr re 1st element 2nd element cha jagi shift hoto
				}
				else
				{
					break;
				}
			}
			
		
		   a[j+1]=temp;
		}
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
		

	}

}
