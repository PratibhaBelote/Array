package array;

public class leader {  //jo motha element aahe tyachya wright side che sagale element tya peksha chote asle pahije


	public static void main(String[] args) {
		
		int[] a= {50,90,60,80,20};
		System.out.print("leader element is: ");
		
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]>a[i])
					cnt++;
			}
		
			if(cnt==0)
			{
				System.out.print(a[i]+" ");
			}
		}

	}

}
