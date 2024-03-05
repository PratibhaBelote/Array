package array;

public class dubilcate {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,2,3};
		//int uniqeElment=0;
		
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
					cnt++;
			
			}
			if(cnt==0)
			{
				//uniqeElment++;
		      System.out.print(a[i]+" ");
			}
		}
		//System.out.println();
		//System.out.println(uniqeElment);
	}

}
