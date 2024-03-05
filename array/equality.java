package array;

public class equality {

	public static void main(String[] args) {
		
		int[] a= {10,20,30,40,50};
		
		int[] b= {10,20,30,40,60};
		int cnt=0;
		
		if(a.length==b.length)
		{
			for(int i=0;i<a.length;i++) 
			{
				if (a[i]==b[i])
				{
					 cnt++;
				}
						
			}
			if(cnt==a.length)
			{
				System.out.println("Same");
			}
			else
			{
				System.out.println("Not same");
			}
			
			
	    }
		else
			System.out.println("Not same");
		}

	}


