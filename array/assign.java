package array;

public class assign {

	public static void main(String[] args) {
		
		int[] a= {0,1,1,0,0,1};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				a[i]=1;
			}
	
		}
		for(int i=0;i<a.length;i++)
		System.out.println(a[i]);
		
		

	}

}
